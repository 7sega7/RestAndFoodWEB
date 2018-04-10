package mvc.controller.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class DesconectarAction extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        // Recuperar sesion SIN CREARLA caso de  no existir
        HttpSession session = request.getSession(false);

        if (session != null) {
            session.invalidate();
        }

        return mapping.findForward("desconexion");
    }
    
}
