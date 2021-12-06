package lib.ui.pages.factory;

import lib.ui.PlatformSelector;
import lib.ui.pages.android.AndroidAddReadingListObject;
import lib.ui.pages.android.AndroidValidLoginObject;
import lib.ui.pages.interfaces.IAddReadingListObject;
import lib.ui.pages.interfaces.IValidLoginObject;
import lib.ui.pages.ios.iOSAddReadingListObject;
import lib.ui.pages.ios.iOSValidLoginObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AddReadingListFactory {
    public static IAddReadingListObject get(RemoteWebDriver driver) {
        if (PlatformSelector.PLATFORM == "ios") {
            return new iOSAddReadingListObject(driver);
        } else {
            return new AndroidAddReadingListObject(driver);
        }
    }
}
