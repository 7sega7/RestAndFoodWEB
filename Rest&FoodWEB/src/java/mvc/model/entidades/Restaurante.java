/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.model.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Elvis-admin
 */
@Entity
@Table(name = "restaurante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Restaurante.findAll", query = "SELECT r FROM Restaurante r")
    , @NamedQuery(name = "Restaurante.findByIdRestaurante", query = "SELECT r FROM Restaurante r WHERE r.idRestaurante = :idRestaurante")
    , @NamedQuery(name = "Restaurante.findByDireccion", query = "SELECT r FROM Restaurante r WHERE r.direccion = :direccion")
    , @NamedQuery(name = "Restaurante.findByNombre", query = "SELECT r FROM Restaurante r WHERE r.nombre = :nombre")
    , @NamedQuery(name = "Restaurante.findByCodigoPostal", query = "SELECT r FROM Restaurante r WHERE r.codigoPostal = :codigoPostal")
    , @NamedQuery(name = "Restaurante.findByCiudad", query = "SELECT r FROM Restaurante r WHERE r.ciudad = :ciudad")})
public class Restaurante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_restaurante")
    private Integer idRestaurante;
    @Basic(optional = false)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "codigo_postal")
    private int codigoPostal;
    @Basic(optional = false)
    @Column(name = "ciudad")
    private String ciudad;

    public Restaurante() {
    }

    public Restaurante(Integer idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public Restaurante(Integer idRestaurante, String direccion, String nombre, int codigoPostal, String ciudad) {
        this.idRestaurante = idRestaurante;
        this.direccion = direccion;
        this.nombre = nombre;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    }

    public Integer getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(Integer idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRestaurante != null ? idRestaurante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Restaurante)) {
            return false;
        }
        Restaurante other = (Restaurante) object;
        if ((this.idRestaurante == null && other.idRestaurante != null) || (this.idRestaurante != null && !this.idRestaurante.equals(other.idRestaurante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mvc.model.entidades.Restaurante[ idRestaurante=" + idRestaurante + " ]";
    }
    
}
