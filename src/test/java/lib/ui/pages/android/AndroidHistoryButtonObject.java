package lib.ui.pages.android;

import lib.ui.MainPageObject;
import lib.ui.pages.interfaces.IHistoryButtonObject;
import lib.ui.pages.interfaces.IMyListButtonObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidHistoryButtonObject extends MainPageObject implements IHistoryButtonObject {
    final static String INIT_HISTORY = "xpath://android.widget.FrameLayout[@content-desc='History']/android.widget.ImageView";
    final static String RESULT_ELEMENT_BY_TEXT_MYLIST = "xpath://*[./*[contains(@text,'been')]]";

    public AndroidHistoryButtonObject(RemoteWebDriver driver) {
        super(driver);
    }

    public void initHistoryButton() {
        WebElement searchInit = this.waitForElementPresent(
                INIT_HISTORY,
                "Cannot find Search MyList button"
        );
        searchInit.click();
    }

    public void selectByTextHistory(String text) {
        WebElement expectedResult = this.waitForElementPresent(
                getResultElementByText(text),
                "Cannot find result: 'offline'"
        );

        expectedResult.click();
    }

    private static String getResultElementByText(String text) {
        return RESULT_ELEMENT_BY_TEXT_MYLIST.replace("been", text);
    }
}
