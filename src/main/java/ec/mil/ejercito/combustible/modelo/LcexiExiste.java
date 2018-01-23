/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.ejercito.combustible.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Sofia Gomez
 */
@Entity
@Table(name = "lcexi_existe")
@NamedQueries({
    @NamedQuery(name = "LcexiExiste.findAll", query = "SELECT l FROM LcexiExiste l")})
public class LcexiExiste implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "EXI_CODIGO")
    private Integer exiCodigo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "EXI_CANTITOTA")
    private BigDecimal exiCantitota;
    @Column(name = "EXI_VALORTOTA")
    private BigDecimal exiValortota;
    @JoinColumn(name = "BOD_CODIGO", referencedColumnName = "BOD_CODIGO")
    @ManyToOne(optional = false)
    private LbodBodeg lbodBodeg;
    @JoinColumn(name = "ART_CODIGO", referencedColumnName = "ART_CODIGO")
    @ManyToOne(optional = false)
    private LartArtic lartArtic;
    @JoinColumn(name = "GUI_CODCONF", referencedColumnName = "GUI_CODCONF")
    @ManyToOne(optional = false)
    private LcguiGuirem lcguiGuirem;
    @JoinColumn(name = "UNI_CODIGO2", referencedColumnName = "UNI_CODIGO2")
    @ManyToOne(optional = false)
    private MuniUnida muniUnida;

    public LcexiExiste() {
    }

    public LcexiExiste(Integer exiCodigo) {
        this.exiCodigo = exiCodigo;
    }

    public LcexiExiste(Integer exiCodigo, BigDecimal exiCantitota) {
        this.exiCodigo = exiCodigo;
        this.exiCantitota = exiCantitota;
    }

    public Integer getExiCodigo() {
        return exiCodigo;
    }

    public void setExiCodigo(Integer exiCodigo) {
        this.exiCodigo = exiCodigo;
    }

    public BigDecimal getExiCantitota() {
        return exiCantitota;
    }

    public void setExiCantitota(BigDecimal exiCantitota) {
        this.exiCantitota = exiCantitota;
    }

    public BigDecimal getExiValortota() {
        return exiValortota;
    }

    public void setExiValortota(BigDecimal exiValortota) {
        this.exiValortota = exiValortota;
    }

    public LbodBodeg getLbodBodeg() {
        return lbodBodeg;
    }

    public void setLbodBodeg(LbodBodeg lbodBodeg) {
        this.lbodBodeg = lbodBodeg;
    }

    public LartArtic getLartArtic() {
        return lartArtic;
    }

    public void setLartArtic(LartArtic lartArtic) {
        this.lartArtic = lartArtic;
    }

    public LcguiGuirem getLcguiGuirem() {
        return lcguiGuirem;
    }

    public void setLcguiGuirem(LcguiGuirem lcguiGuirem) {
        this.lcguiGuirem = lcguiGuirem;
    }

    public MuniUnida getMuniUnida() {
        return muniUnida;
    }

    public void setMuniUnida(MuniUnida muniUnida) {
        this.muniUnida = muniUnida;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (exiCodigo != null ? exiCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LcexiExiste)) {
            return false;
        }
        LcexiExiste other = (LcexiExiste) object;
        if ((this.exiCodigo == null && other.exiCodigo != null) || (this.exiCodigo != null && !this.exiCodigo.equals(other.exiCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.ejercito.combustible.modelo.LcexiExiste[ exiCodigo=" + exiCodigo + " ]";
    }
    
}
