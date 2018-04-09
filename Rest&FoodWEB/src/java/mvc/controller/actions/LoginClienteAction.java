package mvc.controller.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mvc.controller.exceptions.ContraseñaException;
import mvc.controller.exceptions.EmailException;
import mvc.vista.formbeans.LoginClienteForm;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginClienteAction extends org.apache.struts.action.Action{

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, 
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        LoginClienteForm clienteForm = (LoginClienteForm) form;
        
        String correo = clienteForm.getCorreo();
        String contraseña = clienteForm.getContraseña();
        
        if(!correo.endsWith(".es") && !correo.endsWith(".org")){
            throw new EmailException();
        }
        
        if(!contraseña.startsWith("a")){
            throw new ContraseñaException();
        }
        
        clienteForm.setContraseña(contraseña);
        clienteForm.setCorreo(correo);
        
        
        return mapping.findForward("login_cliente_ok");
        
    }
    
    
}
