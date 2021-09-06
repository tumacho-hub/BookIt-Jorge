package com.bookit.step_definitions;

import com.bookit.pages.SelfPage;
import com.bookit.utilities.BookItApiUtil;
import com.bookit.utilities.BrowserUtils;
import com.bookit.utilities.ConfigurationReader;
import com.bookit.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MyInfoStepsDefs {
    private Environment;

    public void user_logs_in_using(String email, String password) {
        Driver.get().get(Environment.URL);
        Driver.get().manage().window().maximize();
        SignInPage signInPage = new SignInPage();
        signInPage.email.sendKeys(email);
        signInPage.password.sendKeys(password);
        BrowserUtils.waitFor(1);
        signInPage.signInButton.click();


    }

    @When("user is on the my self page")
    public void user_is_on_the_my_self_page() {
        SelfPage selfPage = new SelfPage();
        selfPage.goToSelf();


    }
}



