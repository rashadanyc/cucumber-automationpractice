package cucumber.step;

import io.cucumber.java.en.Given;
import pageobject.NavigationPage;

public class NavigationSteps {
    @Given("I hoverover on'WOMEN' tab in home page")
    public void i_hoverover_on_WOMEN_tab_in_home_page() {
        new NavigationPage(CommonSteps.getDriver()).hoverOverWomenTab();
    }
}