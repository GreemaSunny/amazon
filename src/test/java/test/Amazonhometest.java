package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.Amazonhomepage;

public class Amazonhometest extends Baseclass{
	@Test
	public void test() {
		Amazonhomepage ob=new Amazonhomepage(driver);
		  ob.search("mobilephones");
		  
		  String exptitle="Amazon.in : mobilephones";
			String acttitle=ob.actualtitle();
		    Assert.assertEquals(acttitle, exptitle);
		    
		    ob.additem();
	}
  
}
