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
@Table(name = "lcing_ingfac")
@NamedQueries({
    @NamedQuery(name = "LcingIngfac.findAll", query = "SELECT l FROM LcingIngfac l")})
public class LcingIngfac implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "ING_CODIGO")
    private String ingCodigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ING_FETRAN")
    @Temporal(TemporalType.DATE)
    private Date ingFetran;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ING_FEDOC")
    @Temporal(TemporalType.DATE)
    private Date ingFedoc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ING_NUMFAC")
    private String ingNumfac;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ING_CODCON")
    private String ingCodcon;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ING_TERMIN")
    private String ingTermin;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "ING_CANTPROD")
    private BigDecimal ingCantprod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ING_PRCTOT")
    private BigDecimal ingPrctot;
    @JoinColumn(name = "UNI_CODIGO2", referencedColumnName = "UNI_CODIGO2")
    @ManyToOne(optional = false)
    private MuniUnida muniUnida;
    @JoinColumn(name = "ART_CODIGO", referencedColumnName = "ART_CODIGO")
    @ManyToOne(optional = false)
    private LartArtic lartArtic;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lcingIngfac")
    private List<LcliqiLiqing> lcliqiLiqingList;

    public LcingIngfac() {
    }

    public LcingIngfac(String ingCodigo) {
        this.ingCodigo = ingCodigo;
    }

    public LcingIngfac(String ingCodigo, Date ingFetran, Date ingFedoc, String ingNumfac, String ingCodcon, String ingTermin, BigDecimal ingCantprod, BigDecimal ingPrctot) {
        this.ingCodigo = ingCodigo;
        this.ingFetran = ingFetran;
        this.ingFedoc = ingFedoc;
        this.ingNumfac = ingNumfac;
        this.ingCodcon = ingCodcon;
        this.ingTermin = ingTermin;
        this.ingCantprod = ingCantprod;
        this.ingPrctot = ingPrctot;
    }

    public String getIngCodigo() {
        return ingCodigo;
    }

    public void setIngCodigo(String ingCodigo) {
        this.ingCodigo = ingCodigo;
    }

    public Date getIngFetran() {
        return ingFetran;
    }

    public void setIngFetran(Date ingFetran) {
        this.ingFetran = ingFetran;
    }

    public Date getIngFedoc() {
        return ingFedoc;
    }

    public void setIngFedoc(Date ingFedoc) {
        this.ingFedoc = ingFedoc;
    }

    public String getIngNumfac() {
        return ingNumfac;
    }

    public void setIngNumfac(String ingNumfac) {
        this.ingNumfac = ingNumfac;
    }

    public String getIngCodcon() {
        return ingCodcon;
    }

    public void setIngCodcon(String ingCodcon) {
        this.ingCodcon = ingCodcon;
    }

    public String getIngTermin() {
        return ingTermin;
    }

    public void setIngTermin(String ingTermin) {
        this.ingTermin = ingTermin;
    }

    public BigDecimal getIngCantprod() {
        return ingCantprod;
    }

    public void setIngCantprod(BigDecimal ingCantprod) {
        this.ingCantprod = ingCantprod;
    }

    public BigDecimal getIngPrctot() {
        return ingPrctot;
    }

    public void setIngPrctot(BigDecimal ingPrctot) {
        this.ingPrctot = ingPrctot;
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

    public List<LcliqiLiqing> getLcliqiLiqingList() {
        return lcliqiLiqingList;
    }

    public void setLcliqiLiqingList(List<LcliqiLiqing> lcliqiLiqingList) {
        this.lcliqiLiqingList = lcliqiLiqingList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ingCodigo != null ? ingCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LcingIngfac)) {
            return false;
        }
        LcingIngfac other = (LcingIngfac) object;
        if ((this.ingCodigo == null && other.ingCodigo != null) || (this.ingCodigo != null && !this.ingCodigo.equals(other.ingCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.ejercito.combustible.modelo.LcingIngfac[ ingCodigo=" + ingCodigo + " ]";
    }
    
}
