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
@Table(name = "lart_artic")
@NamedQueries({
    @NamedQuery(name = "LartArtic.findAll", query = "SELECT l FROM LartArtic l")})
public class LartArtic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ART_CODIGO")
    private Integer artCodigo;
    @Size(max = 50)
    @Column(name = "ART_CODIGOAR")
    private String artCodigoar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ART_DESCRIP")
    private String artDescrip;
    @Size(max = 15)
    @Column(name = "ART_NOMCORT")
    private String artNomcort;
    @Size(max = 2)
    @Column(name = "ART_FUNGIBLE")
    private String artFungible;
    @Column(name = "ART_STOCKMIN")
    private Short artStockmin;
    @Column(name = "ART_STOCKMAX")
    private Integer artStockmax;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "ART_SWLOTE")
    private String artSwlote;
    @Size(max = 60)
    @Column(name = "ART_OBSERVA")
    private String artObserva;
    @Size(max = 10)
    @Column(name = "ART_CODIGO_AF")
    private String artCodigoAf;
    @Column(name = "ART_MANTENIMIENTO")
    private Character artMantenimiento;
    @Size(max = 10)
    @Column(name = "ART_CODALTER")
    private String artCodalter;
    @Size(max = 16)
    @Column(name = "ART_CODNSN")
    private String artCodnsn;
    @Column(name = "ART_STATUS")
    private Character artStatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lartArtic")
    private List<LcingIngfac> lcingIngfacList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lartArtic")
    private List<LcexiExiste> lcexiExisteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lartArtic")
    private List<LvehVehic> lvehVehicList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lartArtic")
    private List<LcliqLiquni> lcliqLiquniList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lartArtic")
    private List<LcproProcom> lcproProcomList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lartArtic")
    private List<LcdetDetreq> lcdetDetreqList;

    public LartArtic() {
    }

    public LartArtic(Integer artCodigo) {
        this.artCodigo = artCodigo;
    }

    public LartArtic(Integer artCodigo, String artDescrip, String artSwlote) {
        this.artCodigo = artCodigo;
        this.artDescrip = artDescrip;
        this.artSwlote = artSwlote;
    }

    public Integer getArtCodigo() {
        return artCodigo;
    }

    public void setArtCodigo(Integer artCodigo) {
        this.artCodigo = artCodigo;
    }

    public String getArtCodigoar() {
        return artCodigoar;
    }

    public void setArtCodigoar(String artCodigoar) {
        this.artCodigoar = artCodigoar;
    }

    public String getArtDescrip() {
        return artDescrip;
    }

    public void setArtDescrip(String artDescrip) {
        this.artDescrip = artDescrip;
    }

    public String getArtNomcort() {
        return artNomcort;
    }

    public void setArtNomcort(String artNomcort) {
        this.artNomcort = artNomcort;
    }

    public String getArtFungible() {
        return artFungible;
    }

    public void setArtFungible(String artFungible) {
        this.artFungible = artFungible;
    }

    public Short getArtStockmin() {
        return artStockmin;
    }

    public void setArtStockmin(Short artStockmin) {
        this.artStockmin = artStockmin;
    }

    public Integer getArtStockmax() {
        return artStockmax;
    }

    public void setArtStockmax(Integer artStockmax) {
        this.artStockmax = artStockmax;
    }

    public String getArtSwlote() {
        return artSwlote;
    }

    public void setArtSwlote(String artSwlote) {
        this.artSwlote = artSwlote;
    }

    public String getArtObserva() {
        return artObserva;
    }

    public void setArtObserva(String artObserva) {
        this.artObserva = artObserva;
    }

    public String getArtCodigoAf() {
        return artCodigoAf;
    }

    public void setArtCodigoAf(String artCodigoAf) {
        this.artCodigoAf = artCodigoAf;
    }

    public Character getArtMantenimiento() {
        return artMantenimiento;
    }

    public void setArtMantenimiento(Character artMantenimiento) {
        this.artMantenimiento = artMantenimiento;
    }

    public String getArtCodalter() {
        return artCodalter;
    }

    public void setArtCodalter(String artCodalter) {
        this.artCodalter = artCodalter;
    }

    public String getArtCodnsn() {
        return artCodnsn;
    }

    public void setArtCodnsn(String artCodnsn) {
        this.artCodnsn = artCodnsn;
    }

    public Character getArtStatus() {
        return artStatus;
    }

    public void setArtStatus(Character artStatus) {
        this.artStatus = artStatus;
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

    public List<LvehVehic> getLvehVehicList() {
        return lvehVehicList;
    }

    public void setLvehVehicList(List<LvehVehic> lvehVehicList) {
        this.lvehVehicList = lvehVehicList;
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

    public List<LcdetDetreq> getLcdetDetreqList() {
        return lcdetDetreqList;
    }

    public void setLcdetDetreqList(List<LcdetDetreq> lcdetDetreqList) {
        this.lcdetDetreqList = lcdetDetreqList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (artCodigo != null ? artCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LartArtic)) {
            return false;
        }
        LartArtic other = (LartArtic) object;
        if ((this.artCodigo == null && other.artCodigo != null) || (this.artCodigo != null && !this.artCodigo.equals(other.artCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.ejercito.combustible.modelo.LartArtic[ artCodigo=" + artCodigo + " ]";
    }
    
}
