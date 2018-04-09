package mvc.vista.formbeans;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.Globals;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class LoginClienteForm extends ActionForm{
    
    private String correo = "";
    private String contrasena = "";

    public LoginClienteForm() {
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        
        ActionErrors errors = new ActionErrors();
        
        if(getCorreo().isEmpty()){
            errors.add(Globals.MESSAGE_KEY, new ActionMessage("errors.field", "correo"));
        }
        
        if(getContrasena().isEmpty()){
            errors.add(Globals.MESSAGE_KEY, new ActionMessage("errors.field", "contrasena"));
        }
    
        return errors;
    }
    
}
