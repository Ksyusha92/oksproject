package Dockers;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuccessfulRegistration {
   @Test//notation without which we will can not run the test
   public void start () {
       System.setProperty("webdriver.chrome.driver", "D:\\Oksana\\chromedriver\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.dockers.com/US/en_US/login");

       WebDriverWait wait = new WebDriverWait(driver, 5);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='emailModal']")));
       WebElement close = driver.findElement(By.xpath("//div[@id='emailModal']//button"));
       close.click();

       WebElement email = driver.findElement(By.name("email"));
       WebElement password = driver.findElement(By.name("pwd"));
       WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-block btn-tertiary btn-join']"));

       email.sendKeys("oksanamas2007@gmail.com");
       password.sendKeys("test123!");
       button.click();
       WebElement alertsuccess = driver.findElement(By.xpath("//div[@class='alert alert-info']"));
       WebElement out = driver.findElement(By.xpath("//span[contains(text(),'Sign out')]"));

       if (alertsuccess.isDisplayed()) {
           System.out.println("successful registration!" + "" + alertsuccess.getText());
           out.click();
           driver.quit();
       } else {
           System.out.println("Failed registration!" + "" + driver.getTitle());
           driver.quit();
       }
   }

   }

