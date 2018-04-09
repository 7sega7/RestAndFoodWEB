package mvc.vista.formbeans;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.Globals;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class BuscarOfertaForm extends ActionForm {

    private String busqueda = "";

    public BuscarOfertaForm() {
    }

    public String getBusqueda() {
        return busqueda;
    }

    public void setBusqueda(String busqueda) {
        this.busqueda = busqueda;
    }

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {

        ActionErrors errors = new ActionErrors();

        if (getBusqueda().isEmpty()) {
            errors.add(Globals.MESSAGE_KEY, new ActionMessage("errors.field", "busqueda"));
        }

        return errors;
    }

}
