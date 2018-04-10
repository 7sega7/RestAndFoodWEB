/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controller.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import mvc.model.entidades.Oferta;
import static mvc.model.entidades.Oferta_.titulo;
import mvc.model.entidades.Restaurante;

/**
 *
 * @author Grupo 1 Java
 */
public class OfertaJpaController implements Serializable {

    public OfertaJpaController() {
        this.emf = Persistence.createEntityManagerFactory("PU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Oferta oferta) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(oferta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public List<Oferta> findOfertas() {
        return findOfertas(true, -1, -1);
    }

    public List<Oferta> findOfertas(int maxResults, int firstResult) {
        return findOfertas(false, maxResults, firstResult);
    }

    private List<Oferta> findOfertas(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Oferta.class));
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

    public List<Oferta> findOfertaTitulo(String titulo) {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createNamedQuery("Oferta.findByTitulo");
            query.setParameter("titulo", titulo);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
    
    public List<Oferta> findOfertaToCliente(Integer postal, String ciudad) {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createNamedQuery("Restaurante.findByCodigoPostalAndCiudad");
            query.setParameter("codigoPostal", postal);
            query.setParameter("ciudad", ciudad);
            List<Restaurante> restaurantes = query.getResultList();
            List<Oferta> ofertas = new ArrayList<>();
            for(Restaurante r : restaurantes){
                for(Oferta of : r.getOfertaList()){
                    ofertas.add(of);
                }
            }    
            return ofertas;
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
