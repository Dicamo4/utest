package co.com.utest.question;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.utest.userinterface.RegistroUi.MSG_WELCOME;

@AllArgsConstructor
@Slf4j
public class PaginaBienvenida implements Question<Boolean>{

    @Override
    public Boolean answeredBy(Actor actor) {
        return MSG_WELCOME.resolveFor(actor).isVisible();
    }

    public static PaginaBienvenida inicio(){
        return new PaginaBienvenida();
    }

}
