package lib.ui.pages.android;

import lib.ui.MainPageObject;
import lib.ui.pages.interfaces.ILoginButtonObject;
import lib.ui.pages.interfaces.ISettingsButtonObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidLoginButtonObject extends MainPageObject implements ILoginButtonObject {

    final static String SEARCH_LOGIN_BUTTON = "id:org.wikipedia:id/explore_overflow_account_name";
    final static String RESULT_ELEMENT_BY_TEXT_TPL = "id:org.wikipedia:id/login_button";

    public AndroidLoginButtonObject(RemoteWebDriver driver) {
        super(driver);
    }

    public void initLoginButton () {
        WebElement searchInput = this.waitForElementPresent(
                SEARCH_LOGIN_BUTTON,
                "Cannot find login button"
        );

        searchInput.click();
    }

    public void selectByTextLogin (String text) {
        WebElement expectedResult = this.waitForElementPresent(
                getResultElementByText(text),
                "Cannot find result: 'Login'"
        );

        expectedResult.click();
    }

    private static String getResultElementByText(String text) {
        return RESULT_ELEMENT_BY_TEXT_TPL.replace("Login", text);
    }
}
