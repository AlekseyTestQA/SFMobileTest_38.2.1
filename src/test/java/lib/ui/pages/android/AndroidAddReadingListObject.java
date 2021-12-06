package lib.ui.pages.android;

import lib.ui.MainPageObject;
import lib.ui.pages.interfaces.IAddReadingListObject;
import lib.ui.pages.interfaces.IValidLoginObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidAddReadingListObject extends MainPageObject implements IAddReadingListObject {

    final static String SEARCH_INPUT_BAR = "id:org.wikipedia:id/search_container";
    final static String INPUT_SEARCH = "id:org.wikipedia:id/search_src_text";
    final static String CLICK_PIN = "xpath://android.widget.ImageView[@content-desc='Add this article to a reading list']";
    final static String CLICK_GOTIT = "id:org.wikipedia:id/onboarding_button";
    final static String CLICK_OK = "id:android:id/button1";
    final static String RESULT_ELEMENT_BY_TEXT_TPL = "xpath://*[./*[contains(@text,'{TEXT}')]]";
    final static String RESULT_ELEMENT_BY_ADD_LIST = "xpath://*[./*[contains(@text,'Added to My reading list')]]";

    public AndroidAddReadingListObject(RemoteWebDriver driver) {
        super(driver);
    }

    public void initSearchBar() {
        WebElement searchInit = this.waitForElementPresent(
                SEARCH_INPUT_BAR,
                "Cannot find Search Wikipedia init search input"
        );

        searchInit.click();
    }

    public void initInputSearchText(String text) {
        WebElement searchInput = this.waitForElementPresent(
                INPUT_SEARCH,
                "Cannot find search input"
        );

        searchInput.sendKeys(text);
    }

    public void selectByTextResult(String text) {
        WebElement expectedResult = this.waitForElementPresent(
                getResultElementByText(text),
                "Cannot find result: 'successfully'"
        );

        expectedResult.click();
    }

    private static String getResultElementByText(String text) {
        return RESULT_ELEMENT_BY_TEXT_TPL.replace("{TEXT}", text);
    }

    public void initClickPin() {
        WebElement searchInput = this.waitForElementPresent(
                CLICK_PIN,
                "Cannot find Pin Button "
        );

        searchInput.click();
    }

    public void initClickGotIt() {
        WebElement searchInput = this.waitForElementPresent(
                CLICK_GOTIT,
                "Cannot find GOTIT Button "
        );

        searchInput.click();
    }
    public void initClickOk() {
        WebElement searchInput = this.waitForElementPresent(
                CLICK_OK,
                "Cannot find OK Button "
        );

        searchInput.click();
    }

    public void selectByTextResultAddlist(String text) {
        WebElement expectedResult = this.waitForElementPresent(
                getResultElementByAddList(text),
                "Cannot find result: 'Added to My reading list'"
        );

        expectedResult.click();
    }

    private static String getResultElementByAddList(String text) {
        return RESULT_ELEMENT_BY_ADD_LIST.replace("Added to My reading list", text);
    }


}