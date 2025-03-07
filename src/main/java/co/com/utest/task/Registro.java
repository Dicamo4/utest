package co.com.utest.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static co.com.utest.userinterface.RegistroUi.*;

public class Registro implements Task {

    public static Registro exitoso(){
        return Tasks.instrumented(Registro.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_COOKIE),
                Click.on(BTN_JOIN_TODAY),
                Enter.theValue("DIEGO").into(TXT_FIRST_NAME),
                Enter.theValue("CANCELADA").into(TXT_LAST_NAME),
                Enter.theValue("test1dicamo@gmail.com ").into(TXT_EMAIL),
                SelectFromOptions.byVisibleText("June").from(SLC_MONTH),
                SelectFromOptions.byVisibleText("4").from(SLC_DAY),
                SelectFromOptions.byVisibleText("1986").from(SLC_YEAR),
                Click.on(BTN_NEXT));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                Click.on(BTN_DELETE_CITY),
                Enter.theValue("Zipaquira").into(TXT_CITY),
                Click.on(OPT_CITY),
                Enter.theValue("8889111").into(TXT_CODE),
                Click.on(BTN_DEVICES),
                Click.on(SLC_COMPUTER),
                Enter.theValue("Linux").into(TXT_COMPUTER).thenHit(Keys.ENTER),
                Click.on(SLC_VERSION),
                Enter.theValue("Mint").into(TXT_VERSION).thenHit(Keys.ENTER),
                Click.on(SLC_LANGUAGE),
                Enter.theValue("Spanish").into(TXT_LANGUAGE).thenHit(Keys.ENTER),
                Click.on(SLC_MOBILE),
                Enter.theValue("Apple").into(TXT_MOBILE).thenHit(Keys.ENTER),
                Click.on(SLC_MODEL),
                Enter.theValue("iPhone 14 Pro Max").into(TXT_MODEL).thenHit(Keys.ENTER),
                Click.on(SLC_OS),
                Enter.theValue("iOS 16.0").into(TXT_OS).thenHit(Keys.ENTER),
                Click.on(BTN_LAST_STEP),
                Enter.theValue("Di0102*222").into(TXT_PASSWORD),
                Enter.theValue("Di0102*222").into(TXT_PASSWORD_CONFIRM),
                Click.on(CHK_STAY_INFO),
                Click.on(CHK_READ_TERMS),
                Click.on(CHK_READ_PRIVACY),
                Click.on(BTN_COMPLETE)
        );
    }
}
