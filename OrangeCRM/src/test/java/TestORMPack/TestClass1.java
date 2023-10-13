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

public class TestClass1 {
	
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
	public void beforeClass1()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod1()
	{
		System.out.println("Before Method");
	}
	
	@Test
	public void test1()
	{
		System.out.println("TestA");
	}
	
	@Test
	public void test2()
	{
		System.out.println("TestB");
		//Assert.fail();
	}
	
	@Test
	public void test3()
	{
		System.out.println("TestC");
		//Assert.fail();
	}
	
	@Test
	public void test4()
	{
		System.out.println("TestD");
	}
	
	
	
	@AfterMethod
	public void afterMethod1()
	{
		System.out.println("After Method");
	}
    @AfterClass
    public void afterClass1()
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

