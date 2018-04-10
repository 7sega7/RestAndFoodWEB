package mvc.controller.actions;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mvc.controller.dao.RestauranteJpaController;
import mvc.model.entidades.Restaurante;
import mvc.vista.formbeans.BuscarRestauranteForm;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class BuscarRestauranteClienteAction extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception {

        BuscarRestauranteForm buscarForm = (BuscarRestauranteForm) form;

        String busqueda = buscarForm.getBusqueda();

        RestauranteJpaController controller = new RestauranteJpaController();

        List<Restaurante> r = null;
        try {
           r = controller.findRestauranteNombre(busqueda);
           
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }

        request.setAttribute("restaurante", r);
        request.setAttribute("paramBusqueda", busqueda);
        return mapping.findForward("busqueda_nombre_ok");
    }

}
