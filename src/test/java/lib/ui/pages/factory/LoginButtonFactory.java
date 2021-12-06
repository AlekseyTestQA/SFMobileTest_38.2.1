package lib.ui.pages.factory;

import lib.ui.PlatformSelector;
import lib.ui.pages.android.AndroidLoginButtonObject;
import lib.ui.pages.android.AndroidMenuButtonObject;
import lib.ui.pages.interfaces.ILoginButtonObject;
import lib.ui.pages.interfaces.IMenuButtonObject;
import lib.ui.pages.ios.iOSLoginButtonObject;
import lib.ui.pages.ios.iOSMenuButtonObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginButtonFactory {
    public static ILoginButtonObject get(RemoteWebDriver driver) {
        if (PlatformSelector.PLATFORM == "ios") {
            return new iOSLoginButtonObject(driver);
        } else {
            return new AndroidLoginButtonObject(driver);
        }
    }
}
