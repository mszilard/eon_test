package eon_test;

import org.testng.annotations.*;

public class BejelentkezesTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }
    public void loginDT(String username, String password) {
        // Given go to eon url "http://10.10.1.25:91"
        actionwords.goToEonUrlUrl("http://10.10.1.25:91");
        // Then enter username "<username>"
        actionwords.enterUsernameUsername(username);
        // And enter password "<password>"
        actionwords.enterPasswordPassword(password);
        // Then press login button
        actionwords.pressLoginButton();
        // Then should be logged in
        actionwords.shouldBeLoggedIn();
    }

    @Test
    public void loginDTGood() {
        loginDT("aram_teszt", "aram");
    }

    @Test
    public void loginDTBad() {
        loginDT("asdwfq", "fwq");
    }
}