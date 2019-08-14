package GoogleSearch;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverWebElement {
    public static void main (String[]args) throws InterruptedException{
        System.setProperty("webdriver.gecko.driver","D:\\Oksana\\chromedriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        WebElement search = driver.findElement(By.name("q"));
        search.clear();
        search.sendKeys("store.dolcegabbana");
        search.click();
    }

}
