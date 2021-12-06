package lib.ui.pages.factory;

import lib.ui.PlatformSelector;
import lib.ui.pages.android.AndroidMenuButtonObject;
import lib.ui.pages.android.AndroidSearchBarObject;
import lib.ui.pages.interfaces.IMenuButtonObject;
import lib.ui.pages.interfaces.ISearchBarObject;
import lib.ui.pages.ios.iOSMenuButtonObject;
import lib.ui.pages.ios.iOSSearchBarObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SearchBarFactory {
    public static ISearchBarObject get(RemoteWebDriver driver) {
        if (PlatformSelector.PLATFORM == "ios") {
            return new iOSSearchBarObject(driver);
        } else {
            return new AndroidSearchBarObject(driver);
        }
    }
}
