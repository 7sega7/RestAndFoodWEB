package mvc.controller.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
        String pass = clienteForm.getContraseña();
        
        
        
        
        return mapping.findForward("login_cliente_ok");
        
    }
    
    
}
