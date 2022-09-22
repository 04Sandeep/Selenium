package SeleniumPrograms;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathOrangeHRNM {
      static WebDriver driver;
      public static void orangelink()
      {
          System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
          driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      }

    public static void user()
    {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("");

    }

    public static void main(String[] args){
      orangelink();
      }
}




