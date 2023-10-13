package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {
 public static WebDriver launchChrome()
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\Desktop\\Bharti Testing\\Manual Testing\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     return driver;
 }
 public static WebDriver launchEdge()
 {
	 System.setProperty("webdriver.msedge.driver", "C:\\Users\\Nikhil\\Desktop\\Bharti Testing\\Automation Testing\\edgedriver_arm64\\msedgedriver.exe");
     WebDriver driver = new EdgeDriver();
     return driver;
 }


}
