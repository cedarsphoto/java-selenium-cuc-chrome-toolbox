package com.PackageCode.driver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class WebDriverManager {

    // what does this do?
    private static WebDriver driver;

    public static WebDriver getCurrentDriver()
    {
        if(driver == null)
        {
            System.out.println("Thread has no driver - creating a new one");
            System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, ".\\drivers\\chromedriver.exe");
            setWebDriver(new ChromeDriver());
        }
        return driver;
    }

    public static void setWebDriver(WebDriver d)
    {
        driver = d;
    }

    public static void quitCurrentDriver() {
        System.out.println("Quitting the driver");
        driver.quit();
        driver = null;
    }

}
