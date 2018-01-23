/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.ejercito.combustible.modelo;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Sofia Gomez
 */
@Entity
@Table(name = "muni_unida")
@NamedQueries({
    @NamedQuery(name = "MuniUnida.findAll", query = "SELECT m FROM MuniUnida m")})
public class MuniUnida implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "UNI_CODIGO2")
    private String uniCodigo2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "UNI_DESCRI2")
    private String uniDescri2;
    @Size(max = 30)
    @Column(name = "UNI_SIGLAS2")
    private String uniSiglas2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UNI_FECCRE")
    @Temporal(TemporalType.DATE)
    private Date uniFeccre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UNI_RANCHO")
    private Character uniRancho;
    @Column(name = "UNI_NUMNIV")
    private Integer uniNumniv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UNI_GUARNI")
    private Character uniGuarni;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UNI_ESTADO")
    private Character uniEstado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UNI_INDEPEN")
    private Character uniIndepen;
    @Column(name = "UNI_CODFIN")
    private Short uniCodfin;
    @Column(name = "UNI_CAMPA")
    private Character uniCampa;
    @Column(name = "UNI_ORDEN")
    private Short uniOrden;
    @Column(name = "UNI_DOCT")
    private Character uniDoct;
    @Column(name = "UNI_MOVIL")
    private Character uniMovil;
    @Column(name = "UNI_SECUNI")
    private Integer uniSecuni;
    @Column(name = "UNI_GEREN")
    private Integer uniGeren;
    @Column(name = "UNI_PRIORIDAD")
    private Integer uniPrioridad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "muniUnida")
    private List<LcingIngfac> lcingIngfacList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "muniUnida")
    private List<LcexiExiste> lcexiExisteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "muniUnida")
    private List<LcliqLiquni> lcliqLiquniList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "muniUnida")
    private List<LcproProcom> lcproProcomList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "muniUnida")
    private List<LcasiAsidin> lcasiAsidinList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "muniUnida")
    private List<LcencEncreq> lcencEncreqList;

    public MuniUnida() {
    }

    public MuniUnida(String uniCodigo2) {
        this.uniCodigo2 = uniCodigo2;
    }

    public MuniUnida(String uniCodigo2, String uniDescri2, Date uniFeccre, Character uniRancho, Character uniGuarni, Character uniEstado, Character uniIndepen) {
        this.uniCodigo2 = uniCodigo2;
        this.uniDescri2 = uniDescri2;
        this.uniFeccre = uniFeccre;
        this.uniRancho = uniRancho;
        this.uniGuarni = uniGuarni;
        this.uniEstado = uniEstado;
        this.uniIndepen = uniIndepen;
    }

    public String getUniCodigo2() {
        return uniCodigo2;
    }

    public void setUniCodigo2(String uniCodigo2) {
        this.uniCodigo2 = uniCodigo2;
    }

    public String getUniDescri2() {
        return uniDescri2;
    }

    public void setUniDescri2(String uniDescri2) {
        this.uniDescri2 = uniDescri2;
    }

    public String getUniSiglas2() {
        return uniSiglas2;
    }

    public void setUniSiglas2(String uniSiglas2) {
        this.uniSiglas2 = uniSiglas2;
    }

    public Date getUniFeccre() {
        return uniFeccre;
    }

    public void setUniFeccre(Date uniFeccre) {
        this.uniFeccre = uniFeccre;
    }

    public Character getUniRancho() {
        return uniRancho;
    }

    public void setUniRancho(Character uniRancho) {
        this.uniRancho = uniRancho;
    }

    public Integer getUniNumniv() {
        return uniNumniv;
    }

    public void setUniNumniv(Integer uniNumniv) {
        this.uniNumniv = uniNumniv;
    }

    public Character getUniGuarni() {
        return uniGuarni;
    }

    public void setUniGuarni(Character uniGuarni) {
        this.uniGuarni = uniGuarni;
    }

    public Character getUniEstado() {
        return uniEstado;
    }

    public void setUniEstado(Character uniEstado) {
        this.uniEstado = uniEstado;
    }

    public Character getUniIndepen() {
        return uniIndepen;
    }

    public void setUniIndepen(Character uniIndepen) {
        this.uniIndepen = uniIndepen;
    }

    public Short getUniCodfin() {
        return uniCodfin;
    }

    public void setUniCodfin(Short uniCodfin) {
        this.uniCodfin = uniCodfin;
    }

    public Character getUniCampa() {
        return uniCampa;
    }

    public void setUniCampa(Character uniCampa) {
        this.uniCampa = uniCampa;
    }

    public Short getUniOrden() {
        return uniOrden;
    }

    public void setUniOrden(Short uniOrden) {
        this.uniOrden = uniOrden;
    }

    public Character getUniDoct() {
        return uniDoct;
    }

    public void setUniDoct(Character uniDoct) {
        this.uniDoct = uniDoct;
    }

    public Character getUniMovil() {
        return uniMovil;
    }

    public void setUniMovil(Character uniMovil) {
        this.uniMovil = uniMovil;
    }

    public Integer getUniSecuni() {
        return uniSecuni;
    }

    public void setUniSecuni(Integer uniSecuni) {
        this.uniSecuni = uniSecuni;
    }

    public Integer getUniGeren() {
        return uniGeren;
    }

    public void setUniGeren(Integer uniGeren) {
        this.uniGeren = uniGeren;
    }

    public Integer getUniPrioridad() {
        return uniPrioridad;
    }

    public void setUniPrioridad(Integer uniPrioridad) {
        this.uniPrioridad = uniPrioridad;
    }

    public List<LcingIngfac> getLcingIngfacList() {
        return lcingIngfacList;
    }

    public void setLcingIngfacList(List<LcingIngfac> lcingIngfacList) {
        this.lcingIngfacList = lcingIngfacList;
    }

    public List<LcexiExiste> getLcexiExisteList() {
        return lcexiExisteList;
    }

    public void setLcexiExisteList(List<LcexiExiste> lcexiExisteList) {
        this.lcexiExisteList = lcexiExisteList;
    }

    public List<LcliqLiquni> getLcliqLiquniList() {
        return lcliqLiquniList;
    }

    public void setLcliqLiquniList(List<LcliqLiquni> lcliqLiquniList) {
        this.lcliqLiquniList = lcliqLiquniList;
    }

    public List<LcproProcom> getLcproProcomList() {
        return lcproProcomList;
    }

    public void setLcproProcomList(List<LcproProcom> lcproProcomList) {
        this.lcproProcomList = lcproProcomList;
    }

    public List<LcasiAsidin> getLcasiAsidinList() {
        return lcasiAsidinList;
    }

    public void setLcasiAsidinList(List<LcasiAsidin> lcasiAsidinList) {
        this.lcasiAsidinList = lcasiAsidinList;
    }

    public List<LcencEncreq> getLcencEncreqList() {
        return lcencEncreqList;
    }

    public void setLcencEncreqList(List<LcencEncreq> lcencEncreqList) {
        this.lcencEncreqList = lcencEncreqList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uniCodigo2 != null ? uniCodigo2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MuniUnida)) {
            return false;
        }
        MuniUnida other = (MuniUnida) object;
        if ((this.uniCodigo2 == null && other.uniCodigo2 != null) || (this.uniCodigo2 != null && !this.uniCodigo2.equals(other.uniCodigo2))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.ejercito.combustible.modelo.MuniUnida[ uniCodigo2=" + uniCodigo2 + " ]";
    }
    
}
