package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import junit.framework.Assert;

public class LaunchPage extends PageBase {
    public LaunchPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @iOSXCUITFindBy(accessibility = "button.logIn")
    MobileElement logInButton;


    public void verifyLogInButton(String expectedName){
        String actualName = logInButton.getText();
        Assert.assertEquals(expectedName, actualName);
    }

    public String getLogInButtonName(){
        return logInButton.getText();
    }

    public void clickLogInButton(){
         click(logInButton);
    }
}
