package mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
public class SelendroidAPKTest {

        public AndroidDriver driver;
    @BeforeTest
    public void test() throws MalformedURLException {

        try {
            DesiredCapabilities cap = new DesiredCapabilities();
            String url = "http://127.0.0.1:4723/wd/hub";
            cap.setCapability("platformName", "Android");
            cap.setCapability("platformVersion", "11.0");
            cap.setCapability("app", "C:\\apkfiles\\selendroid-test-app-0.17.0.apk");
            cap.setCapability("deviceName", "Android Emulator");
            cap.setCapability("automationName", "UiAutomator2");

            driver = new AndroidDriver(new URL(url), cap);

        }catch(Exception e){
            System.out.println("pass");
        }


    }

        @Test
        public void selendroidTest() {
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          driver.findElement(By.id("io.selendroid.testapp:id/my_text_field")).sendKeys("future");


        }


    }
