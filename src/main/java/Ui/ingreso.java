package Ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ingreso {

    public static Target Message1 = Target.the("MENSAJE1").located(By.xpath("//*[@id=\"s-DashboardPage\"]/main/section/section/h1"));
    public static Target Usuario = Target.the("USUARIO").located(By.id("LoginPanel0_Username"));
    public static Target Clave = Target.the("CLAVE").located(By.id("LoginPanel0_Password"));

    public static Target LoginButton = Target.the("BUTTON").located(By.id("LoginPanel0_LoginButton"));

}
