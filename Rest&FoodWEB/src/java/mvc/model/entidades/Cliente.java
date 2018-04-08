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

@Entity
@Table(name = "cliente")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")})
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
    @Column(name = "pass_cliente")
    private String passCliente;
    @Basic(optional = false)
    @Column(name = "nombre_cliente")
    private String nombreCliente;
    @Column(name = "apll_cliente")
    private String apllCliente;
    @Basic(optional = false)
    @Column(name = "dir_cliente")
    private String dirCliente;
    @Basic(optional = false)
    @Column(name = "cod_postal_cliente")
    private int codPostalCliente;
    @Basic(optional = false)
    @Column(name = "ciudad_cliente")
    private String ciudadCliente;

    public Cliente() {
    }

    public Cliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(Integer idCliente, String correoCliente, String passCliente, String nombreCliente, String dirCliente, int codPostalCliente, String ciudadCliente) {
        this.idCliente = idCliente;
        this.correoCliente = correoCliente;
        this.passCliente = passCliente;
        this.nombreCliente = nombreCliente;
        this.dirCliente = dirCliente;
        this.codPostalCliente = codPostalCliente;
        this.ciudadCliente = ciudadCliente;
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

    public String getPassCliente() {
        return passCliente;
    }

    public void setPassCliente(String passCliente) {
        this.passCliente = passCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApllCliente() {
        return apllCliente;
    }

    public void setApllCliente(String apllCliente) {
        this.apllCliente = apllCliente;
    }

    public String getDirCliente() {
        return dirCliente;
    }

    public void setDirCliente(String dirCliente) {
        this.dirCliente = dirCliente;
    }

    public int getCodPostalCliente() {
        return codPostalCliente;
    }

    public void setCodPostalCliente(int codPostalCliente) {
        this.codPostalCliente = codPostalCliente;
    }

    public String getCiudadCliente() {
        return ciudadCliente;
    }

    public void setCiudadCliente(String ciudadCliente) {
        this.ciudadCliente = ciudadCliente;
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
