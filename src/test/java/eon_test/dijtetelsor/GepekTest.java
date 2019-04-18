package eon_test.dijtetelsor;

import org.testng.annotations.*;
import eon_test.Actionwords;

public class GepekTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }

    @Test
    public void ujGep() {
        // Given login
        actionwords.login();
        // Then click gepek menupont
        actionwords.clickGepekMenupont();
        // And click uj gep
        actionwords.clickUjGep();
        // And megnevezes/oradij kitoltese
        actionwords.megnevezesoradijKitoltese();
        // And mentes
        actionwords.mentes();
    }
}