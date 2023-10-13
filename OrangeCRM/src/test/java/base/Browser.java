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
 public static WebDriver launchSafari()
 {
	 System.setProperty("webdriver.safari.driver", "C:\\Users\\Nikhil\\Desktop\\Bharti Testing\\Automation Testing\\safaridriver_arm64\\safaridriver.exe");
     WebDriver driver = new EdgeDriver();
     return driver;
 }


}
