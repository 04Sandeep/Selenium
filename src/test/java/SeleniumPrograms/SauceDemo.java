package SeleniumPrograms;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {
static WebDriver driver;
   public static void setup()
   {
     System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://www.saucedemo.com/");
   }
    public static void userpassword()
     {
      driver.findElement(By.name("user-name")).sendKeys("standard_user");
      driver.findElement(By.name("password")).sendKeys("secret_sauce");
      driver.findElement(By.id("login-button")).click();
      }
    public static void Verification(String locator, String Expected)
    {
        String actual= driver.findElement(By.xpath(locator)).getText();
        Assert.isTrue(actual.contains(Expected), "Expected condition");
    }
    public static void addtocart()
      {
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
      }
    public static void Verification1(String locator, String Expected)
    {
        String actual= driver.findElement(By.xpath(locator)).getText();
        Assert.isTrue(actual.contains(Expected), "Expected condition");
    }
      public static void checkout()
      {
          driver.findElement(By.id("checkout")).click();

      }
      public static void name()
      {
          driver.findElement(By.name("firstName")).sendKeys("sandeep");
          driver.findElement(By.name("lastName")).sendKeys("kaur");
          driver.findElement(By.name("postalCode")).sendKeys("125055");
          driver.findElement(By.name("continue")).click();
          driver.findElement(By.name("finish")).click();
      }
    public static void main(String[] args)
    {
      setup();
      userpassword();
      Verification("//span[@class='title']", "PRODUCTS");
      addtocart();
      Verification1("//div[@class= 'inventory_item_name']", "Sauce Labs Bike Light");
      checkout();
      name();

    }
}
