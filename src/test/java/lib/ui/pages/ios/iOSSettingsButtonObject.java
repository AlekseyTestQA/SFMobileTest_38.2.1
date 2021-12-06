package lib.ui.pages.ios;

import lib.ui.MainPageObject;
import lib.ui.pages.interfaces.ISettingsButtonObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSSettingsButtonObject extends MainPageObject implements ISettingsButtonObject {
    final static String SEARCH_INPUT = "id:org.wikipedia:id/explore_overflow_settings";
    final static String RESULT_ELEMENT_BY_TEXT_TPL = "xpath://*[./*[contains(@text,'language')]]";

    public iOSSettingsButtonObject(RemoteWebDriver driver) {
        super(driver);
    }

    public void initSettingsButton() {
        WebElement searchInput = this.waitForElementPresent(
                SEARCH_INPUT,
                "Cannot find search input"
        );

        searchInput.sendKeys();
    }

    public void selectByTextSettings(String text) {
        WebElement expectedResult = this.waitForElementPresent(
                getResultElementByText(text),
                "Cannot find result: 'language"
        );

        expectedResult.click();
    }

    private static String getResultElementByText(String text) {
        return RESULT_ELEMENT_BY_TEXT_TPL.replace("language", text);
    }
}
