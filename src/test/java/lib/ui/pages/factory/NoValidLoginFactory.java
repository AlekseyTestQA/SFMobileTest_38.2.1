package lib.ui.pages.factory;

import lib.ui.PlatformSelector;
import lib.ui.pages.android.AndroidLoginButtonObject;
import lib.ui.pages.android.AndroidNoValidLoginObject;
import lib.ui.pages.interfaces.ILoginButtonObject;
import lib.ui.pages.interfaces.INoValidLoginObject;
import lib.ui.pages.ios.iOSLoginButtonObject;
import lib.ui.pages.ios.iOSNoValidLoginObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NoValidLoginFactory {
    public static INoValidLoginObject get(RemoteWebDriver driver) {
        if (PlatformSelector.PLATFORM == "ios") {
            return new iOSNoValidLoginObject(driver);
        } else {
            return new AndroidNoValidLoginObject(driver);
        }
    }
}
