package com.PackageTests.stepdefinitions;

import cucumber.api.Scenario;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import static com.PackageCode.driver.WebDriverManager.getCurrentDriver;
import static com.PackageCode.driver.WebDriverManager.quitCurrentDriver;
import static io.restassured.RestAssured.urlEncodingEnabled;

public class BeforeAfterSteps extends BaseSteps
{
    @After
    public void afterScenario(Scenario scenario)
    {
        System.out.println("Running post scenario activities");

        if (scenario.isFailed())
        {
            try
            {
                byte[] screenshot = ((TakesScreenshot) getCurrentDriver()).getScreenshotAs(OutputType.BYTES);
                String testName = scenario.getName();
                scenario.embed(screenshot, "image/png");
                scenario.write(testName);
            }
            catch   (WebDriverException wde)
            {
                System.err.println(wde.getMessage());

            }
            catch (ClassCastException cce)
            {
                cce.printStackTrace();
            }
        }
        quitCurrentDriver();
    }

    public void updateZephyr()
    {
        // RestAssured.proxy = host("proxyname.com").withPort(80);

        // urlEncodingEnabled(false);


    }


}
