package lib.ui.pages.ios;

import lib.ui.MainPageObject;
import lib.ui.pages.interfaces.IHistoryButtonObject;
import lib.ui.pages.interfaces.IMyListButtonObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSHistoryButtonObject extends MainPageObject implements IHistoryButtonObject {
    final static String INIT_SEARCH = "id:org.wikipedia:id/menu_overflow_button";
    final static String RESULT_ELEMENT_BY_TEXT_MENU = "id:org.wikipedia:id/explore_overflow_settings";

    public iOSHistoryButtonObject(RemoteWebDriver driver) {
        super(driver);
    }

    public void initMenuButton () {
        WebElement searchInit = this.waitForElementPresent(
                INIT_SEARCH,
                "Cannot find Search Wikipedia init search input"
        );
        searchInit.click();
    }
    public void selectByTextMenu(String text) {
        WebElement expectedResult = this.waitForElementPresent(
                getResultElementByText(text),
                "Cannot find result: 'Settings'"
        );

        expectedResult.click();
    }

    private static String getResultElementByText(String text) {
        return RESULT_ELEMENT_BY_TEXT_MENU.replace("Settings", text);
    }

    @Override
    public void initHistoryButton() {

    }

    @Override
    public void selectByTextHistory(String text) {

    }
}

