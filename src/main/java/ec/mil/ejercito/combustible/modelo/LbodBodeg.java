/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.ejercito.combustible.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Sofia Gomez
 */
@Entity
@Table(name = "lbod_bodeg")
@NamedQueries({
    @NamedQuery(name = "LbodBodeg.findAll", query = "SELECT l FROM LbodBodeg l")})
public class LbodBodeg implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lbodBodeg")
    private List<LcexiExiste> lcexiExisteList;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "BOD_CODIGO")
    private Long bodCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "BOD_NOMINA")
    private String bodNomina;
    @Size(max = 2)
    @Column(name = "BOD_AVANZADA")
    private String bodAvanzada;
    @Column(name = "BOD_TRANSITO")
    private Character bodTransito;
    @Size(max = 10)
    @Column(name = "BOD_SILOG")
    private String bodSilog;
    @Column(name = "BOD_CLAVE")
    private Character bodClave;
    @Column(name = "BOD_ESTADO")
    private Character bodEstado;
    @Column(name = "BOD_ORGANICO")
    private Character bodOrganico;

    public LbodBodeg() {
    }

    public LbodBodeg(Long bodCodigo) {
        this.bodCodigo = bodCodigo;
    }

    public LbodBodeg(Long bodCodigo, String bodNomina) {
        this.bodCodigo = bodCodigo;
        this.bodNomina = bodNomina;
    }

    public Long getBodCodigo() {
        return bodCodigo;
    }

    public void setBodCodigo(Long bodCodigo) {
        this.bodCodigo = bodCodigo;
    }

    public String getBodNomina() {
        return bodNomina;
    }

    public void setBodNomina(String bodNomina) {
        this.bodNomina = bodNomina;
    }

    public String getBodAvanzada() {
        return bodAvanzada;
    }

    public void setBodAvanzada(String bodAvanzada) {
        this.bodAvanzada = bodAvanzada;
    }

    public Character getBodTransito() {
        return bodTransito;
    }

    public void setBodTransito(Character bodTransito) {
        this.bodTransito = bodTransito;
    }

    public String getBodSilog() {
        return bodSilog;
    }

    public void setBodSilog(String bodSilog) {
        this.bodSilog = bodSilog;
    }

    public Character getBodClave() {
        return bodClave;
    }

    public void setBodClave(Character bodClave) {
        this.bodClave = bodClave;
    }

    public Character getBodEstado() {
        return bodEstado;
    }

    public void setBodEstado(Character bodEstado) {
        this.bodEstado = bodEstado;
    }

    public Character getBodOrganico() {
        return bodOrganico;
    }

    public void setBodOrganico(Character bodOrganico) {
        this.bodOrganico = bodOrganico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bodCodigo != null ? bodCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LbodBodeg)) {
            return false;
        }
        LbodBodeg other = (LbodBodeg) object;
        if ((this.bodCodigo == null && other.bodCodigo != null) || (this.bodCodigo != null && !this.bodCodigo.equals(other.bodCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.ejercito.combustible.modelo.LbodBodeg[ bodCodigo=" + bodCodigo + " ]";
    }

    public List<LcexiExiste> getLcexiExisteList() {
        return lcexiExisteList;
    }

    public void setLcexiExisteList(List<LcexiExiste> lcexiExisteList) {
        this.lcexiExisteList = lcexiExisteList;
    }
    
}
