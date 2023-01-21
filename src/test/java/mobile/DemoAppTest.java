package mobile;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
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

        try {
            String appiumServerURL = "http://127.0.0.1:4723/wd/hub";

            DesiredCapabilities cap = new DesiredCapabilities();


            cap.setCapability("browsername", "chrome");
            cap.setCapability("platformName", "Android");
            cap.setCapability("platformVersion", "11.0");
            cap.setCapability("app", "C:\\apkfiles\\ApiDemos.apk");
            cap.setCapability("deviceName", "Android Emulator");



            driver = new AndroidDriver(new URL(appiumServerURL), cap);
        }catch(Exception e){
            System.out.println("NP");

        }
    }

    @Test
    public void  test1() throws InterruptedException {


        //Vertical scroling
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='NFC']")).click();//NFC

        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='ForegroundDispatch']")).click();//ForegroundDispatch

         driver.navigate().back();
         driver.navigate().back();

    }


    @Test
    public void  test2() throws InterruptedException {

        // Click preference
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Preference\"]")).click();

        //  Preference dependencies
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
        // Check box
        driver.findElement(By.id("android:id/title")).click();
        Thread.sleep(10000);
        driver.navigate().back();
        driver.navigate().back();


    }
    @Test
    public void  test3()   {


        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]")).click();

        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Seeking']")).click();

        driver.findElement(By.id("io.appium.android.apis:id/startButton")).click();

        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();


//        Actions actions=new Actions(driver);
//
//       // actions.dragAndDropBy(driver.findElement(By.id("io.appium.android.apis:id/seekBar"), )      dragAndDropBy().build().perform();
//         WebElement obj= driver.findElement(By.id("io.appium.android.apis:id/seekBar")) ;
//        TouchAction action=new TouchAction(driver);
//        action.longPress(ElementOption.element(obj)).moveTo(ElementOption.element(obj,200,200)).release();


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
