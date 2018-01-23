/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.ejercito.combustible.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "lcpro_procom")
@NamedQueries({
    @NamedQuery(name = "LcproProcom.findAll", query = "SELECT l FROM LcproProcom l")})
public class LcproProcom implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "PRO_CODIGO")
    private String proCodigo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRO_CANTGAL")
    private BigDecimal proCantgal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRO_FECHACARGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date proFechacarga;
    @Column(name = "PRO_KMENTRADA")
    private BigInteger proKmentrada;
    @Size(max = 500)
    @Column(name = "PRO_MISION")
    private String proMision;
    @Size(max = 3)
    @Column(name = "PRO_ESTADO")
    private String proEstado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lcproProcom")
    private List<LcliqeLiqegr> lcliqeLiqegrList;
    @JoinColumn(name = "ART_CODIGO", referencedColumnName = "ART_CODIGO")
    @ManyToOne(optional = false)
    private LartArtic lartArtic;
    @JoinColumn(name = "REP_CODIGO", referencedColumnName = "REP_CODIGO")
    @ManyToOne(optional = false)
    private LrepRepa lrepRepa;
    @JoinColumn(name = "VEH_CODIGO_", referencedColumnName = "VEH_CODIGO_")
    @ManyToOne(optional = false)
    private LvehVehic lvehVehic;
    @JoinColumn(name = "UNI_CODIGO2", referencedColumnName = "UNI_CODIGO2")
    @ManyToOne(optional = false)
    private MuniUnida muniUnida;

    public LcproProcom() {
    }

    public LcproProcom(String proCodigo) {
        this.proCodigo = proCodigo;
    }

    public LcproProcom(String proCodigo, BigDecimal proCantgal, Date proFechacarga) {
        this.proCodigo = proCodigo;
        this.proCantgal = proCantgal;
        this.proFechacarga = proFechacarga;
    }

    public String getProCodigo() {
        return proCodigo;
    }

    public void setProCodigo(String proCodigo) {
        this.proCodigo = proCodigo;
    }

    public BigDecimal getProCantgal() {
        return proCantgal;
    }

    public void setProCantgal(BigDecimal proCantgal) {
        this.proCantgal = proCantgal;
    }

    public Date getProFechacarga() {
        return proFechacarga;
    }

    public void setProFechacarga(Date proFechacarga) {
        this.proFechacarga = proFechacarga;
    }

    public BigInteger getProKmentrada() {
        return proKmentrada;
    }

    public void setProKmentrada(BigInteger proKmentrada) {
        this.proKmentrada = proKmentrada;
    }

    public String getProMision() {
        return proMision;
    }

    public void setProMision(String proMision) {
        this.proMision = proMision;
    }

    public String getProEstado() {
        return proEstado;
    }

    public void setProEstado(String proEstado) {
        this.proEstado = proEstado;
    }

    public List<LcliqeLiqegr> getLcliqeLiqegrList() {
        return lcliqeLiqegrList;
    }

    public void setLcliqeLiqegrList(List<LcliqeLiqegr> lcliqeLiqegrList) {
        this.lcliqeLiqegrList = lcliqeLiqegrList;
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

    public LvehVehic getLvehVehic() {
        return lvehVehic;
    }

    public void setLvehVehic(LvehVehic lvehVehic) {
        this.lvehVehic = lvehVehic;
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
        hash += (proCodigo != null ? proCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LcproProcom)) {
            return false;
        }
        LcproProcom other = (LcproProcom) object;
        if ((this.proCodigo == null && other.proCodigo != null) || (this.proCodigo != null && !this.proCodigo.equals(other.proCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.ejercito.combustible.modelo.LcproProcom[ proCodigo=" + proCodigo + " ]";
    }
    
}
