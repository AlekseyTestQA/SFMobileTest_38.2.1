package lib.ui.pages.factory;

import lib.ui.PlatformSelector;
import lib.ui.pages.android.AndroidNoValidLoginObject;
import lib.ui.pages.android.AndroidValidLoginObject;
import lib.ui.pages.interfaces.INoValidLoginObject;
import lib.ui.pages.interfaces.IValidLoginObject;
import lib.ui.pages.ios.iOSNoValidLoginObject;
import lib.ui.pages.ios.iOSValidLoginObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ValidLoginFactory {
    public static IValidLoginObject get(RemoteWebDriver driver) {
        if (PlatformSelector.PLATFORM == "ios") {
            return new iOSValidLoginObject(driver);
        } else {
            return new AndroidValidLoginObject(driver);
        }
    }
}
