package mvc.vista.formbeans;

import org.apache.struts.action.ActionForm;

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

}
