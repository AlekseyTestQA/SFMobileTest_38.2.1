package lib.ui.pages.ios;

import lib.ui.MainPageObject;
import lib.ui.pages.interfaces.ILoginButtonObject;
import lib.ui.pages.interfaces.INoValidLoginObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSNoValidLoginObject extends MainPageObject implements INoValidLoginObject {
    final static String SEARCH_LOGIN_BUTTON = "id:org.wikipedia:id/explore_overflow_account_name";
    final static String INPUT_LOGIN = "id:org.wikipedia:id/explore_overflow_account_name";
    final static String INPUT_PASS = "id:org.wikipedia:id/explore_overflow_account_name";
    final static String CLICK_LOGIN = "id:org.wikipedia:id/explore_overflow_account_name";
    final static String RESULT_ELEMENT_BY_TEXT_TPL = "xpath://*[./*[contains(@text,'language')]]";

    public iOSNoValidLoginObject(RemoteWebDriver driver) {
        super(driver);
    }

    public void initSearchLoginButton() {
        WebElement searchInput = this.waitForElementPresent(
                SEARCH_LOGIN_BUTTON,
                "Cannot find search input"
        );

        searchInput.click();
    }

    public void initInputLogin () {
        WebElement searchInput = this.waitForElementPresent(
                INPUT_LOGIN,
                "Cannot find Login input"
        );

        searchInput.sendKeys("novalid");
    }

    public void initInputPass () {
        WebElement searchInput = this.waitForElementPresent(
                INPUT_PASS,
                "Cannot find Pass input"
        );

        searchInput.sendKeys("123123");
    }

    public void initClickLogin () {
        WebElement searchInput = this.waitForElementPresent(
                CLICK_LOGIN,
                "Cannot find Login Button"
        );

        searchInput.sendKeys("123123");
    }

    public void selectByTextResultLogin (String text) {
        WebElement expectedResult = this.waitForElementPresent(
                getResultElementByText(text),
                "Cannot find result: ''"
        );

        expectedResult.click();
    }

    private static String getResultElementByText(String text) {
        return RESULT_ELEMENT_BY_TEXT_TPL.replace("Login", text);
    }
}

