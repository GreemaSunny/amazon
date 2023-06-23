package page;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Amazonhomepage {
WebDriver driver;

By search=By.id("twotabsearchtextbox");
By phone=By.xpath("//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a");
By addtocart=By.id("add-to-cart-button");
By cart=By.xpath("//*[@id='attach-sidesheet-view-cart-button']/span/input");

public Amazonhomepage(WebDriver driver)
{
this.driver=driver;
}

public void search(String s) {
	driver.findElement(search).sendKeys(s,Keys.ENTER);	
}

public String actualtitle() {
	try {
	String act=driver.getTitle();
	System.out.println(act);
	return act;
	}catch(Exception e){
		System.out.println(e.getMessage());
		return "error";	
	}
	
}

public void additem() {
	String parentwindow=driver.getWindowHandle();
	driver.findElement(phone).click();
	Set<String>allwindows=driver.getWindowHandles();
	for(String handle:allwindows) {
		if(!handle.equalsIgnoreCase(parentwindow)) {
			driver.switchTo().window(handle);
			driver.findElement(addtocart).click();
			driver.findElement(cart).click();
			//driver.close();
		}
		//driver.switchTo().window(parentwindow);
		//driver.quit();
	}
	
}

}