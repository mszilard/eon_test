package eon_test;

import org.testng.annotations.*;

public class MegbizoCegekTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }

    @Test
    public void ujCegHozzaadasa() {
        // Given login
        actionwords.login();
        // Then click megbizo cegek menupont
        actionwords.clickMegbizoCegekMenupont();
        // Then click uj ceg hozzaadasa gomb
        actionwords.clickUjCegHozzaadasaGomb();
        // And adatok kitoltese ""
        actionwords.adatokKitoltese("");
        // And mentes
        actionwords.mentes();
    }
}