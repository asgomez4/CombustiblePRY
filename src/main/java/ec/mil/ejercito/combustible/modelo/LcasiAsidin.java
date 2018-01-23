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
import javax.validation.constraints.Size;

/**
 *
 * @author Sofia Gomez
 */
@Entity
@Table(name = "lcasi_asidin")
@NamedQueries({
    @NamedQuery(name = "LcasiAsidin.findAll", query = "SELECT l FROM LcasiAsidin l")})
public class LcasiAsidin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "ASI_CODIGO")
    private String asiCodigo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "ASI_MONTO")
    private BigDecimal asiMonto;
    @JoinColumn(name = "ENC_CODIGO", referencedColumnName = "ENC_CODIGO")
    @ManyToOne(optional = false)
    private LcencEncreq lcencEncreq;
    @JoinColumn(name = "UNI_CODIGO2", referencedColumnName = "UNI_CODIGO2")
    @ManyToOne(optional = false)
    private MuniUnida muniUnida;

    public LcasiAsidin() {
    }

    public LcasiAsidin(String asiCodigo) {
        this.asiCodigo = asiCodigo;
    }

    public LcasiAsidin(String asiCodigo, BigDecimal asiMonto) {
        this.asiCodigo = asiCodigo;
        this.asiMonto = asiMonto;
    }

    public String getAsiCodigo() {
        return asiCodigo;
    }

    public void setAsiCodigo(String asiCodigo) {
        this.asiCodigo = asiCodigo;
    }

    public BigDecimal getAsiMonto() {
        return asiMonto;
    }

    public void setAsiMonto(BigDecimal asiMonto) {
        this.asiMonto = asiMonto;
    }

    public LcencEncreq getLcencEncreq() {
        return lcencEncreq;
    }

    public void setLcencEncreq(LcencEncreq lcencEncreq) {
        this.lcencEncreq = lcencEncreq;
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
        hash += (asiCodigo != null ? asiCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LcasiAsidin)) {
            return false;
        }
        LcasiAsidin other = (LcasiAsidin) object;
        if ((this.asiCodigo == null && other.asiCodigo != null) || (this.asiCodigo != null && !this.asiCodigo.equals(other.asiCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.ejercito.combustible.modelo.LcasiAsidin[ asiCodigo=" + asiCodigo + " ]";
    }
    
}
