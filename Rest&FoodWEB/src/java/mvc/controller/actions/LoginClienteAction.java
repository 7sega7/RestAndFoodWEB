package mvc.controller.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mvc.controller.dao.ClienteJpaController;
import mvc.controller.exceptions.ContraseñaException;
import mvc.controller.exceptions.EmailException;
import mvc.controller.exceptions.LoginException;
import mvc.model.entidades.Cliente;
import mvc.vista.formbeans.LoginClienteForm;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginClienteAction extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception {

        LoginClienteForm clienteForm = (LoginClienteForm) form;

        String correo = clienteForm.getCorreo();
        String contrasena = clienteForm.getContrasena();

        ClienteJpaController controller = new ClienteJpaController();
        try {
            Cliente c = controller.loginCliente(correo, contrasena);

            request.setAttribute("correo", c.getCorreoCliente());
            request.setAttribute("contrasena", c.getContraseña());
            request.setAttribute("nombre", c.getNombreCliente());
            request.setAttribute("apell", c.getApellidosCliente());
            request.setAttribute("dire", c.getDireccionCliente());
            request.setAttribute("cod_postal", c.getCodigoPostal());
            request.setAttribute("ciudad", c.getCiudadCliente());

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return mapping.findForward("login_cliente_ok");
    }

}
