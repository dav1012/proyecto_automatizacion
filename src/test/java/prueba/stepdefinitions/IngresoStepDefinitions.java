package prueba.stepdefinitions;

import Task.Ingresar;
import Task.Login;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;
import java.util.Map;

import static Ui.ingreso.Message1;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class IngresoStepDefinitions {

    @Before
    public void setUp(){

        OnStage.setTheStage(new OnlineCast());

    }

    @Cuando("^el usuario intenta loguearse en la pagina web$")
    public void elUsuarioIntentaLoguearseEnLaPaginaWeb(List<Map<String,String>> llenarLogin) {

        theActorCalled("usuario").attemptsTo(

                Ingresar.inicio(),
                Login.registrar(llenarLogin)

        );

    }

    @Entonces("deberia que el ingreso fue correcto")
    public void deberiaQueElIngresoFueCorrecto() {

        OnStage.theActorInTheSpotlight().attemptsTo(

                Ensure.that(Message1).isDisplayed()
        );

    }

}
