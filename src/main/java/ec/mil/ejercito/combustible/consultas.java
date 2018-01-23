/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.ejercito.combustible;

import ec.mil.ejercito.combustible.modelo.LcdetDetreq;
import ec.mil.ejercito.combustible.modelo.LcencEncreq;
import ec.mil.ejercito.combustible.modelo.MuniUnida;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sofia Gomez
 */
public class consultas {

    static String query;
    static Connection conex = null;
    static Statement stm = null;
    static ResultSet rst = null;
    static PreparedStatement pstam = null;
    static String i = "1"; //para el encabezado
    static String j = "1"; //para el detalle

    public static int verificarTabla() {
        int valor = 0;
        try {
            query = "SELECT count(*) as TOTAL FROM lcenc_encreq;";
            conex = conexion.Conexion();
            stm = conex.createStatement();
            rst = stm.executeQuery(query);
            while (rst.next()) {
                valor = rst.getInt("TOTAL");
            }
            conex.close();
        } catch (SQLException ex) {
            Logger.getLogger(consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return valor;
    }

    public static int verificarTDet() {
        int valor = 0;
        try {
            query = "SELECT count(*) as TOTAL FROM lcenc_detreq;";
            conex = conexion.Conexion();
            stm = conex.createStatement();
            rst = stm.executeQuery(query);
            while (rst.next()) {
                valor = rst.getInt("TOTAL");
            }
            conex.close();
        } catch (SQLException ex) {
            Logger.getLogger(consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return valor;
    }

    public static String buscar(String UNI_CODIGO2) {
        String codigo = "";
        try {
            query = "select UNI_CODIGO2 from muni_unida where UNI_SIGLAS2 = '" + UNI_CODIGO2 + "';";
            conex = conexion.Conexion();
            stm = conex.createStatement();
            rst = stm.executeQuery(query);
            while (rst.next()) {
                codigo = rst.getString("UNI_CODIGO2");
            }
            conex.close();
        } catch (SQLException ex) {
            Logger.getLogger(consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return codigo;
    }

    public static String buscarArt(String tcomb) {
        String codigo = "";
        try {
            query = "select ART_CODIGO from lart_artic where ART_DESCRIP = '" + tcomb + "';";
            conex = conexion.Conexion();
            stm = conex.createStatement();
            rst = stm.executeQuery(query);
            while (rst.next()) {
                codigo = rst.getString("ART_CODIGO");
            }
            conex.close();
        } catch (SQLException ex) {
            Logger.getLogger(consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return codigo;
    }

    public static boolean insertarEncReq(String UNI_CODIGO2, String ENC_ESTADO) {
        boolean band = false;
        int valorT = consultas.verificarTabla();
        Calendar calendar = Calendar.getInstance();
        java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());
        if (valorT > 0) {
            i = String.valueOf(valorT + 1);
        }
        try {
            query = "insert into lcenc_encreq (ENC_CODIGO, UNI_CODIGO2, REP_CODIGO, ENC_FECHA, ENC_TOTALCUADRO, ENC_ESTADO) values (?,?,null,?,null,?)";
            conex = conexion.Conexion();
            pstam = conex.prepareStatement(query);
            pstam.setString(1, i);
            pstam.setString(2, UNI_CODIGO2);
            pstam.setDate(3, startDate);
            pstam.setString(4, ENC_ESTADO);
            pstam.executeUpdate();
            conex.close();
            band = true;
        } catch (SQLException ex) {
            Logger.getLogger(consultas.class.getName()).log(Level.SEVERE, null, ex);
            System.err.print(ex);
            band = false;
        }
        return band;
    }

    public static boolean insertarDetcReq(String ART_CODIGO, String DET_TACTV, String DET_OPEMEN, String DET_KM_HORAS, String DET_CANTCOM) {
        boolean band = false;
        int valorT = consultas.verificarTDet();
        if (valorT > 0) {
            j = String.valueOf(valorT + 1);
        }
        try {
            query = "insert into lcdet_detreq (ART_CODIGO, ENC_CODIGO, DET_CODIGO, DET_TACTV, DET_OPEMEN, DET_NUMART, DET_KM_HORAS, DET_CANTCOM, DET_OBSER) values (?,?,?,?,?,?,?,?,null)";
            conex = conexion.Conexion();
            pstam = conex.prepareStatement(query);
            pstam.setString(1, ART_CODIGO);
            pstam.setString(2, i);
            pstam.setString(3, j);
            pstam.setString(4, DET_TACTV);
            pstam.setInt(5, Integer.parseInt(DET_OPEMEN));
            pstam.setInt(6, 1);
            pstam.setFloat(7, Float.parseFloat(DET_KM_HORAS));
            pstam.setFloat(8, Float.parseFloat(DET_CANTCOM));
            pstam.executeUpdate();
            conex.close();
            band = true;
        } catch (SQLException ex) {
            Logger.getLogger(consultas.class.getName()).log(Level.SEVERE, null, ex);
            System.err.print(ex);
            band = false;
        }
        return band;
    }

    public static List<LcencEncreq> buscarEncReq(String UNI_CODIGO2) {
        String codigo = "";
        LcencEncreq encabezado;
        List<LcencEncreq> listEncab = new ArrayList();
        try {
            query = "select ENC_CODIGO, ENC_FECHA from lcenc_encreq where UNI_CODIGO2 = '" + UNI_CODIGO2 + "';";
            conex = conexion.Conexion();
            stm = conex.createStatement();
            rst = stm.executeQuery(query);
            while (rst.next()) {
                encabezado = new LcencEncreq();
                encabezado.setEncCodigo(rst.getString("ENC_CODIGO"));
                encabezado.setEncFecha(rst.getDate("ENC_FECHA"));
                listEncab.add(encabezado);
            }
            conex.close();            
        } catch (SQLException ex) {
            Logger.getLogger(consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listEncab;
    }
    
    public static List<LcdetDetreq> buscarDetReq(String UNI_CODIGO2) {
        String codigo = "";
        LcdetDetreq detalle;
        List<LcdetDetreq> listDetalle = new ArrayList();
        List<LcencEncreq> listEncab = new ArrayList();
        listEncab = buscarEncReq(UNI_CODIGO2);
        try {
            for (int m = 0; m < listEncab.size(); m++) {
                query = "select DET_TACTV, DET_OPEMEN, DET_CANTCOM, DET_KM_HORAS from lcdet_detreq where ENC_CODIGO = '" + listEncab.get(m).getEncCodigo() + "';";
                conex = conexion.Conexion();
                stm = conex.createStatement();
                rst = stm.executeQuery(query);
                while (rst.next()) {
                    detalle = new LcdetDetreq();
                    detalle.setDetTactv(rst.getString("DET_TACTV"));
                    detalle.setDetOpemen(rst.getShort("DET_OPEMEN"));
                    detalle.setDetCantcom(rst.getBigDecimal("DET_CANTCOM"));
                    detalle.setDetKmHoras(rst.getBigDecimal("DET_KM_HORAS"));
                    listDetalle.add(detalle);
                }
                conex.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listDetalle;
    }
}
