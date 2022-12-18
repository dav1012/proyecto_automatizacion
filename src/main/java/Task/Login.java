package Task;

import Models.OpcionesLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

import java.util.List;
import java.util.Map;

import static Ui.ingreso.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {


    private OpcionesLogin opcionesLogin;
    private List<Map<String,String>> llenarLogin;

    public Login(List<Map<String, String>> llenarLogin) {
        this.llenarLogin = llenarLogin;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        opcionesLogin =  new OpcionesLogin(

                llenarLogin.get(0).get("nombreusuario"),
                llenarLogin.get(0).get("clave")

        );

        actor.attemptsTo(

                Enter.theValue(opcionesLogin.getNombreusuario()).into(Usuario),
                Enter.theValue(opcionesLogin.getClave()).into(Clave),
                Click.on(LoginButton)

        );

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static Login registrar(List<Map<String,String>> llenarLogin){

        return instrumented(Login.class,llenarLogin);

    }


}
