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
@Table(name = "lcliqi_liqing")
@NamedQueries({
    @NamedQuery(name = "LcliqiLiqing.findAll", query = "SELECT l FROM LcliqiLiqing l")})
public class LcliqiLiqing implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "LIQI_CODIGO")
    private String liqiCodigo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "LIQI_CANTIDAD")
    private BigDecimal liqiCantidad;
    @Size(max = 50)
    @Column(name = "LIQI_OBSERVACION")
    private String liqiObservacion;
    @JoinColumn(name = "ING_CODIGO", referencedColumnName = "ING_CODIGO")
    @ManyToOne(optional = false)
    private LcingIngfac lcingIngfac;
    @JoinColumn(name = "LIQ_CODIGO", referencedColumnName = "LIQ_CODIGO")
    @ManyToOne(optional = false)
    private LcliqLiquni lcliqLiquni;

    public LcliqiLiqing() {
    }

    public LcliqiLiqing(String liqiCodigo) {
        this.liqiCodigo = liqiCodigo;
    }

    public LcliqiLiqing(String liqiCodigo, BigDecimal liqiCantidad) {
        this.liqiCodigo = liqiCodigo;
        this.liqiCantidad = liqiCantidad;
    }

    public String getLiqiCodigo() {
        return liqiCodigo;
    }

    public void setLiqiCodigo(String liqiCodigo) {
        this.liqiCodigo = liqiCodigo;
    }

    public BigDecimal getLiqiCantidad() {
        return liqiCantidad;
    }

    public void setLiqiCantidad(BigDecimal liqiCantidad) {
        this.liqiCantidad = liqiCantidad;
    }

    public String getLiqiObservacion() {
        return liqiObservacion;
    }

    public void setLiqiObservacion(String liqiObservacion) {
        this.liqiObservacion = liqiObservacion;
    }

    public LcingIngfac getLcingIngfac() {
        return lcingIngfac;
    }

    public void setLcingIngfac(LcingIngfac lcingIngfac) {
        this.lcingIngfac = lcingIngfac;
    }

    public LcliqLiquni getLcliqLiquni() {
        return lcliqLiquni;
    }

    public void setLcliqLiquni(LcliqLiquni lcliqLiquni) {
        this.lcliqLiquni = lcliqLiquni;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (liqiCodigo != null ? liqiCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LcliqiLiqing)) {
            return false;
        }
        LcliqiLiqing other = (LcliqiLiqing) object;
        if ((this.liqiCodigo == null && other.liqiCodigo != null) || (this.liqiCodigo != null && !this.liqiCodigo.equals(other.liqiCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.ejercito.combustible.modelo.LcliqiLiqing[ liqiCodigo=" + liqiCodigo + " ]";
    }
    
}
