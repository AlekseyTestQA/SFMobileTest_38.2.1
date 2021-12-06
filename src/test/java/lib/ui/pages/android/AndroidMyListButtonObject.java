package lib.ui.pages.android;

import lib.ui.MainPageObject;
import lib.ui.pages.interfaces.IMenuButtonObject;
import lib.ui.pages.interfaces.IMyListButtonObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidMyListButtonObject extends MainPageObject implements IMyListButtonObject {
    final static String INIT_MYLIST = "xpath://android.widget.FrameLayout[@content-desc='My lists']/android.widget.ImageView";
    final static String RESULT_ELEMENT_BY_TEXT_MYLIST = "xpath://*[./*[contains(@text,'offline')]]";

    public AndroidMyListButtonObject(RemoteWebDriver driver) {
        super(driver);
    }

    public void initMyListButton() {
        WebElement searchInit = this.waitForElementPresent(
                INIT_MYLIST,
                "Cannot find Search MyList button"
        );
        searchInit.click();
    }

    public void selectByTextMyList(String text) {
        WebElement expectedResult = this.waitForElementPresent(
                getResultElementByText(text),
                "Cannot find result: 'offline'"
        );

        expectedResult.click();
    }

    private static String getResultElementByText(String text) {
        return RESULT_ELEMENT_BY_TEXT_MYLIST.replace("offline", text);
    }
}
