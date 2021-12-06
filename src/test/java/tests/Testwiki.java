package tests;

import lib.CoreTestCase;
import lib.ui.pages.factory.*;
import lib.ui.pages.interfaces.*;
import org.junit.Test;

public class Testwiki extends CoreTestCase {

    @Test
    public void testSearchMenuButton() {
        IOnboardingPageObject onboardingPage = OnboardingPageFactory.get(this.driver);
        IMenuButtonObject searchMenuPage = MenuButtonFactory.get(this.driver);
        IMenuButtonObject searchMenuButton = MenuButtonFactory.get(this.driver);

        onboardingPage.skipOnboarding();
        searchMenuPage.initMenuButton();
        searchMenuButton.selectByTextMenu("");

    }

    @Test
    public void testSearchSettingsButton() {
        IOnboardingPageObject onboardingPage = OnboardingPageFactory.get(this.driver);
        IMenuButtonObject searchMenuPage = MenuButtonFactory.get(this.driver);
        ISettingsButtonObject searchSettingsPage = SettingsButtonFactory.get(this.driver);
        ISettingsButtonObject searchSettingsButton = SettingsButtonFactory.get(this.driver);

        onboardingPage.skipOnboarding();
        searchMenuPage.initMenuButton();
        searchSettingsPage.initSettingsButton();
        searchSettingsButton.selectByTextSettings("");


    }

    @Test
    public void testSearchLoginButton() {
        IOnboardingPageObject onboardingPage = OnboardingPageFactory.get(this.driver);
        IMenuButtonObject searchMenuPage = MenuButtonFactory.get(this.driver);
        ILoginButtonObject searchLoginPage = LoginButtonFactory.get(this.driver);
        ILoginButtonObject searchLoginButton = LoginButtonFactory.get(this.driver);

        onboardingPage.skipOnboarding();
        searchMenuPage.initMenuButton();
        searchLoginPage.initLoginButton();
        searchLoginButton.selectByTextLogin("");
    }

    @Test
    public void testSearchBar() {
        IOnboardingPageObject onboardingPage = OnboardingPageFactory.get(this.driver);
        ISearchBarObject SearchBarPage = SearchBarFactory.get(this.driver);
        ISearchBarObject SearchBar = SearchBarFactory.get(this.driver);

        onboardingPage.skipOnboarding();
        SearchBarPage.initSearchBar();
        SearchBar.selectByTextSearchBar("");

    }

    @Test
    public void testMyListButton() {
        IOnboardingPageObject onboardingPage = OnboardingPageFactory.get(this.driver);
        IMyListButtonObject SearchMyListButtonPage = MyListButtonFactory.get(this.driver);
        IMyListButtonObject SearchMyListButton = MyListButtonFactory.get(this.driver);

        onboardingPage.skipOnboarding();
        SearchMyListButtonPage.initMyListButton();
        SearchMyListButton.selectByTextMyList("offline");
    }

    @Test
    public void testHistoryButton() {
        IOnboardingPageObject onboardingPage = OnboardingPageFactory.get(this.driver);
        IHistoryButtonObject SearchHistoryButtonPage = HistoryButtonFactory.get(this.driver);
        IHistoryButtonObject SearchHistoryButton = HistoryButtonFactory.get(this.driver);

        onboardingPage.skipOnboarding();
        SearchHistoryButtonPage.initHistoryButton();
        SearchHistoryButton.selectByTextHistory("been");
    }

    @Test
    public void testNearbyButton() {
        IOnboardingPageObject onboardingPage = OnboardingPageFactory.get(this.driver);
        INearbyButtonObject SearchNearbyButtonPage = NearbyButtonFactory.get(this.driver);
        INearbyButtonObject SearchNearbyButton = NearbyButtonFactory.get(this.driver);

        onboardingPage.skipOnboarding();
        SearchNearbyButtonPage.initNearbyButton();
        SearchNearbyButton.selectByTextNearby("Nearby");
    }

    @Test
    public void testNoValidLogin() {
        IOnboardingPageObject onboardingPage = OnboardingPageFactory.get(this.driver);
        IMenuButtonObject searchMenuPage = MenuButtonFactory.get(this.driver);
        INoValidLoginObject SearchLoginPage = NoValidLoginFactory.get(this.driver);
        INoValidLoginObject InpitNoValidLoginPage = NoValidLoginFactory.get(this.driver);
        INoValidLoginObject InpitNoValidPassPage = NoValidLoginFactory.get(this.driver);
        INoValidLoginObject ClickNoValidPassPage = NoValidLoginFactory.get(this.driver);
        INoValidLoginObject ResultNoValidLogin = NoValidLoginFactory.get(this.driver);

        onboardingPage.skipOnboarding();
        searchMenuPage.initMenuButton();
        SearchLoginPage.initSearchLoginButton();
        InpitNoValidLoginPage.initInputLogin();
        InpitNoValidPassPage.initInputPass();
        ClickNoValidPassPage.initClickLogin();
        ResultNoValidLogin.selectByTextResultLogin("Incorrect username");
    }

    @Test
    public void testValidLogin() {
        IOnboardingPageObject onboardingPage = OnboardingPageFactory.get(this.driver);
        IMenuButtonObject searchMenuPage = MenuButtonFactory.get(this.driver);
        IValidLoginObject SearchLoginPage = ValidLoginFactory.get(this.driver);
        IValidLoginObject InpitValidLoginPage = ValidLoginFactory.get(this.driver);
        IValidLoginObject InpitValidPassPage = ValidLoginFactory.get(this.driver);
        IValidLoginObject ClickValidPassPage = ValidLoginFactory.get(this.driver);
        IValidLoginObject ResultValidLogin = ValidLoginFactory.get(this.driver);

        onboardingPage.skipOnboarding();
        searchMenuPage.initMenuButton();
        SearchLoginPage.initSearchLoginButton();
        InpitValidLoginPage.initInputLogin();
        InpitValidPassPage.initInputPass();
        ClickValidPassPage.initClickLogin();
        ResultValidLogin.selectByTextResultLogin("successfully");
    }

    @Test
    public void testAddReadingList() {
        IOnboardingPageObject onboardingPage = OnboardingPageFactory.get(this.driver);
        IAddReadingListObject searchInputBar = AddReadingListFactory.get(this.driver);
        IAddReadingListObject searchInputText = AddReadingListFactory.get(this.driver);
        IAddReadingListObject searchPageResult = AddReadingListFactory.get(this.driver);
        IAddReadingListObject ClickPin = AddReadingListFactory.get(this.driver);
        IAddReadingListObject ClickGotIt = AddReadingListFactory.get(this.driver);
        IAddReadingListObject ClickOk = AddReadingListFactory.get(this.driver);

        onboardingPage.skipOnboarding();
        searchInputBar.initSearchBar();
        searchInputText.initInputSearchText("Java");
        searchPageResult.selectByTextResult("Island of Indonesia");
        ClickPin.initClickPin();
        ClickGotIt.initClickGotIt();
        ClickOk.initClickOk();
        searchPageResult.selectByTextResultAddlist("");



    }
}