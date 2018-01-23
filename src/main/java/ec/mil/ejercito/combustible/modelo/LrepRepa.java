/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.ejercito.combustible.modelo;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Sofia Gomez
 */
@Entity
@Table(name = "lrep_repa")
@NamedQueries({
    @NamedQuery(name = "LrepRepa.findAll", query = "SELECT l FROM LrepRepa l")})
public class LrepRepa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "REP_CODIGO")
    private Integer repCodigo;
    @Size(max = 13)
    @Column(name = "REP_COMANDANTE")
    private String repComandante;
    @Size(max = 13)
    @Column(name = "REP_SUBCOMANDANTE")
    private String repSubcomandante;
    @Size(max = 13)
    @Column(name = "REP_OFIOPLOG")
    private String repOfioplog;
    @Size(max = 13)
    @Column(name = "REP_CIALOGISTICA")
    private String repCialogistica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrepRepa")
    private List<LcliqLiquni> lcliqLiquniList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrepRepa")
    private List<LcproProcom> lcproProcomList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrepRepa")
    private List<LcguiGuirem> lcguiGuiremList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrepRepa")
    private List<LcencEncreq> lcencEncreqList;

    public LrepRepa() {
    }

    public LrepRepa(Integer repCodigo) {
        this.repCodigo = repCodigo;
    }

    public Integer getRepCodigo() {
        return repCodigo;
    }

    public void setRepCodigo(Integer repCodigo) {
        this.repCodigo = repCodigo;
    }

    public String getRepComandante() {
        return repComandante;
    }

    public void setRepComandante(String repComandante) {
        this.repComandante = repComandante;
    }

    public String getRepSubcomandante() {
        return repSubcomandante;
    }

    public void setRepSubcomandante(String repSubcomandante) {
        this.repSubcomandante = repSubcomandante;
    }

    public String getRepOfioplog() {
        return repOfioplog;
    }

    public void setRepOfioplog(String repOfioplog) {
        this.repOfioplog = repOfioplog;
    }

    public String getRepCialogistica() {
        return repCialogistica;
    }

    public void setRepCialogistica(String repCialogistica) {
        this.repCialogistica = repCialogistica;
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

    public List<LcguiGuirem> getLcguiGuiremList() {
        return lcguiGuiremList;
    }

    public void setLcguiGuiremList(List<LcguiGuirem> lcguiGuiremList) {
        this.lcguiGuiremList = lcguiGuiremList;
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
        hash += (repCodigo != null ? repCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrepRepa)) {
            return false;
        }
        LrepRepa other = (LrepRepa) object;
        if ((this.repCodigo == null && other.repCodigo != null) || (this.repCodigo != null && !this.repCodigo.equals(other.repCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.ejercito.combustible.modelo.LrepRepa[ repCodigo=" + repCodigo + " ]";
    }
    
}
