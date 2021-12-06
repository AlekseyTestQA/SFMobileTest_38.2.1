package lib.ui.pages.factory;

import lib.ui.PlatformSelector;
import lib.ui.pages.android.AndroidMenuButtonObject;
import lib.ui.pages.interfaces.IMenuButtonObject;
import lib.ui.pages.ios.iOSMenuButtonObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MenuButtonFactory {
    public static IMenuButtonObject get(RemoteWebDriver driver) {
        if (PlatformSelector.PLATFORM == "ios") {
            return new iOSMenuButtonObject(driver);
        } else {
            return new AndroidMenuButtonObject(driver);
        }
    }
}
