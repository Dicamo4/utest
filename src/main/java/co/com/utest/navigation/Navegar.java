package co.com.utest.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Navegar {
    public static Performable utestHome() {
        return Task.where("{0} abrir utest inicio",
                Open.browserOn().the(UtestInicio.class));
    }
}
