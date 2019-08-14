package GoogleSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchWorld {

    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Oksana\\chromedriver\\chromedriver.exe");//Проверка наличия драйвера
        WebDriver driver = new ChromeDriver();//Это инициализация(вызов) драйвера
        driver.get("https://google.com");//открытие сайта
        driver.findElement(By.name("q")).clear();//через дев тулз на сайте находим обьект, смотрим через chropath name
        driver.findElement(By.name("q")).sendKeys("rei.com");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a[href='https://www.rei.com/']")).click();
        Thread.sleep(1000);
        if (driver.getTitle().contains("REI")) {
            System.out.println("test Passed");
        } else {
                System.out.println("test Failed" + driver.getTitle());
            }
        System.out.println("Title:" + driver.getTitle());
        driver.quit();
    }

}
