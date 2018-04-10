package mvc.vista.formbeans;

import org.apache.struts.action.ActionForm;

public class BuscarRestauranteForm extends ActionForm {

    private String busqueda = "";

    public BuscarRestauranteForm() {
    }

    public String getBusqueda() {
        return busqueda;
    }

    public void setBusqueda(String busqueda) {
        this.busqueda = busqueda;
    }

}
