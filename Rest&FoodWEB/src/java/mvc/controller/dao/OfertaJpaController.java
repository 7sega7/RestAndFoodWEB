package mvc.controller.dao;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import mvc.model.entidades.Oferta;

public class OfertaJpaController implements Serializable {

    public OfertaJpaController() {
        this.emf = Persistence.createEntityManagerFactory("PU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    private List<Oferta> findByTitulo(String titulo) {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createNamedQuery("Oferta.findByTitulo");
            query.setParameter("titulo", titulo);
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Oferta findOferta(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Oferta.class, id);
        } finally {
            em.close();
        }
    }

    public int getOfertaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Oferta> rt = cq.from(Oferta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
