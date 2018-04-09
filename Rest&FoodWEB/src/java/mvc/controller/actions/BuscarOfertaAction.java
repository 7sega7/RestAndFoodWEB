package mvc.controller.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import mvc.controller.dao.ClienteJpaController;
import mvc.model.entidades.Cliente;
import mvc.vista.formbeans.BuscarOfertaForm;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class BuscarOfertaAction extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception {

        BuscarOfertaForm clienteForm = (BuscarOfertaForm) form;

        HttpSession session = request.getSession();

        String busqueda = clienteForm.getBusqueda();

        ClienteJpaController controller = new ClienteJpaController();

        Cliente c = null;
        try {
            c = controller.loginCliente(correo, contrasena);

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }

        session.setAttribute("usuario", c);

        return mapping.findForward("login_cliente_ok");
    }

}
