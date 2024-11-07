package UI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

import static io.github.bonigarcia.wdm.WebDriverManager.*;

public class BasicWebDriverMethods {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();

        String currentUrl= driver.getCurrentUrl(); //gets the current url
        System.out.println(currentUrl);

        String title=driver.getTitle();
        System.out.println(title);

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        //driver.navigate().to("https://www.google.com");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        List<WebElement> webElements=driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
        System.out.println(webElements);

        driver.navigate().to("https://www.sugarcrm.com");
        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();

        String windowHandle=driver.getWindowHandle();
        System.out.println(windowHandle);

        driver.findElement(By.className("slide-buttons")).click();
        Set<String> windowHandles=  driver.getWindowHandles();
        System.out.println(windowHandles);


        driver.quit();


    }


}
