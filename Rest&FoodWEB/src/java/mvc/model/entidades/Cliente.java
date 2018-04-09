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

/**
 *
 * @author Grupo 1 Java
 */
@Entity
@Table(name = "cliente")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")
    , @NamedQuery(name = "Cliente.loginCliente", query = "SELECT c FROM Cliente c WHERE c.correoCliente = :correoCliente AND c.contraseña = :contraseña")
    , @NamedQuery(name = "Cliente.findByCorreoCliente", query = "SELECT c FROM Cliente c WHERE c.correoCliente = :correoCliente")
    , @NamedQuery(name = "Cliente.findByNombreCliente", query = "SELECT c FROM Cliente c WHERE c.nombreCliente = :nombreCliente")
    , @NamedQuery(name = "Cliente.findByApellidosCliente", query = "SELECT c FROM Cliente c WHERE c.apellidosCliente = :apellidosCliente")
    , @NamedQuery(name = "Cliente.findByDireccionCliente", query = "SELECT c FROM Cliente c WHERE c.direccionCliente = :direccionCliente")
    , @NamedQuery(name = "Cliente.findByCodigoPostal", query = "SELECT c FROM Cliente c WHERE c.codigoPostal = :codigoPostal")
    , @NamedQuery(name = "Cliente.findByCiudadCliente", query = "SELECT c FROM Cliente c WHERE c.ciudadCliente = :ciudadCliente")
    , @NamedQuery(name = "Cliente.findByContrase\u00f1a", query = "SELECT c FROM Cliente c WHERE c.contrase\u00f1a = :contrase\u00f1a")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Basic(optional = false)
    @Column(name = "correo_cliente")
    private String correoCliente;
    @Basic(optional = false)
    @Column(name = "nombre_cliente")
    private String nombreCliente;
    @Column(name = "apellidos_cliente")
    private String apellidosCliente;
    @Basic(optional = false)
    @Column(name = "direccion_cliente")
    private String direccionCliente;
    @Basic(optional = false)
    @Column(name = "codigo_postal")
    private int codigoPostal;
    @Basic(optional = false)
    @Column(name = "ciudad_cliente")
    private String ciudadCliente;
    @Basic(optional = false)
    @Column(name = "contrase\u00f1a")
    private String contraseña;

    public Cliente() {
    }

    public Cliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(Integer idCliente, String correoCliente, String nombreCliente, String direccionCliente, int codigoPostal, String ciudadCliente, String contraseña) {
        this.idCliente = idCliente;
        this.correoCliente = correoCliente;
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.codigoPostal = codigoPostal;
        this.ciudadCliente = ciudadCliente;
        this.contraseña = contraseña;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudadCliente() {
        return ciudadCliente;
    }

    public void setCiudadCliente(String ciudadCliente) {
        this.ciudadCliente = ciudadCliente;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mvc.model.entidades.Cliente[ idCliente=" + idCliente + " ]";
    }
    
}
