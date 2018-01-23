/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.ejercito.combustible.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Sofia Gomez
 */
@Entity
@Table(name = "lcliq_liquni")
@NamedQueries({
    @NamedQuery(name = "LcliqLiquni.findAll", query = "SELECT l FROM LcliqLiquni l")})
public class LcliqLiquni implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "LIQ_CODIGO")
    private String liqCodigo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LIQ_TOTING")
    private BigDecimal liqToting;
    @Column(name = "LIQ_TOTEGR")
    private BigDecimal liqTotegr;
    @Column(name = "LIQ_SALDO")
    private BigDecimal liqSaldo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LIQ_FECHA")
    @Temporal(TemporalType.DATE)
    private Date liqFecha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lcliqLiquni")
    private List<LcliqeLiqegr> lcliqeLiqegrList;
    @JoinColumn(name = "UNI_CODIGO2", referencedColumnName = "UNI_CODIGO2")
    @ManyToOne(optional = false)
    private MuniUnida muniUnida;
    @JoinColumn(name = "ART_CODIGO", referencedColumnName = "ART_CODIGO")
    @ManyToOne(optional = false)
    private LartArtic lartArtic;
    @JoinColumn(name = "REP_CODIGO", referencedColumnName = "REP_CODIGO")
    @ManyToOne(optional = false)
    private LrepRepa lrepRepa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lcliqLiquni")
    private List<LcliqiLiqing> lcliqiLiqingList;

    public LcliqLiquni() {
    }

    public LcliqLiquni(String liqCodigo) {
        this.liqCodigo = liqCodigo;
    }

    public LcliqLiquni(String liqCodigo, Date liqFecha) {
        this.liqCodigo = liqCodigo;
        this.liqFecha = liqFecha;
    }

    public String getLiqCodigo() {
        return liqCodigo;
    }

    public void setLiqCodigo(String liqCodigo) {
        this.liqCodigo = liqCodigo;
    }

    public BigDecimal getLiqToting() {
        return liqToting;
    }

    public void setLiqToting(BigDecimal liqToting) {
        this.liqToting = liqToting;
    }

    public BigDecimal getLiqTotegr() {
        return liqTotegr;
    }

    public void setLiqTotegr(BigDecimal liqTotegr) {
        this.liqTotegr = liqTotegr;
    }

    public BigDecimal getLiqSaldo() {
        return liqSaldo;
    }

    public void setLiqSaldo(BigDecimal liqSaldo) {
        this.liqSaldo = liqSaldo;
    }

    public Date getLiqFecha() {
        return liqFecha;
    }

    public void setLiqFecha(Date liqFecha) {
        this.liqFecha = liqFecha;
    }

    public List<LcliqeLiqegr> getLcliqeLiqegrList() {
        return lcliqeLiqegrList;
    }

    public void setLcliqeLiqegrList(List<LcliqeLiqegr> lcliqeLiqegrList) {
        this.lcliqeLiqegrList = lcliqeLiqegrList;
    }

    public MuniUnida getMuniUnida() {
        return muniUnida;
    }

    public void setMuniUnida(MuniUnida muniUnida) {
        this.muniUnida = muniUnida;
    }

    public LartArtic getLartArtic() {
        return lartArtic;
    }

    public void setLartArtic(LartArtic lartArtic) {
        this.lartArtic = lartArtic;
    }

    public LrepRepa getLrepRepa() {
        return lrepRepa;
    }

    public void setLrepRepa(LrepRepa lrepRepa) {
        this.lrepRepa = lrepRepa;
    }

    public List<LcliqiLiqing> getLcliqiLiqingList() {
        return lcliqiLiqingList;
    }

    public void setLcliqiLiqingList(List<LcliqiLiqing> lcliqiLiqingList) {
        this.lcliqiLiqingList = lcliqiLiqingList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (liqCodigo != null ? liqCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LcliqLiquni)) {
            return false;
        }
        LcliqLiquni other = (LcliqLiquni) object;
        if ((this.liqCodigo == null && other.liqCodigo != null) || (this.liqCodigo != null && !this.liqCodigo.equals(other.liqCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.ejercito.combustible.modelo.LcliqLiquni[ liqCodigo=" + liqCodigo + " ]";
    }
    
}
