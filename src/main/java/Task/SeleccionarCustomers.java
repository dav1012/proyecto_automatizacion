package Task;

import Models.OpcionesCustomers;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

import static Ui.Customers.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SeleccionarCustomers implements Task {

    private OpcionesCustomers opcionesCustomers;
    private List<Map<String,String>> llenarCustomers;

    public SeleccionarCustomers(List<Map<String, String>> llenarCustomers) {
        this.llenarCustomers = llenarCustomers;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        opcionesCustomers = new OpcionesCustomers(

                llenarCustomers.get(0).get("customerID"),
                llenarCustomers.get(0).get("companyName"),
                llenarCustomers.get(0).get("contactName"),
                llenarCustomers.get(0).get("contactTitle"),
                llenarCustomers.get(0).get("address"),
                llenarCustomers.get(0).get("country"),
                llenarCustomers.get(0).get("city"),
                llenarCustomers.get(0).get("region"),
                llenarCustomers.get(0).get("postalCode"),
                llenarCustomers.get(0).get("phone"),
                llenarCustomers.get(0).get("lastContactBy"),
                llenarCustomers.get(0).get("email")


        );

        actor.attemptsTo(

                Click.on(option_northwind),
                Click.on(option_customers),
                Click.on(option_new_customers),
                Enter.theValue(opcionesCustomers.getCustomerID()).into(Customer_ID),
                Enter.theValue(opcionesCustomers.getCompanyName()).into(Company_name),
                Enter.theValue(opcionesCustomers.getContactName()).into(Contact_name),
                Enter.theValue(opcionesCustomers.getContactTitle()).into(Contact_title),
                Enter.theValue(opcionesCustomers.getAddress()).into(Address),
                Click.on(Country),
                Enter.theValue(opcionesCustomers.getCountry()).into(select_Country),
                Hit.the(Keys.ENTER).into(select_Country),
                Click.on(City),
                Enter.theValue(opcionesCustomers.getCity()).into(select_city),
                Hit.the(Keys.ENTER).into(select_city),
                Enter.theValue(opcionesCustomers.getRegion()).into(Region),
                Enter.theValue(opcionesCustomers.getPostalCode()).into(postal_Code),
                Enter.theValue(opcionesCustomers.getPhone()).into(phone),
                Enter.theValue("22/14/12").into(Calendario),
                Click.on(last_contact_by),
                Enter.theValue(opcionesCustomers.getLastContactBy()).into(last_contact_search),
                Hit.the(Keys.ENTER).into(last_contact_search),
                Enter.theValue(opcionesCustomers.getEmail()).into(email),
                Click.on(check_send_bulletin)


        );

    }

    public static SeleccionarCustomers customers(List<Map<String, String>> llenarCustomers){

        return instrumented(SeleccionarCustomers.class,llenarCustomers);

    }


}
