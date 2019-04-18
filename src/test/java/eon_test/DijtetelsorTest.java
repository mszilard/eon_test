package eon_test;

import org.testng.annotations.*;

public class DijtetelsorTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }

    @Test
    public void osszetettTeszt() {
        // Given login
        actionwords.login();
        // And uj gep letrehozasa "Teszt-Gép" "1500"
        actionwords.ujGepLetrehozasa("Teszt-Gép", "1500");
        // And uj human eroforras letrehozasa "Teszt-Szakember" "3000"
        actionwords.ujHumanEroforrasLetrehozasa("Teszt-Szakember", "3000");
        // And uj fejezet letrehozasa "88" "Teszt-Fejezet" "TFFF" "1" "2"
        actionwords.ujFejezetLetrehozasa("88", "Teszt-Fejezet", "TFFF", "1", "2");
        // And uj dijtetel letrohazasa a most letrehozott adatokkal "1122334" "88 - TFFF" "Teszt-Dijtétel" "Feles sor" "Díjtétel leírása" "Díjtétel megjegyzése" "db" "Teszt-Gép" "Teszt-Szakember"
        actionwords.ujDijtetelLetrohazasaAMostLetrehozottAdatokkal("1122334", "88 - TFFF", "Teszt-Dijtétel", "Feles sor", "Díjtétel leírása", "Díjtétel megjegyzése", "db", "Teszt-Gép", "Teszt-Szakember");
        // And dijtetel mentese
        actionwords.dijtetelMentese();
    }
}