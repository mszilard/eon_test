package eon_test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import  org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class Actionwords {

    private WebDriver webDriver;
    protected WebDriverWait wait;
    private Select select;



    public void Wait() {
        this.wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("m-splash screen")));
    }

    public Actionwords() {
//        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
//        webDriver = new FirefoxDriver();
        System.setProperty("phantomjs.binary.path", "drivers/phantomjs.exe");
        webDriver = new PhantomJSDriver();
        webDriver.manage().window().maximize();
    }

    public void goToEonUrlUrl(String url) {
        webDriver.get(url);
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    public void enterUsernameUsername(String username) {

        webDriver.findElement(By.cssSelector("input[name=username]")).sendKeys(username);
    }

    public void enterPasswordPassword(String password) {
        webDriver.findElement(By.cssSelector("input[name=password]")).sendKeys(password);

    }

    public void pressLoginButton() {
        webDriver.findElement(By.cssSelector("input[name=login]")).click();

    }

    public void shouldBeLoggedIn() {
        Assert.assertTrue(!webDriver.getCurrentUrl().contains("auth"));
        webDriver.close();

    }


    public void login() {
        this.webDriver.get("http://10.10.1.25:91");
        this.webDriver.manage().window().maximize();
        this.webDriver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
        this.wait = new WebDriverWait(this.webDriver, 45);
        this.webDriver.findElement(By.cssSelector("input[name=username]")).sendKeys(new CharSequence[]{"aram_teszt"});
        this.webDriver.findElement(By.cssSelector("input[name=password]")).sendKeys(new CharSequence[]{"aram", Keys.ENTER});

    }

    public void createNewGroup() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div m-splash-screen")));
        this.Wait();
        webDriver.findElement(By.cssSelector("a[href*=sugo]")).click();
        webDriver.findElement(By.cssSelector("div m-subheader a.btn")).click();
        webDriver.findElement(By.cssSelector("div.m-portlet button[type=submit]")).click();
        webDriver.findElement(By.cssSelector("mat-dialog-container input")).sendKeys("Hip csoporaaaaat");
        webDriver.findElement(By.cssSelector("div mat-dialog-container button")).click();

    }

    public void saveTheCreatedGroup() {

        webDriver.findElement(By.cssSelector(".mat-dialog-container .btn-primary")).click();
    }

    public void defineTheGroupContent() {

        List<WebElement> csoportList = webDriver.findElements(By.cssSelector(".csoport"));
        csoportList.get(csoportList.size() - 1).click();
        webDriver.findElement(By.cssSelector(".m-portlet__body div.ng-star-inserted button[type=submit]")).click();
        wait.until(ExpectedConditions.visibilityOf(webDriver.findElement(By.cssSelector("mat-dialog-container"))));
        webDriver.findElement(By.cssSelector("mat-dialog-container input")).sendKeys("hipTest");
        webDriver.findElement(By.cssSelector("mat-dialog-container textarea")).sendKeys("HipTeszt prba");
    }

    public void theGroupShouldBeCreated() {
        List<WebElement> csoportList = webDriver.findElements(By.cssSelector(".csoport"));
        csoportList.get(csoportList.size() - 1);
        Assert.assertEquals(csoportList.get(csoportList.size() - 1).getText(), "Hip csoport\n" +
                "edit\n" +
                "delete");
        webDriver.close();


    }

    public void tipustervekMenupont() {
        this.wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("m-splash screen")));
        this.Wait();
        this.webDriver.findElement(By.cssSelector(".m-menu__item a[href*=javascript]")).click();
        this.webDriver.findElement(By.cssSelector("li.m-menu__item.ng-star-inserted.m-menu__item--submenu.m-menu__item--open li:nth-of-type(1)")).click();
        this.Wait();
    }

    public void ujTipustervNevEsSzamMegadasa() {
        this.webDriver.findElement(By.cssSelector("div.m-subheader a.btn")).click();
        this.webDriver.findElement(By.cssSelector("input[name=nev]")).sendKeys(new CharSequence[]{"Sikeres teszt"});
        this.webDriver.findElement(By.cssSelector("input[name=tervszam]")).sendKeys(new CharSequence[]{"Sikeres terv12k"});

    }

    public void fajlFeltoltese() {
       // this.webDriver.findElement(By.cssSelector("input[type=file]")).sendKeys(new CharSequence[]{"C:\\Users\\MMSOne\\Desktop\\Teszt_fajlok\\123.jpg"});

    }

    public void tipustervMentese() {
        //this.webDriver.findElement(By.cssSelector("div.m-portlet button.btn-primary")).click();
    }

    public void tipustervLetrejott() {
//        Wait();
//        if(webDriver.getCurrentUrl().contains("uj")){
//            Assert.assertTrue(webDriver.findElement(By.cssSelector("mat-dialog-container")).isDisplayed());
//        }
//        webDriver.close();
    }

    public void clickGepekMenupont() {
        this.wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("m-splash screen")));
        this.Wait();
        this.webDriver.findElement(By.cssSelector("li.m-menu__item:nth-child(6) > a:nth-child(1) > span:nth-child(2)")).click();
        this.webDriver.findElement(By.cssSelector("li.m-menu__item.ng-star-inserted.m-menu__item--submenu.m-menu__item--open li:nth-of-type(3)")).click();
        this.Wait();

    }

    public void clickUjGep() {
        this.webDriver.findElement(By.cssSelector("div.m-subheader a.btn")).click();
    }

    public void megnevezesoradijKitoltese() {
        this.webDriver.findElement(By.cssSelector("div.m-portlet input[name=nev]")).sendKeys("Markoló");
        this.webDriver.findElement(By.cssSelector("div.m-portlet input[name=oradij]")).sendKeys("10000");
    }

    public void mentes() {
        this.webDriver.findElement(By.cssSelector("div.m-portlet button.btn-primary")).click();
    }

    public void clickMegbizoCegekMenupont() {
        this.wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("m-splash screen")));
        this.Wait();
        this.webDriver.findElement(By.xpath("a[href*=megbizocegek]")).click();
        this.Wait();
    }

    public void clickUjCegHozzaadasaGomb() {
        this.webDriver.findElement(By.cssSelector("div.m-subheader a.btn")).click();
    }

    public void adatokKitoltese(String d) {
        this.webDriver.findElement(By.cssSelector("div.m-portlet input[name=megbizoRovidNev]")).sendKeys("TST2");
        this.webDriver.findElement(By.cssSelector("div.m-portlet input[name=megbizoTeljesNev]")).sendKeys("Test megbízó cég2");
        this.webDriver.findElement(By.cssSelector("div.m-portlet mat-select[name=telepules]")).click();
        Wait();
        List<WebElement> telepulesek = webDriver.findElements(By.cssSelector("mat-option"));
        String telepulesParameter = "Győr";
        for (WebElement element : telepulesek) {
            if (element.getText().contains(telepulesParameter)) {
                element.click();
                break;
            }
        }
        this.webDriver.findElement(By.cssSelector("div.m-portlet mat-select[name=vallalat]")).click();
        Wait();
        List<WebElement> vallalatok = webDriver.findElements(By.cssSelector("mat-option"));
        String vallalatParameter = "E.ON Dél-dunántúli Áramhálózati Zrt.";
        for (WebElement element : vallalatok) {
            if (element.getText().contains(vallalatParameter)) {
                element.click();
                break;
            }
        }
    }

    public void ujGepLetrehozasa(String s, String s1) {
        this.wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("m-splash screen")));
        this.Wait();
        this.webDriver.findElement(By.cssSelector("li.m-menu__item:nth-child(6) a:nth-child(1) span:nth-child(2)")).click();
        this.webDriver.findElement(By.cssSelector("li.m-menu__item.ng-star-inserted.m-menu__item--submenu.m-menu__item--open li:nth-of-type(3)")).click();
        this.Wait();
        this.webDriver.findElement(By.cssSelector("div.m-subheader a.btn")).click();
        this.webDriver.findElement(By.cssSelector("div.m-portlet input[name=nev]")).sendKeys(s);
        this.webDriver.findElement(By.cssSelector("div.m-portlet input[name=oradij]")).sendKeys(s1);
        this.webDriver.findElement(By.cssSelector("div.m-portlet button.btn-primary")).click();

    }

    public void ujHumanEroforrasLetrehozasa(String s, String s1) {
        this.wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("m-splash screen")));
        this.Wait();
        this.webDriver.findElement(By.cssSelector("li.m-menu__item:nth-child(6) div:nth-child(2) ul:nth-child(2) li:nth-child(4) a:nth-child(1) span:nth-child(2)")).click();
        this.Wait();
        this.webDriver.findElement(By.cssSelector("div.m-subheader a.btn")).click();
        this.webDriver.findElement(By.cssSelector("div.m-portlet input[name=megnevezes]")).sendKeys(s);
        this.webDriver.findElement(By.cssSelector("div.m-portlet input[name=oradij]")).sendKeys(s1);
        this.webDriver.findElement(By.cssSelector("div.m-portlet button.btn-primary")).click();
    }

    public void ujFejezetLetrehozasa(String s, String s1, String tf, String s2, String s3) {
        this.wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("m-splash screen")));
        this.Wait();
        this.webDriver.findElement(By.cssSelector("li.m-menu__item:nth-child(6) div:nth-child(2) ul:nth-child(2) li:nth-child(5) a:nth-child(1) span:nth-child(2)")).click();
        this.Wait();
        this.webDriver.findElement(By.cssSelector("div.m-subheader a.btn")).click();
        this.webDriver.findElement(By.cssSelector("div.m-portlet input[name=sorszam]")).sendKeys(s);
        this.webDriver.findElement(By.cssSelector("div.m-portlet input[name=megnevezes]")).sendKeys(s1);
        this.webDriver.findElement(By.cssSelector("div.m-portlet input[name=rovidnev]")).sendKeys(tf);
        this.webDriver.findElement(By.cssSelector("div.m-portlet input[name=humanSzorzo]")).sendKeys(s2);
        this.webDriver.findElement(By.cssSelector("div.m-portlet input[name=gepSzorzo]")).sendKeys(s3);
        this.webDriver.findElement(By.cssSelector("div.m-portlet button.btn-primary")).click();

    }

    public void ujDijtetelLetrohazasaAMostLetrehozottAdatokkal(String s, String s1, String s2, String feles_sor, String díjtétel_leírása, String díjtétel_megjegyzése, String db, String s3, String s4) {
        this.wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("m-splash screen")));
        this.Wait();
        this.webDriver.findElement(By.cssSelector("li.m-menu__item:nth-child(6) > a:nth-child(1) > span:nth-child(2)")).click();
        this.Wait();
        this.webDriver.findElement(By.cssSelector("li.m-menu__item:nth-child(6) div:nth-child(2) ul:nth-child(2) li:nth-child(2) a:nth-child(1) span:nth-child(2)")).click();
        this.Wait();
        this.webDriver.findElement(By.cssSelector("a.m-btn--pill:nth-child(1)")).click();
        this.webDriver.findElement(By.cssSelector("div.m-portlet input[name=tetelszam]")).sendKeys(s);
        this.webDriver.findElement(By.cssSelector("div.m-portlet input[name=fejezet]")).sendKeys("tf");
        Wait();
        List<WebElement> fejezetek = webDriver.findElements(By.className("mat-option"));
        String fejezet = s1;
        for (WebElement element : fejezetek) {
            if (element.getText().contains(fejezet)) {
                element.click();
                break;
            }
        }

        this.webDriver.findElement(By.cssSelector("div.m-portlet input[name=megnevezes]")).sendKeys(s2);
        this.webDriver.findElement(By.cssSelector("div.m-portlet input[name=haromFelesSor]")).sendKeys(feles_sor);
        this.webDriver.findElement(By.cssSelector("div.m-portlet textarea[name=leiras]")).sendKeys(díjtétel_leírása);
        this.webDriver.findElement(By.cssSelector("div.m-portlet textarea[name=megjegyzes]")).sendKeys(díjtétel_megjegyzése);

        this.webDriver.findElement(By.cssSelector("div.m-portlet mat-select[name=mertekegysegId]")).click();
        Wait();
        List<WebElement> megysegek = webDriver.findElements(By.cssSelector("mat-option"));
        String megyseg = db;
        for (WebElement element : megysegek) {
            if (element.getText().contains(megyseg)) {
                element.click();
                break;
            }
        }
        this.webDriver.findElement(By.cssSelector(".m-form div:nth-child(9) div:nth-child(2) a:nth-child(1)")).click();
        Wait();
        this.webDriver.findElement(By.cssSelector("div.m-portlet input[name=gepId]")).sendKeys("Teszt");
        Wait();
        List<WebElement> gepek = webDriver.findElements(By.cssSelector("mat-option"));
        String gep = s3;
        for (WebElement element : gepek) {
            if (element.getText().contains(gep)) {
                element.click();
                break;
            }
        }
        this.webDriver.findElement(By.cssSelector("m-gep-ora.ng-star-inserted input[name=oraSzam]")).sendKeys("2");
        this.webDriver.findElement(By.cssSelector("m-gep-ora.ng-star-inserted input[name=monoblockOraszam]")).sendKeys("4");

        this.webDriver.findElement(By.cssSelector(".m-form div:nth-child(12) div:nth-child(2) a:nth-child(1)")).click();
        Wait();
        this.webDriver.findElement(By.cssSelector("div.m-portlet input[name=humanId]")).sendKeys("Teszt");
        Wait();
        List<WebElement> humanok = webDriver.findElements(By.cssSelector("mat-option"));
        String human = s4;
        for (WebElement element : humanok) {
            if (element.getText().contains(human)) {
                element.click();
                break;
            }
        }
        this.webDriver.findElement(By.cssSelector("m-human-ora.ng-star-inserted input[name=oraSzam]")).sendKeys("2");
        this.webDriver.findElement(By.cssSelector("m-human-ora.ng-star-inserted input[name=monoblockOraszam]")).sendKeys("4");
    }

    public void dijtetelMentese() {
        this.webDriver.findElement(By.cssSelector("button.btn:nth-child(2)")).click();
    }
}