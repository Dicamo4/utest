package co.com.utest.stepdefinitions;

import co.com.utest.navigation.Navegar;
import co.com.utest.question.PaginaBienvenida;
import co.com.utest.task.Registro;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RegistroStepDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere registrarse en utest")
    public void queRequiereRegistrarseEnUtest(String actor) {
        theActorCalled(actor).attemptsTo(Navegar.utestHome());
    }
    @Cuando("ingrese y complete los datos solicitados")
    public void ingreseYCompleteLosDatosSolicitados() {
        withCurrentActor(Registro.exitoso());
    }
    @Entonces("se valida el mensaje de bienvenida")
    public void seValidaElMensajeDeBienvenida() {
        theActorInTheSpotlight().should(seeThat(PaginaBienvenida.inicio()));
    }

}
