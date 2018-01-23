/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.ejercito.combustible.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Sofia Gomez
 */
@Embeddable
public class LcdetDetreqPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "ART_CODIGO")
    private int artCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "ENC_CODIGO")
    private String encCodigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DET_CODIGO")
    private int detCodigo;

    public LcdetDetreqPK() {
    }

    public LcdetDetreqPK(int artCodigo, String encCodigo, int detCodigo) {
        this.artCodigo = artCodigo;
        this.encCodigo = encCodigo;
        this.detCodigo = detCodigo;
    }

    public int getArtCodigo() {
        return artCodigo;
    }

    public void setArtCodigo(int artCodigo) {
        this.artCodigo = artCodigo;
    }

    public String getEncCodigo() {
        return encCodigo;
    }

    public void setEncCodigo(String encCodigo) {
        this.encCodigo = encCodigo;
    }

    public int getDetCodigo() {
        return detCodigo;
    }

    public void setDetCodigo(int detCodigo) {
        this.detCodigo = detCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) artCodigo;
        hash += (encCodigo != null ? encCodigo.hashCode() : 0);
        hash += (int) detCodigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LcdetDetreqPK)) {
            return false;
        }
        LcdetDetreqPK other = (LcdetDetreqPK) object;
        if (this.artCodigo != other.artCodigo) {
            return false;
        }
        if ((this.encCodigo == null && other.encCodigo != null) || (this.encCodigo != null && !this.encCodigo.equals(other.encCodigo))) {
            return false;
        }
        if (this.detCodigo != other.detCodigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.ejercito.combustible.modelo.LcdetDetreqPK[ artCodigo=" + artCodigo + ", encCodigo=" + encCodigo + ", detCodigo=" + detCodigo + " ]";
    }
    
}
