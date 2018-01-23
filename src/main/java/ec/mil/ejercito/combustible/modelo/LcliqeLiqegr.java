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
@Table(name = "lcliqe_liqegr")
@NamedQueries({
    @NamedQuery(name = "LcliqeLiqegr.findAll", query = "SELECT l FROM LcliqeLiqegr l")})
public class LcliqeLiqegr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "LIQE_CODIGO")
    private String liqeCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "LIQE_DETALLE")
    private String liqeDetalle;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "LIQE_CANTIDAD")
    private BigDecimal liqeCantidad;
    @JoinColumn(name = "LIQ_CODIGO", referencedColumnName = "LIQ_CODIGO")
    @ManyToOne(optional = false)
    private LcliqLiquni lcliqLiquni;
    @JoinColumn(name = "PRO_CODIGO", referencedColumnName = "PRO_CODIGO")
    @ManyToOne(optional = false)
    private LcproProcom lcproProcom;
    @JoinColumn(name = "VEH_CODIGO_", referencedColumnName = "VEH_CODIGO_")
    @ManyToOne(optional = false)
    private LvehVehic lvehVehic;

    public LcliqeLiqegr() {
    }

    public LcliqeLiqegr(String liqeCodigo) {
        this.liqeCodigo = liqeCodigo;
    }

    public LcliqeLiqegr(String liqeCodigo, String liqeDetalle, BigDecimal liqeCantidad) {
        this.liqeCodigo = liqeCodigo;
        this.liqeDetalle = liqeDetalle;
        this.liqeCantidad = liqeCantidad;
    }

    public String getLiqeCodigo() {
        return liqeCodigo;
    }

    public void setLiqeCodigo(String liqeCodigo) {
        this.liqeCodigo = liqeCodigo;
    }

    public String getLiqeDetalle() {
        return liqeDetalle;
    }

    public void setLiqeDetalle(String liqeDetalle) {
        this.liqeDetalle = liqeDetalle;
    }

    public BigDecimal getLiqeCantidad() {
        return liqeCantidad;
    }

    public void setLiqeCantidad(BigDecimal liqeCantidad) {
        this.liqeCantidad = liqeCantidad;
    }

    public LcliqLiquni getLcliqLiquni() {
        return lcliqLiquni;
    }

    public void setLcliqLiquni(LcliqLiquni lcliqLiquni) {
        this.lcliqLiquni = lcliqLiquni;
    }

    public LcproProcom getLcproProcom() {
        return lcproProcom;
    }

    public void setLcproProcom(LcproProcom lcproProcom) {
        this.lcproProcom = lcproProcom;
    }

    public LvehVehic getLvehVehic() {
        return lvehVehic;
    }

    public void setLvehVehic(LvehVehic lvehVehic) {
        this.lvehVehic = lvehVehic;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (liqeCodigo != null ? liqeCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LcliqeLiqegr)) {
            return false;
        }
        LcliqeLiqegr other = (LcliqeLiqegr) object;
        if ((this.liqeCodigo == null && other.liqeCodigo != null) || (this.liqeCodigo != null && !this.liqeCodigo.equals(other.liqeCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.ejercito.combustible.modelo.LcliqeLiqegr[ liqeCodigo=" + liqeCodigo + " ]";
    }
    
}
