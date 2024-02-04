package tripkenovisorotomasyon;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LoginTest {

    public AppiumDriver<WebElement> driver;
    public WebDriverWait wait;


    By pageButton = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]");
    By arayuz = By.xpath("//android.widget.Button[@content-desc=\"Open navigation menu\"]");
    By loginBtn = By.xpath("//android.view.View[@content-desc=\"Giriş Yap\"]");
    By mail = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    By pass = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    By loginBtn2 = By.xpath("//android.widget.Button[@content-desc=\"Giriş\"]");


    @BeforeTest

    public void beforeTest(){

        try{

            DesiredCapabilities cap;
            cap = new DesiredCapabilities();

            cap.setCapability("deviceName","Medium Phone API 34");
            cap.setCapability("platformName","Android");
            cap.setCapability("udid","emulator-5554");
            cap.setCapability("platformVersion", "14.0");
            cap.setCapability("appPackage", "com.example.vize");
            cap.setCapability("appActivity","com.example.vize.MainActivity");
            cap.setCapability("skipUnlock","true");
            cap.setCapability("noReset","false");

            driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
            wait = new WebDriverWait(driver,10);


        }

        catch (MalformedURLException mx){
           System.out.println("Hata");
        }
    }



    @Test

    public void test(){

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement pageButtonSelect = driver.findElement(pageButton);
        pageButtonSelect.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement arayuzSelect = driver.findElement(arayuz);
        pageButtonSelect.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement loginBtnSelect = driver.findElement(loginBtn);
        pageButtonSelect.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement mailSelect = driver.findElement(mail);
        driver.getKeyboard().pressKey("mail@gmail.com");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement passSelect = driver.findElement(pass);
        driver.getKeyboard().pressKey("12345");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement loginBtn2Select = driver.findElement(loginBtn2);
        pageButtonSelect.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }



    @AfterTest

    public void teardown(){

    }



}
