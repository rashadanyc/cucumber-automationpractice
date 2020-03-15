package cucumber.step;

import helper.CommonHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.messages.internal.com.google.common.net.MediaType;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CommonSteps {
    private static  WebDriver driver;
    @Before
    public void setUp(){
        driver= CommonHelper.loadWebDriver();

    }
   @After
    public void tearDown(Scenario scenario){
        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, String.valueOf(MediaType.PNG), scenario.getName());
        if  (driver != null){
            driver.quit();
        }
    }
    public static  WebDriver getDriver(){
        return driver;
    }

    @Given("I navigation to 'automation practice' website in the browser")
    public void i_navigation_to_website_in_the_browser() {
       // WebDriver driver = CommonHelper.loadWebDriver();
        driver.get(CommonHelper.getEnvironmentProperty("app.url"));
       // throw new io.cucumber.java.PendingException();
    }


}
