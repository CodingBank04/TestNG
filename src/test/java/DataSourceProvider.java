import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.IDataProviderMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataSourceProvider {
    @Test (dataProvider="DataSource")

    public void test1(String Url, String item, String name) throws InterruptedException {
        System.out.println(Url + "is being searched by " + item);

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get(Url);
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='q']")));
       // driver.findElement(By.cssSelector("input[name='q']")).sendKeys(item);
        driver.findElement(By.cssSelector("input[name='q']")).sendKeys(name);

        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name='q']")).sendKeys(Keys.ENTER);

    }
    @DataProvider(name = "DataSource")
    public Object[] getData()
    {
        return new Object[][]{
                {"http://www.google.com ", "computer", "n1"},
                {"http://www.google.com ", "phone", "n2"},
                {"http://www.google.com ", "ipad", "n3"},     };
    }
}
