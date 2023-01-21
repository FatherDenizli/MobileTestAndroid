package mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Sample {


    public AndroidDriver  driver;
    @Test
    public void test1() throws MalformedURLException{

// Create object of  DesiredCapabilities class and specify android platform
        DesiredCapabilities capabilities=new DesiredCapabilities();


// set the capability to execute test in chrome browser
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

// set the capability to execute our test in Android Platform
        //capabilities.setCapability(MobileCapabilityType.PLATFORM,Platform.ANDROID);

// we need to define platform name
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");

// Set the device name as well (you can give any name)
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"my phone");

        // set the android version as well
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");




        // Create object of URL class and specify the appium server address
        URL url= new URL("http://127.0.0.1:4723/wd/hub");
        capabilities.setCapability("appPackage", "com.android.chrome");
        capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");

  // Create object of  AndroidDriver class and pass the url and capability that we created
        WebDriver driver = new AndroidDriver(url, capabilities);

// Open url
        driver.get("http://www.facebook.com");

        // print the title
//        System.out.println("Title "+driver.getTitle());
//
//// enter username
//        driver.findElement(By.name("email")).sendKeys("mukesh@gmail.com");
//
//// enter password
//        driver.findElement(By.name("pass")).sendKeys("mukesh_selenium");
//
//// click on submit button
//        driver.findElement(By.id("u_0_5")).click();
//
//// close the browser
//        driver.quit();


        /*
    @BeforeTest
    public void setup() throws MalformedURLException, InterruptedException {


        DesiredCapabilities cap = new DesiredCapabilities();

     //   cap.setCapability("chromedriverExecutable",  "./src/test/java/resources/drivers/chromedriver.exe");
      // cap.setCapability("chromedriverExecutableDir",  System.getProperty("user.data")+"/resources/drivers/chromedriver.exe");


    //    Thread.sleep(15000);
        cap.setCapability("browserName", "chrome");
        //cap.setCapability("device", "android");

        cap.setCapability("deviceName", "Android Emulator");
        cap.setCapability("platformversion", "11.0");
        cap.setCapability("platformName", "Android");
        //cap.setCapability("deviceName", "Pixel 2 API 30");


//        cap.setCapability("appPackage", "com.android.chrome");
//        cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");

        cap.setCapability("appPackage", "com.android.chrome");
        Thread.sleep(5000);
        cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        Thread.sleep(5000);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));


        System.out.println("Pass");







    }

//            DesiredCapabilities cap = new DesiredCapabilities();
//            cap.setCapability("platformName", "Android");
//            cap.setCapability("platformVersion", "11.0");
//            cap.setCapability("app", "C:\\apkfiles\\ApiDemos.apk");
//            cap.setCapability("deviceName", "Android Emulator");
//            cap.setCapability("automationName", "UiAutomator2");


    @Test
    public void test() {
        // Open url
        driver.get("https://walmart.ca/");
        System.out.println("Pass");
      ///
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // print the title
       //

   //

// enter username
   //     driver.
// enter password

*/


    }
}