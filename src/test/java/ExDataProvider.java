import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;
@Listeners(ExDataProviderListener.class)
public class ExDataProvider {
  @BeforeMethod
    public void beforeClass() {
        System.out.println("after class");
    }

 @AfterMethod
    public void afterClass(){
        System.out.println("after class");
    }

    @Test(dataProvider = "DataSource")
    public void searchGoogle(String URL, String items) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("q")).sendKeys(items);
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.quit();

    }
    @DataProvider(name = "DataSource",parallel=true)
    public Object [][] getData()
    {
        return new Object[][]
                {
                        {"https://www.google.com", "books"},
                        {"https://www.google.com", "computer"},
                        {"https://www.google.com", "ipad"},
                        {"https://www.google.com", "shirts"},
                        {"https://www.google.com", "dvd"},
                        {"https://www.google.com", "laptop"}

                };

    }
}
