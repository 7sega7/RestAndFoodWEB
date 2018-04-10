/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controller.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import mvc.model.entidades.Restaurante;

/**
 *
 * @author Grupo 1 Java
 */
public class RestauranteJpaController implements Serializable {

    public RestauranteJpaController() {
        this.emf = Persistence.createEntityManagerFactory("PU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public List<Restaurante> findRestaurantes() {
        return findRestaurantes(true, -1, -1);
    }

    public List<Restaurante> findRestaurantes(int maxResults, int firstResult) {
        return findRestaurantes(false, maxResults, firstResult);
    }

    private List<Restaurante> findRestaurantes(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Restaurante.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public List<Restaurante> findRestauranteNombre(String nombre) {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createNamedQuery("Restaurante.findByNombre");
            query.setParameter("nombre", nombre);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
    
    public List<Restaurante> findRestaurantePostalAndCity(Integer postal, String ciudad) {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createNamedQuery("Restaurante.findByCodigoPostalAndCiudad");
            query.setParameter("codigoPostal", postal);
            query.setParameter("ciudad", ciudad);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    public int getRestauranteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Restaurante> rt = cq.from(Restaurante.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
