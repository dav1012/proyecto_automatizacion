package Ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Customers {

    public static Target option_northwind = Target.the("OPCION1").located(By.xpath("//*[@id=\"nav_menu1_2\"]/li[1]/a/span"));
    public static Target option_customers = Target.the("OPCION2").located(By.xpath("//*[@id=\"nav_menu1_2_1\"]/li[1]/a/span"));
    public static Target option_new_customers = Target.the("OPCION3").located(By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]/div/span"));

    public static Target Customer_ID = Target.the("OPCION4").located(By.name("CustomerID"));
    public static Target Company_name = Target.the("OPCION5").located(By.name("CompanyName"));
    public static Target Contact_name = Target.the("OPCION6").located(By.name("ContactName"));
    public static Target Contact_title = Target.the("OPCION7").located(By.name("ContactTitle"));
    public static Target Address = Target.the("OPCION8").located(By.name("Address"));

    public static Target Country = Target.the("OPCION9").located(By.id("select2-chosen-5"));

    public static Target select_Country = Target.the("OPCION10").located(By.id("s2id_autogen5_search"));

    public static Target City = Target.the("OPCION11").located(By.id("select2-chosen-6"));
    public static Target select_city = Target.the("OPCION12").located(By.id("s2id_autogen6_search"));
    public static Target Region = Target.the("OPCION13").located(By.name("Region"));
    public static Target postal_Code = Target.the("OPCION14").located(By.name("PostalCode"));
    public static Target phone = Target.the("OPCION15").located(By.name("Phone"));
    public static Target Calendario = Target.the("OPCION16").located(By.name("LastContactDate"));
    public static Target dia_Calendario = Target.the("OPCION17").located(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[4]/a"));
    public static Target last_contact_by = Target.the("OPCION18").located(By.xpath("//*[@id=\"s2id_Serenity_Demo_Northwind_CustomerDialog9_LastContactedBy\"]/a/span[2]"));
    public static Target last_contact_search = Target.the("OPCION19").located(By.id("s2id_autogen7_search"));
    public static Target email = Target.the("OPCION20").located(By.name("Email"));
    public static Target check_send_bulletin = Target.the("OPCION21").located(By.name("SendBulletin"));
    public static Target boton_save = Target.the("OPCION22").located(By.xpath("//*[@id=\"Serenity_Demo_Northwind_CustomerDialog9_Toolbar\"]/div/div/div/div[1]"));
    public static Target boton_apply = Target.the("OPCION23").located(By.xpath("//*[@id=\"Serenity_Demo_Northwind_CustomerDialog9_Toolbar\"]/div/div/div/div[2]"));



}
