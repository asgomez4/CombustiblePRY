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
@Table(name = "lveh_vehic")
@NamedQueries({
    @NamedQuery(name = "LvehVehic.findAll", query = "SELECT l FROM LvehVehic l")})
public class LvehVehic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "VEH_CODIGO_")
    private Integer vehCodigo;
    @Size(max = 20)
    @Column(name = "VEH_NUMREG")
    private String vehNumreg;
    @Column(name = "VEH_ANO")
    private Short vehAno;
    @Size(max = 15)
    @Column(name = "VEH_COLOR")
    private String vehColor;
    @Column(name = "VEH_FECCOM")
    @Temporal(TemporalType.DATE)
    private Date vehFeccom;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VEH_VALCOM_")
    private BigDecimal vehValcom;
    @Size(max = 20)
    @Column(name = "VEH_CHASIS")
    private String vehChasis;
    @Size(max = 20)
    @Column(name = "VEH_NUMMOTOR")
    private String vehNummotor;
    @Column(name = "VEH_FECHASIG")
    @Temporal(TemporalType.DATE)
    private Date vehFechasig;
    @Size(max = 10)
    @Column(name = "VEH_PLACA_")
    private String vehPlaca;
    @Column(name = "VEH_FECBAJA")
    @Temporal(TemporalType.DATE)
    private Date vehFecbaja;
    @Size(max = 15)
    @Column(name = "VEH_NUMACTA")
    private String vehNumacta;
    @Size(max = 20)
    @Column(name = "_VEH_DUEORIG")
    private String vehDueorig;
    @Size(max = 10)
    @Column(name = "VEH_TIEMDUR")
    private String vehTiemdur;
    @Size(max = 20)
    @Column(name = "VEH_NUMDICTA")
    private String vehNumdicta;
    @Column(name = "VEH_VALREMAT")
    private Integer vehValremat;
    @Column(name = "VEH_FECRECEP")
    @Temporal(TemporalType.DATE)
    private Date vehFecrecep;
    @Size(max = 60)
    @Column(name = "_VEH_OBSERVAC_")
    private String vehObservac;
    @Column(name = "VEH_ESTADO")
    private Character vehEstado;
    @Size(max = 3000)
    @Column(name = "VEH_OBSERVACION")
    private String vehObservacion;
    @Size(max = 9)
    @Column(name = "VEH_PLACA_ANT")
    private String vehPlacaAnt;
    @Column(name = "VHE_SEGURO")
    private Character vheSeguro;
    @Column(name = "VHE_POLIZA")
    private Integer vhePoliza;
    @Column(name = "VEH_STIKER")
    private Integer vehStiker;
    @Column(name = "VEH_FEC_SEGURO_")
    @Temporal(TemporalType.DATE)
    private Date vehFecSeguro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lvehVehic")
    private List<LcliqeLiqegr> lcliqeLiqegrList;
    @JoinColumn(name = "ART_CODIGO", referencedColumnName = "ART_CODIGO")
    @ManyToOne(optional = false)
    private LartArtic lartArtic;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lvehVehic")
    private List<LcproProcom> lcproProcomList;

    public LvehVehic() {
    }

    public LvehVehic(Integer vehCodigo) {
        this.vehCodigo = vehCodigo;
    }

    public Integer getVehCodigo() {
        return vehCodigo;
    }

    public void setVehCodigo(Integer vehCodigo) {
        this.vehCodigo = vehCodigo;
    }

    public String getVehNumreg() {
        return vehNumreg;
    }

    public void setVehNumreg(String vehNumreg) {
        this.vehNumreg = vehNumreg;
    }

    public Short getVehAno() {
        return vehAno;
    }

    public void setVehAno(Short vehAno) {
        this.vehAno = vehAno;
    }

    public String getVehColor() {
        return vehColor;
    }

    public void setVehColor(String vehColor) {
        this.vehColor = vehColor;
    }

    public Date getVehFeccom() {
        return vehFeccom;
    }

    public void setVehFeccom(Date vehFeccom) {
        this.vehFeccom = vehFeccom;
    }

    public BigDecimal getVehValcom() {
        return vehValcom;
    }

    public void setVehValcom(BigDecimal vehValcom) {
        this.vehValcom = vehValcom;
    }

    public String getVehChasis() {
        return vehChasis;
    }

    public void setVehChasis(String vehChasis) {
        this.vehChasis = vehChasis;
    }

    public String getVehNummotor() {
        return vehNummotor;
    }

    public void setVehNummotor(String vehNummotor) {
        this.vehNummotor = vehNummotor;
    }

    public Date getVehFechasig() {
        return vehFechasig;
    }

    public void setVehFechasig(Date vehFechasig) {
        this.vehFechasig = vehFechasig;
    }

    public String getVehPlaca() {
        return vehPlaca;
    }

    public void setVehPlaca(String vehPlaca) {
        this.vehPlaca = vehPlaca;
    }

    public Date getVehFecbaja() {
        return vehFecbaja;
    }

    public void setVehFecbaja(Date vehFecbaja) {
        this.vehFecbaja = vehFecbaja;
    }

    public String getVehNumacta() {
        return vehNumacta;
    }

    public void setVehNumacta(String vehNumacta) {
        this.vehNumacta = vehNumacta;
    }

    public String getVehDueorig() {
        return vehDueorig;
    }

    public void setVehDueorig(String vehDueorig) {
        this.vehDueorig = vehDueorig;
    }

    public String getVehTiemdur() {
        return vehTiemdur;
    }

    public void setVehTiemdur(String vehTiemdur) {
        this.vehTiemdur = vehTiemdur;
    }

    public String getVehNumdicta() {
        return vehNumdicta;
    }

    public void setVehNumdicta(String vehNumdicta) {
        this.vehNumdicta = vehNumdicta;
    }

    public Integer getVehValremat() {
        return vehValremat;
    }

    public void setVehValremat(Integer vehValremat) {
        this.vehValremat = vehValremat;
    }

    public Date getVehFecrecep() {
        return vehFecrecep;
    }

    public void setVehFecrecep(Date vehFecrecep) {
        this.vehFecrecep = vehFecrecep;
    }

    public String getVehObservac() {
        return vehObservac;
    }

    public void setVehObservac(String vehObservac) {
        this.vehObservac = vehObservac;
    }

    public Character getVehEstado() {
        return vehEstado;
    }

    public void setVehEstado(Character vehEstado) {
        this.vehEstado = vehEstado;
    }

    public String getVehObservacion() {
        return vehObservacion;
    }

    public void setVehObservacion(String vehObservacion) {
        this.vehObservacion = vehObservacion;
    }

    public String getVehPlacaAnt() {
        return vehPlacaAnt;
    }

    public void setVehPlacaAnt(String vehPlacaAnt) {
        this.vehPlacaAnt = vehPlacaAnt;
    }

    public Character getVheSeguro() {
        return vheSeguro;
    }

    public void setVheSeguro(Character vheSeguro) {
        this.vheSeguro = vheSeguro;
    }

    public Integer getVhePoliza() {
        return vhePoliza;
    }

    public void setVhePoliza(Integer vhePoliza) {
        this.vhePoliza = vhePoliza;
    }

    public Integer getVehStiker() {
        return vehStiker;
    }

    public void setVehStiker(Integer vehStiker) {
        this.vehStiker = vehStiker;
    }

    public Date getVehFecSeguro() {
        return vehFecSeguro;
    }

    public void setVehFecSeguro(Date vehFecSeguro) {
        this.vehFecSeguro = vehFecSeguro;
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

    public List<LcproProcom> getLcproProcomList() {
        return lcproProcomList;
    }

    public void setLcproProcomList(List<LcproProcom> lcproProcomList) {
        this.lcproProcomList = lcproProcomList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vehCodigo != null ? vehCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvehVehic)) {
            return false;
        }
        LvehVehic other = (LvehVehic) object;
        if ((this.vehCodigo == null && other.vehCodigo != null) || (this.vehCodigo != null && !this.vehCodigo.equals(other.vehCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.ejercito.combustible.modelo.LvehVehic[ vehCodigo=" + vehCodigo + " ]";
    }
    
}
