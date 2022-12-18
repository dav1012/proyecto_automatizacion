package Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;

import java.util.concurrent.TimeUnit;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Ingresar  implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        BrowseTheWeb.as(actor).getDriver().manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        BrowseTheWeb.as(actor).getDriver().manage().window().maximize();

        actor.attemptsTo(

                Open.url("https://serenity.is/demo/")

        );

    }

    public static Ingresar inicio(){

        return instrumented(Ingresar.class,"");

    }


}
