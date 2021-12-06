package lib.ui.pages.factory;

import lib.ui.PlatformSelector;
import lib.ui.pages.android.AndroidSettingButtonObject;
import lib.ui.pages.interfaces.ISettingsButtonObject;
import lib.ui.pages.ios.iOSSettingsButtonObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SettingsButtonFactory {
    public static ISettingsButtonObject get(RemoteWebDriver driver) {
        if (PlatformSelector.PLATFORM == "ios") {
            return new iOSSettingsButtonObject(driver);
        } else {
            return new AndroidSettingButtonObject(driver);
        }
    }
}
