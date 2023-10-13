package TestORMPack;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass2 {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}

	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}


	@BeforeClass
	public void beforeClass2()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod2()
	{
		System.out.println("Before Method");
	}
	
	@Test
	public void Test5()
	{
		System.out.println("TestE");
		//Assert.fail();
	}
	
	@Test
	public void Test6()
	{
		System.out.println("TestF");
	}
	
	@Test(dependsOnMethods = {"Test5"})
	public void Test7()
	{
		System.out.println("TestG");
	}
	
	@AfterMethod
	public void afterMethod2()
	{
		System.out.println("After Method");
	}
    @AfterClass
    public void afterClass2()
    {
    	System.out.println("After Class");
    }
    
    @AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
    
    @AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}


}



