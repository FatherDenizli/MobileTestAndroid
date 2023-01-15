package mobile;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DemoAppTest {



    public AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        String appiumServerURL ="http://127.0.0.1:4723/wd/hub";
        DesiredCapabilities cap = new DesiredCapabilities();
       cap.setCapability("platformName", "Android");
       cap.setCapability("platformVersion", "11.0");
       cap.setCapability("app",  "C:\\apkfiles\\ApiDemos.apk" );
       cap.setCapability("deviceName", "Android Emulator");
       cap.setCapability("automationName", "UiAutomator2");


         driver = new AndroidDriver (new URL(appiumServerURL),cap);

    }

    @Test
    public void firstTest() throws InterruptedException {
        //Vertical scroling
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='NFC']")).click();//NFC





    }

//         @AfterTest
//
//             public void tearDown(){
//
//             driver.close();
//
//
//         }




    }
