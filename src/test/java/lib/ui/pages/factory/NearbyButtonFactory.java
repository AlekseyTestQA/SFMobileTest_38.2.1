package lib.ui.pages.factory;

import lib.ui.PlatformSelector;
import lib.ui.pages.android.AndroidHistoryButtonObject;
import lib.ui.pages.android.AndroidNearbyButtonObject;
import lib.ui.pages.interfaces.IHistoryButtonObject;
import lib.ui.pages.interfaces.INearbyButtonObject;
import lib.ui.pages.ios.iOSHistoryButtonObject;
import lib.ui.pages.ios.iOSNearbyButtonObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NearbyButtonFactory {
    public static INearbyButtonObject get(RemoteWebDriver driver) {
        if (PlatformSelector.PLATFORM == "ios") {
            return new iOSNearbyButtonObject(driver);
        } else {
            return new AndroidNearbyButtonObject(driver);
        }
    }
}
