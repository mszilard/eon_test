package eon_test;

import org.testng.annotations.*;

public class BejelentkezesTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }
    public void loginTest(String username, String password) {
        // Given go to eon url "http://10.10.1.25:91"
        actionwords.goToEonUrlUrl("http://10.10.1.25:91");
        // When enter username "<username>"
        actionwords.enterUsernameUsername(username);
        // And enter password "<password>"
        actionwords.enterPasswordPassword(password);
        // And press login button
        actionwords.pressLoginButton();
        // Then should be logged in
        actionwords.shouldBeLoggedIn();
    }

    @Test
    public void loginTestGood() {
        loginTest("aram_teszt", "aram");
    }

    @Test
    public void loginTestBad() {
        loginTest("asdwfq", "fwq");
    }
}