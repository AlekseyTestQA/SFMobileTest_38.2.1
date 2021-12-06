package lib.ui.pages.factory;

import lib.ui.PlatformSelector;
import lib.ui.pages.android.AndroidHistoryButtonObject;
import lib.ui.pages.android.AndroidMyListButtonObject;
import lib.ui.pages.interfaces.IHistoryButtonObject;
import lib.ui.pages.interfaces.IMyListButtonObject;
import lib.ui.pages.ios.iOSHistoryButtonObject;
import lib.ui.pages.ios.iOSMyListButtonObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HistoryButtonFactory {
    public static IHistoryButtonObject get(RemoteWebDriver driver) {
        if (PlatformSelector.PLATFORM == "ios") {
            return new iOSHistoryButtonObject(driver);
        } else {
            return new AndroidHistoryButtonObject(driver);
        }
    }
}
