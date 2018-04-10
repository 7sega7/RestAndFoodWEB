package mvc.controller.actions;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import mvc.controller.dao.OfertaJpaController;
import mvc.model.entidades.Oferta;
import mvc.vista.formbeans.BuscarOfertaForm;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class BuscarOfertaAction extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception {

        BuscarOfertaForm buscarForm = (BuscarOfertaForm) form;

        String busqueda = buscarForm.getBusqueda();

        OfertaJpaController controller = new OfertaJpaController();

        List<Oferta> of = null;
        try {
           of = controller.findOfertaTitulo(busqueda);
           
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }

        request.setAttribute("ofertas", of);
        request.setAttribute("paramBusqueda", busqueda);
        return mapping.findForward("busqueda_titulo_ok");
    }

}
