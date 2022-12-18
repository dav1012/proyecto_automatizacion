package Models;

public class OpcionesLogin {

    public String nombreusuario,clave;

    public OpcionesLogin(String nombreusuario, String clave) {
        this.nombreusuario = nombreusuario;
        this.clave = clave;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public String getClave() {
        return clave;
    }
}
