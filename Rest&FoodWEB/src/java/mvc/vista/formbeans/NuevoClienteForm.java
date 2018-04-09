package mvc.vista.formbeans;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.Globals;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionForm;

public class NuevoClienteForm extends ActionForm {

    private String nombre = "";

    private String email = "";

    private String apellidos = "";

    private String direccion = "";

    private String postal = "";

    private String ciudad = "";

    private String password = "";

    private String repassword = "";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public NuevoClienteForm() {
    }

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();

        /*
            Clave del error de validacion Globals.MESSAGE_KEY para que se pueda recuperar
            posteriormente con la etiqueta <html:errors>. El error se crea con
            objeto de la clase ActionMessage. Especificamos el mensaje del error,
            recuperado del fichero de propiedades de la aplicacion. Como en este
            caso tiene un parametro de entrada pasamos un segundo valor
         */
        if (getNombre().isEmpty() || getCiudad().isEmpty() || getDireccion().isEmpty()
                || getEmail().isEmpty() || request.getParameter("postal").length() != 5) {
            errors.add(Globals.MESSAGE_KEY, new ActionMessage(
                    "errors.createcliente"));
        }

        if (!getPassword().equals(getRepassword())) {
            errors.add(Globals.MESSAGE_KEY, new ActionMessage(
                    "errors.repass"));
        }

        return errors;
    }
}
