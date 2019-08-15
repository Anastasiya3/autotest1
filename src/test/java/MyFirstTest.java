import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://www.sharelane.com/");

        WebElement element1 = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[20]/td/p/a/b"));
        element1.click();


        WebElement element2 = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a"));
        element2.click();

        WebElement element3 = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input"));
        element3.click();

        element3.sendKeys( "55555");

        WebElement element4 = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));
        element4.click();

        WebElement element5 = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input"));
        element5.click();

        element5.sendKeys( "Nastya");

        WebElement element6 = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));
        element6.click();

        element6.sendKeys( "zvyagin.nastya3@gmail.com");

        WebElement element7 = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input"));
        element7.click();

        element7.sendKeys( "12345678");

        WebElement element8 = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input"));
        element8.click();

        element8.sendKeys( "12345678");

        WebElement element9 = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input"));
        element9.click();

        Thread.sleep(1000);

        driver.quit();


    }
}
