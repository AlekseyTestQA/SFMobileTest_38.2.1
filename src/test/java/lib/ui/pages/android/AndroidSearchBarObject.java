package lib.ui.pages.android;

import lib.ui.MainPageObject;
import lib.ui.pages.interfaces.IMenuButtonObject;
import lib.ui.pages.interfaces.ISearchBarObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidSearchBarObject extends MainPageObject implements ISearchBarObject {
    final static String INIT_SEARCH = "id:org.wikipedia:id/search_container";
    final static String RESULT_ELEMENT_BY_TEXT_MENU = "xpath://*[./*[contains(@text,'free')]]";

    public AndroidSearchBarObject(RemoteWebDriver driver) {
        super(driver);
    }

    public void initSearchBar() {
        WebElement searchInit = this.waitForElementPresent(
                INIT_SEARCH,
                "Cannot find Search Bar"
        );
        searchInit.click();
    }


    public void selectByTextSearchBar(String text) {
        WebElement expectedResult = this.waitForElementPresent(
                getResultElementByText(text),
                "Cannot find result: 'free'"
        );

        expectedResult.click();
    }

    private static String getResultElementByText(String text) {
        return RESULT_ELEMENT_BY_TEXT_MENU.replace("free", text);
    }
}