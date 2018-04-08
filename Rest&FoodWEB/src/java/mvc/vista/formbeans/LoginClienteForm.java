package mvc.vista.formbeans;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.Globals;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class LoginClienteForm extends ActionForm{
    
    private String correo = "";
    private String contraseña = "";

    public LoginClienteForm() {
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        
        ActionErrors errors = new ActionErrors();
        
        if(getCorreo().isEmpty()){
            errors.add(Globals.MESSAGE_KEY, new ActionMessage("errors.field", "correo"));
        }
        
        if(getContraseña().isEmpty()){
            errors.add(Globals.MESSAGE_KEY, new ActionMessage("errors.field", "contraseña"));
        }
    
        return errors;
    }
    
}
