package lib.ui.pages.factory;

import lib.ui.PlatformSelector;
import lib.ui.pages.android.AndroidMenuButtonObject;
import lib.ui.pages.android.AndroidMyListButtonObject;
import lib.ui.pages.interfaces.IMenuButtonObject;
import lib.ui.pages.interfaces.IMyListButtonObject;
import lib.ui.pages.ios.iOSMenuButtonObject;
import lib.ui.pages.ios.iOSMyListButtonObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MyListButtonFactory {
    public static IMyListButtonObject get(RemoteWebDriver driver) {
        if (PlatformSelector.PLATFORM == "ios") {
            return new iOSMyListButtonObject(driver);
        } else {
            return new AndroidMyListButtonObject(driver);
        }
    }
}
