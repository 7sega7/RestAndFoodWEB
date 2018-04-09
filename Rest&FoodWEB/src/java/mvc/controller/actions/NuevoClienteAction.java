
package mvc.controller.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mvc.vista.formbeans.NuevoClienteForm;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


public class NuevoClienteAction extends org.apache.struts.action.Action {

  
   
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        
        NuevoClienteForm newclienteform = (NuevoClienteForm) form;
        
        String nombre = newclienteform.getNombre();
        String apellidos = newclienteform.getApellidos();
        String email = newclienteform.getEmail();
        String direccion = newclienteform.getDireccion();
        String ciudad = newclienteform.getCiudad();
        String password = newclienteform.getPassword();
        String repassword = newclienteform.getRepassword();
        
        
        
        
        return mapping.findForward("login_cliente_ok");
    }
}
