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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Sofia Gomez
 */
@Entity
@Table(name = "lcdet_detreq")
@NamedQueries({
    @NamedQuery(name = "LcdetDetreq.findAll", query = "SELECT l FROM LcdetDetreq l")})
public class LcdetDetreq implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LcdetDetreqPK lcdetDetreqPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "DET_TACTV")
    private String detTactv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DET_OPEMEN")
    private short detOpemen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DET_NUMART")
    private short detNumart;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "DET_KM_HORAS")
    private BigDecimal detKmHoras;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DET_CANTCOM")
    private BigDecimal detCantcom;
    @Size(max = 100)
    @Column(name = "DET_OBSER")
    private String detObser;
    @JoinColumn(name = "ART_CODIGO", referencedColumnName = "ART_CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private LartArtic lartArtic;
    @JoinColumn(name = "ENC_CODIGO", referencedColumnName = "ENC_CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private LcencEncreq lcencEncreq;

    public LcdetDetreq() {
    }

    public LcdetDetreq(LcdetDetreqPK lcdetDetreqPK) {
        this.lcdetDetreqPK = lcdetDetreqPK;
    }

    public LcdetDetreq(LcdetDetreqPK lcdetDetreqPK, String detTactv, short detOpemen, short detNumart, BigDecimal detKmHoras, BigDecimal detCantcom) {
        this.lcdetDetreqPK = lcdetDetreqPK;
        this.detTactv = detTactv;
        this.detOpemen = detOpemen;
        this.detNumart = detNumart;
        this.detKmHoras = detKmHoras;
        this.detCantcom = detCantcom;
    }

    public LcdetDetreq(int artCodigo, String encCodigo, int detCodigo) {
        this.lcdetDetreqPK = new LcdetDetreqPK(artCodigo, encCodigo, detCodigo);
    }

    public LcdetDetreqPK getLcdetDetreqPK() {
        return lcdetDetreqPK;
    }

    public void setLcdetDetreqPK(LcdetDetreqPK lcdetDetreqPK) {
        this.lcdetDetreqPK = lcdetDetreqPK;
    }

    public String getDetTactv() {
        return detTactv;
    }

    public void setDetTactv(String detTactv) {
        this.detTactv = detTactv;
    }

    public short getDetOpemen() {
        return detOpemen;
    }

    public void setDetOpemen(short detOpemen) {
        this.detOpemen = detOpemen;
    }

    public short getDetNumart() {
        return detNumart;
    }

    public void setDetNumart(short detNumart) {
        this.detNumart = detNumart;
    }

    public BigDecimal getDetKmHoras() {
        return detKmHoras;
    }

    public void setDetKmHoras(BigDecimal detKmHoras) {
        this.detKmHoras = detKmHoras;
    }

    public BigDecimal getDetCantcom() {
        return detCantcom;
    }

    public void setDetCantcom(BigDecimal detCantcom) {
        this.detCantcom = detCantcom;
    }

    public String getDetObser() {
        return detObser;
    }

    public void setDetObser(String detObser) {
        this.detObser = detObser;
    }

    public LartArtic getLartArtic() {
        return lartArtic;
    }

    public void setLartArtic(LartArtic lartArtic) {
        this.lartArtic = lartArtic;
    }

    public LcencEncreq getLcencEncreq() {
        return lcencEncreq;
    }

    public void setLcencEncreq(LcencEncreq lcencEncreq) {
        this.lcencEncreq = lcencEncreq;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lcdetDetreqPK != null ? lcdetDetreqPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LcdetDetreq)) {
            return false;
        }
        LcdetDetreq other = (LcdetDetreq) object;
        if ((this.lcdetDetreqPK == null && other.lcdetDetreqPK != null) || (this.lcdetDetreqPK != null && !this.lcdetDetreqPK.equals(other.lcdetDetreqPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.ejercito.combustible.modelo.LcdetDetreq[ lcdetDetreqPK=" + lcdetDetreqPK + " ]";
    }
    
}
