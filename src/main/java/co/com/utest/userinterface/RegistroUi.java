package co.com.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class RegistroUi extends PageObject {

    // ---- Elementos web Mod 1 ---- //
    public static final Target BTN_COOKIE = Target.the("").located(By.id("onetrust-accept-btn-handler"));
    public static final Target BTN_JOIN_TODAY = Target.the("").located(By.xpath("//div[@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']//a[text()='Join Today']"));
    public static final Target TXT_FIRST_NAME = Target.the("").located(By.id("firstName"));
    public static final Target TXT_LAST_NAME = Target.the("").located(By.id("lastName"));
    public static final Target TXT_EMAIL = Target.the("").located(By.id("email"));
    public static final Target SLC_MONTH = Target.the("").located(By.id("birthMonth"));
    public static final Target SLC_DAY = Target.the("").located(By.id("birthDay"));
    public static final Target SLC_YEAR = Target.the("").located(By.id("birthYear"));
    public static final Target BTN_NEXT = Target.the("").located(By.xpath("//button//span[text()='Next: Location']"));

    // ---- Elementos web Mod 2 ---- //
    public static final Target TXT_CODE = Target.the("").located(By.id("zip"));
    public static final Target BTN_DELETE_CITY = Target.the("").located(By.xpath("//*[@id=\"city\"]/ngf-single-select/ngf-autocomplete-input/ngf-input-container/div/div[2]/button"));
    public static final Target TXT_CITY = Target.the("").located(By.xpath("//*[@id=\"city\"]/ngf-single-select/ngf-autocomplete-input/ngf-input-container/div/div[2]/input"));
    public static final Target OPT_CITY = Target.the("").located(By.xpath("//*[@id=\"cdk-overlay-0\"]/ngf-options-container/ngf-option/div"));

    public static final Target BTN_DEVICES = Target.the("").located(By.xpath("//button//span[text()='Next: Devices']"));

    // ---- Elementos web Mod 3 ---- //
    public static final Target SLC_COMPUTER = Target.the("").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target TXT_COMPUTER = Target.the("").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input"));
    public static final Target SLC_VERSION = Target.the("").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target TXT_VERSION = Target.the("").located(By.xpath("//input[@placeholder='Select a Version']"));
    public static final Target SLC_LANGUAGE = Target.the("").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target TXT_LANGUAGE = Target.the("").located(By.xpath("//input[@placeholder='Select OS language']"));
    public static final Target SLC_MOBILE = Target.the("").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target TXT_MOBILE = Target.the("").located(By.xpath("//input[@placeholder='Select Brand']"));
    public static final Target SLC_MODEL = Target.the("").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target TXT_MODEL = Target.the("").located(By.xpath("//input[@placeholder='Select a Model']"));
    public static final Target SLC_OS = Target.the("").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target TXT_OS = Target.the("").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input"));
    public static final Target BTN_LAST_STEP = Target.the("").located(By.xpath("//button//span[text()='Next: Last Step']"));

    // ---- Elementos web Mod 4 ---- //
    public static final Target TXT_PASSWORD = Target.the("").located(By.id("password"));
    public static final Target TXT_PASSWORD_CONFIRM = Target.the("").located(By.id("confirmPassword"));
    public static final Target CHK_STAY_INFO = Target.the("").located(By.name("newsletterOptIn"));
    public static final Target CHK_READ_TERMS = Target.the("").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHK_READ_PRIVACY = Target.the("").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BTN_COMPLETE = Target.the("").located(By.id("laddaBtn"));

    // ---- Elementos web Pantalla Bienvenida ---- //
    public static final Target MSG_WELCOME = Target.the("").located(By.xpath("//h1[text()=\"Welcome to the world's largest community of freelance software testers!\"]"));


}
