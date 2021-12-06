package lib.ui.pages.android;

import lib.ui.MainPageObject;
import lib.ui.pages.interfaces.ISettingsButtonObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidSettingButtonObject extends MainPageObject implements ISettingsButtonObject {

    final static String SEARCH_SETTINGS_BUTTON = "id:org.wikipedia:id/explore_overflow_settings";
    final static String RESULT_ELEMENT_BY_TEXT_TPL = "xpath://*[./*[contains(@text,'language')]]";

    public AndroidSettingButtonObject(RemoteWebDriver driver) {
        super(driver);
    }

    public void initSettingsButton () {
        WebElement searchInput = this.waitForElementPresent(
                SEARCH_SETTINGS_BUTTON,
                "Cannot find search input"
        );

        searchInput.click();
    }

    public void selectByTextSettings (String text) {
        WebElement expectedResult = this.waitForElementPresent(
                getResultElementByText(text),
                "Cannot find result: 'language'"
        );

        expectedResult.click();
    }

    private static String getResultElementByText(String text) {
        return RESULT_ELEMENT_BY_TEXT_TPL.replace("language", text);
    }
}
