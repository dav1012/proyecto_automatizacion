package prueba.stepdefinitions;

import Task.SeleccionarCustomers;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

public class CustomersStepDefinitions {

    @Before
    public void setUp(){

        OnStage.setTheStage(new OnlineCast());

    }

    @Cuando("el usuario ingresa datos del cliente en la opcion customers")
    public void elUsuarioIngresaDatosDelClienteEnLaOpcionCustomers(List<Map<String,String>> llenarCustomers) {

        OnStage.theActorInTheSpotlight().attemptsTo(

                SeleccionarCustomers.customers(llenarCustomers)

        );

    }
    @Entonces("deberia ver el registro para customers exitoso")
    public void deberiaVerElRegistroParaCustomersExitoso() {





    }


}
