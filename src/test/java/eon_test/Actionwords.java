package eon_test;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class Actionwords {

   private boolean isLoggedIn = false;
   private boolean isOpen=false;
    private WebDriver webDriver;
    protected WebDriverWait wait;



    public void Wait() {
        this.wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("m-splash screen")));
    }

    public Actionwords() {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        webDriver = new FirefoxDriver();
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
//        Wait();
//        Assert.assertTrue(!webDriver.getCurrentUrl().contains("auth"));
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
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("m-splash-screen")));
        webDriver.findElement(By.cssSelector("a[href*=sugo]")).click();
        webDriver.findElement(By.cssSelector("div m-subheader a.btn")).click();
        webDriver.findElement(By.cssSelector("div.m-portlet button[type=submit]")).click();
        webDriver.findElement(By.cssSelector("mat-dialog-container input")).sendKeys("Hip csoport");
        webDriver.findElement(By.cssSelector("div mat-dialog-container button")).click();
    }

    public void saveTheCreatedGroup() {

        webDriver.findElement(By.cssSelector(".mat-dialog-actions .btn-primary")).click();
    }

    public void defineTheGroupContent() {

        List<WebElement> csoportList = webDriver.findElements(By.cssSelector(".csoport"));
        csoportList.get(csoportList.size() - 1).click();
        webDriver.findElement(By.cssSelector(".m-portlet__body div.ng-star-inserted div button")).click();
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
        this.webDriver.findElement(By.cssSelector("input[type=file]")).sendKeys(new CharSequence[]{"C:\\Users\\MMSOne\\Desktop\\123.jpg"});

    }

    public void tipustervMentese() {
        this.webDriver.findElement(By.cssSelector("div.m-portlet button.btn-primary")).click();
    }

    public void tipustervLetrejott() {
        Wait();
        if(webDriver.getCurrentUrl().contains("uj")){
            Assert.assertTrue(webDriver.findElement(By.cssSelector("mat-dialog-container")).isDisplayed());
        }
    }
}