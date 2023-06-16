package page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Amazonpage {
WebDriver driver;

By search=By.id("twotabsearchtextbox");
By phone=By.xpath("//div[@id='s-skipLinkTargetForMainSearchResults']/span");
By cart=By.id("add-to-cart-button");

public Amazonpage(WebDriver driver)
{
this.driver=driver;
}

public void search(String s) {
	driver.findElement(search).sendKeys(s,Keys.ENTER);
	String act=driver.getTitle();
	String exp="Amazon.in:mobilephones";
	assert.assertEquals(act, exp);
	driver.findElement(phone).click();
	driver.findElement(cart).click();
	
}
}