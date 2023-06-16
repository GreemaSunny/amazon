package test;

import org.testng.annotations.Test;

import page.Amazonpage;

public class Amazontest extends Baseclass{
	@Test
	public void test() {
		Amazonpage ob=new Amazonpage(driver);
		
		  ob.search("mobilephones");
		  
	}
  
}
