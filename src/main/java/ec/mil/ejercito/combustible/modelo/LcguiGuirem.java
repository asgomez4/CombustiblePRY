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
@Table(name = "lcgui_guirem")
@NamedQueries({
    @NamedQuery(name = "LcguiGuirem.findAll", query = "SELECT l FROM LcguiGuirem l")})
public class LcguiGuirem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "GUI_CODCONF")
    private String guiCodconf;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GUI_FECHAINITRAS")
    @Temporal(TemporalType.DATE)
    private Date guiFechainitras;
    @Column(name = "GUI_FECHAFINTRAS")
    @Temporal(TemporalType.DATE)
    private Date guiFechafintras;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "GUI_CODCONTROL")
    private String guiCodcontrol;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "GUI_CANTDESPACHO")
    private BigDecimal guiCantdespacho;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "GUI_ESTADO")
    private String guiEstado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lcguiGuirem")
    private List<LcexiExiste> lcexiExisteList;
    @JoinColumn(name = "REP_CODIGO", referencedColumnName = "REP_CODIGO")
    @ManyToOne(optional = false)
    private LrepRepa lrepRepa;

    public LcguiGuirem() {
    }

    public LcguiGuirem(String guiCodconf) {
        this.guiCodconf = guiCodconf;
    }

    public LcguiGuirem(String guiCodconf, Date guiFechainitras, String guiCodcontrol, BigDecimal guiCantdespacho, String guiEstado) {
        this.guiCodconf = guiCodconf;
        this.guiFechainitras = guiFechainitras;
        this.guiCodcontrol = guiCodcontrol;
        this.guiCantdespacho = guiCantdespacho;
        this.guiEstado = guiEstado;
    }

    public String getGuiCodconf() {
        return guiCodconf;
    }

    public void setGuiCodconf(String guiCodconf) {
        this.guiCodconf = guiCodconf;
    }

    public Date getGuiFechainitras() {
        return guiFechainitras;
    }

    public void setGuiFechainitras(Date guiFechainitras) {
        this.guiFechainitras = guiFechainitras;
    }

    public Date getGuiFechafintras() {
        return guiFechafintras;
    }

    public void setGuiFechafintras(Date guiFechafintras) {
        this.guiFechafintras = guiFechafintras;
    }

    public String getGuiCodcontrol() {
        return guiCodcontrol;
    }

    public void setGuiCodcontrol(String guiCodcontrol) {
        this.guiCodcontrol = guiCodcontrol;
    }

    public BigDecimal getGuiCantdespacho() {
        return guiCantdespacho;
    }

    public void setGuiCantdespacho(BigDecimal guiCantdespacho) {
        this.guiCantdespacho = guiCantdespacho;
    }

    public String getGuiEstado() {
        return guiEstado;
    }

    public void setGuiEstado(String guiEstado) {
        this.guiEstado = guiEstado;
    }

    public List<LcexiExiste> getLcexiExisteList() {
        return lcexiExisteList;
    }

    public void setLcexiExisteList(List<LcexiExiste> lcexiExisteList) {
        this.lcexiExisteList = lcexiExisteList;
    }

    public LrepRepa getLrepRepa() {
        return lrepRepa;
    }

    public void setLrepRepa(LrepRepa lrepRepa) {
        this.lrepRepa = lrepRepa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (guiCodconf != null ? guiCodconf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LcguiGuirem)) {
            return false;
        }
        LcguiGuirem other = (LcguiGuirem) object;
        if ((this.guiCodconf == null && other.guiCodconf != null) || (this.guiCodconf != null && !this.guiCodconf.equals(other.guiCodconf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.ejercito.combustible.modelo.LcguiGuirem[ guiCodconf=" + guiCodconf + " ]";
    }
    
}
