package demo;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.hc.core5.http.nio.entity.NoopEntityConsumer;
import org.openqa.selenium.JavascriptExecutor;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///

public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01()throws InterruptedException{
        System.out.println("Start Test case: testCase01");
        
        // 1. Launch Chrome :ChromeDriver();
        // 2. Load URL :https://www.irctc.co.in/nget/train-search
        driver.get("https://www.irctc.co.in/nget/train-search");
        Thread.sleep(3000);
        // 3. Locate The Search Box "From"  Using Locator "XPath":"(//input[@role='searchbox'])[1]" / click(): 
        WebElement fromSearchTxtBox = driver.findElementByXPath("(//input[@role='searchbox'])[1]");
        Thread.sleep(1000);
        fromSearchTxtBox.click();
        // 4. In the "From" search box Enter txt "blr" :sendKeys("blr");
        fromSearchTxtBox.sendKeys("blr");
        Thread.sleep(1000);
        // 5. Locate the First Result after entering text and Select it Using Locator "ID":"p-highlighted-option" /click();
        WebElement firstResult = driver.findElementById("p-highlighted-option");
        Thread.sleep(500);
        firstResult.click();
        // 6. Print the Selected Text :
        System.out.println("The Selected Text/Option in the From Text Box is : "+ firstResult.getText());
    
    }


}

