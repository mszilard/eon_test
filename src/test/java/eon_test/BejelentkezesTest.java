package eon_test;

import org.testng.annotations.*;

public class BejelentkezesTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }
    public void loginTest(String username, String password) {
        // Given go to eon url "https://calcon.upsolution.hu"
        actionwords.goToEonUrlUrl("https://calcon.upsolution.hu");
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
    public void loginTestGoodUid6a586972667940cfbaf0ca89ce20a19b() {
        loginTest("aram_teszt", "aram");
    }

    @Test
    public void loginTestBadUid1d5263e436e542efac0a9357a2ec2e23() {
        loginTest("asdwfq", "fwq");
    }
}