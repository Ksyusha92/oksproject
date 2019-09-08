package Dockers;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FailedRegistration {
    @Test
    public void start() {
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

        email.sendKeys("ksyu");
        password.sendKeys("test");
        button.click();

        WebElement warnalert = driver.findElement(By.xpath("//span[@id='register.emailError']"));

        if (warnalert.isDisplayed()) {
            System.out.println("Warning alert is displayed" + " " + warnalert.getText());
            driver.quit();
        } else {
            System.out.println("No warning alert is displayed" + " " + warnalert.getText());
            driver.quit();
        }

    }

    @Test
    public void validationEmail() {
        System.setProperty("webdriver.chrome.driver", "D:\\Oksana\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.dockers.com/US/en_US/login");
        WebElement email = driver.findElement(By.name("email"));
        WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-block btn-tertiary btn-join']"));

        email.click();
        button.click();

        WebElement warnalert = driver.findElement(By.xpath("//span[@id='register.emailError']"));

        if (warnalert.isDisplayed()) {
            System.out.println("Warning alert is displayed" + " " + warnalert.getText());
            driver.quit();
        } else {
            System.out.println("No warning alert is displayed" + " " + warnalert.getText());
            driver.quit();
        }
    }

    @Test
    public void validationPass() {
        System.setProperty("webdriver.chrome.driver", "D:\\Oksana\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.dockers.com/US/en_US/login");
        WebElement email = driver.findElement(By.name("email"));
        WebElement password = driver.findElement((By.name("pwd")));
        WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-block btn-tertiary btn-join']"));

        password.click();
        email.sendKeys("oksanamas2017@gmail.com");
        button.click();

        WebElement warnalert = driver.findElement(By.xpath("//span[@id='pwd.errors']"));
        if (warnalert.isDisplayed()) {
            System.out.println("Warning message is displayed" + "" + warnalert.getText());
            driver.quit();
        } else {
            System.out.println("No warning message is displayed" + "" + warnalert.getText());
            driver.quit();
        }
    }


    @Test
    public void wrongEmail() {
        System.setProperty("webdriver.chrome.driver", "D:\\Oksana\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.dockers.com/US/en_US/login");
        WebElement email = driver.findElement(By.name("email"));
        WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-block btn-tertiary btn-join']"));

        email.sendKeys("oksanamas2017gmail.com");
        button.click();

        WebElement warnalert = driver.findElement(By.xpath("//span[@id='register.emailError']"));
        if (warnalert.isDisplayed()) {
            System.out.println("Warning message is displayed" + "" + warnalert.getText());
            driver.quit();
        } else {
            System.out.println("No warning message is displayed" + "" + warnalert.getText());
            driver.quit();
        }
    }

    @Test
    public void wrongPass() {
        System.setProperty("webdriver.chrome.driver", "D:\\Oksana\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.dockers.com/US/en_US/login");
        WebElement email = driver.findElement(By.name("email"));
        WebElement password = driver.findElement((By.name("pwd")));
        WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-block btn-tertiary btn-join']"));

        password.sendKeys("aaaaaaa");
        email.sendKeys("oksanamas2017@gmail.com");
        button.click();

        WebElement warnalert = driver.findElement(By.xpath("//span[@id='pwd.errors']"));
        if (warnalert.isDisplayed()) {
            System.out.println("Warning message is displayed" + "" + warnalert.getText());
            driver.quit();
        } else {
            System.out.println("No warning message is displayed" + "" + warnalert.getText());
            driver.quit();
        }
    }
  
}
