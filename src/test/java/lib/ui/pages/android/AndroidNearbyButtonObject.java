package lib.ui.pages.android;

import lib.ui.MainPageObject;
import lib.ui.pages.interfaces.IHistoryButtonObject;
import lib.ui.pages.interfaces.INearbyButtonObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidNearbyButtonObject extends MainPageObject implements INearbyButtonObject {
    final static String INIT_NEARBY = "xpath://android.widget.FrameLayout[@content-desc='Nearby']/android.widget.ImageView";
    final static String RESULT_ELEMENT_BY_TEXT_NEARBY = "xpath://*[./*[contains(@text,'Nearby')]]";

    public AndroidNearbyButtonObject(RemoteWebDriver driver) {
        super(driver);
    }

    public void initNearbyButton() {
        WebElement searchInit = this.waitForElementPresent(
                INIT_NEARBY,
                "Cannot find Search Nearby button"
        );
        searchInit.click();
    }

    public void selectByTextNearby(String text) {
        WebElement expectedResult = this.waitForElementPresent(
                getResultElementByText(text),
                "Cannot find result: 'Nearby'"
        );

        expectedResult.click();
    }

    private static String getResultElementByText(String text) {
        return RESULT_ELEMENT_BY_TEXT_NEARBY.replace("Nearby", text);
    }
}
