package eon_test.dokumentumok;

import org.testng.annotations.*;
import eon_test.Actionwords;

public class TipustervekTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }

    @Test
    public void tipustervLetrehozasa() {
        // Given login
        actionwords.login();
        // Then típustervek menüpont
        actionwords.tipustervekMenupont();
        // And új típusterv név és szám megadása
        actionwords.ujTipustervNevEsSzamMegadasa();
        // And fájl feltöltése
        actionwords.fajlFeltoltese();
        // Then típusterv mentése
        actionwords.tipustervMentese();
        // Then típusterv létrejött
        actionwords.tipustervLetrejott();
    }
}