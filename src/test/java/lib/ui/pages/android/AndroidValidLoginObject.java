package lib.ui.pages.android;

import lib.ui.MainPageObject;
import lib.ui.pages.interfaces.INoValidLoginObject;
import lib.ui.pages.interfaces.IValidLoginObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidValidLoginObject extends MainPageObject implements IValidLoginObject {

    final static String SEARCH_LOGIN_BUTTON = "id:org.wikipedia:id/explore_overflow_account_name";
    final static String INPUT_LOGIN = "id:org.wikipedia:id/login_username_text";
    final static String INPUT_PASS = "xpath:/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[2]/android.widget.FrameLayout/android.widget.EditText";
    final static String CLICK_LOGIN = "id:org.wikipedia:id/login_button";
    final static String RESULT_ELEMENT_BY_TEXT_TPL = "xpath://*[./*[contains(@text,'successfully')]]";

    public AndroidValidLoginObject(RemoteWebDriver driver) {
        super(driver);
    }

    public void initSearchLoginButton() {
        WebElement searchInput = this.waitForElementPresent(
                SEARCH_LOGIN_BUTTON,
                "Cannot find Login Buttton"
        );

        searchInput.click();
    }
    
    public void initInputLogin () {
        WebElement searchInput = this.waitForElementPresent(
                INPUT_LOGIN,
                "Cannot find Login input"
        );

        searchInput.sendKeys("Test2021SF2");
    }
    
    public void initInputPass () {
        WebElement searchInput = this.waitForElementPresent(
                INPUT_PASS,
                "Cannot find Pass input"
        );

        searchInput.sendKeys("poiuy123");
    }

    public void initClickLogin () {
        WebElement searchInput = this.waitForElementPresent(
                CLICK_LOGIN,
                "Cannot find Login Button"
        );

        searchInput.click();
    }

    public void selectByTextResultLogin (String text) {
        WebElement expectedResult = this.waitForElementPresent(
                getResultElementByText(text),
                "Cannot find result: 'successfully'"
        );

        expectedResult.click();
    }

    private static String getResultElementByText(String text) {
        return RESULT_ELEMENT_BY_TEXT_TPL.replace("successfully", text);
    }
}
