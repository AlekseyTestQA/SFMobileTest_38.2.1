package lib.ui.pages.ios;

import lib.ui.MainPageObject;
import lib.ui.pages.interfaces.IHistoryButtonObject;
import lib.ui.pages.interfaces.INearbyButtonObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSNearbyButtonObject extends MainPageObject implements INearbyButtonObject {
    final static String INIT_SEARCH = "id:org.wikipedia:id/menu_overflow_button";
    final static String RESULT_ELEMENT_BY_TEXT_MENU = "id:org.wikipedia:id/explore_overflow_settings";

    public iOSNearbyButtonObject(RemoteWebDriver driver) {
        super(driver);
    }

    public void initNearbyButton () {
        WebElement searchInit = this.waitForElementPresent(
                INIT_SEARCH,
                "Cannot find Search Wikipedia init search input"
        );
        searchInit.click();
    }
    public void selectByTextNearby(String text) {
        WebElement expectedResult = this.waitForElementPresent(
                getResultElementByText(text),
                "Cannot find result: 'Settings'"
        );

        expectedResult.click();
    }

    private static String getResultElementByText(String text) {
        return RESULT_ELEMENT_BY_TEXT_MENU.replace("Settings", text);


    }


}

