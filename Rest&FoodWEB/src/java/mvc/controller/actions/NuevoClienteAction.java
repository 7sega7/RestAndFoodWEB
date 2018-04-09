package mvc.controller.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mvc.controller.dao.ClienteJpaController;
import mvc.model.entidades.Cliente;
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
        String postal = newclienteform.getPostal();
        
        ClienteJpaController controller = new ClienteJpaController();
        try {
            
            
            
            Cliente c = new Cliente(email, nombre, apellidos, direccion, 
                    Integer.parseInt(postal), ciudad, password);
            
            controller.create(c);

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

        return mapping.findForward("crear_cliente_ok");
    }
}
