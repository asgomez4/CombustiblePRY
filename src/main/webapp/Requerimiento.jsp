<%-- 
    Document   : Requerimiento
    Created on : 17/01/2018, 20:44:15
    Author     : Sofia Gomez
--%>

<%@page import="ec.mil.ejercito.combustible.consultas"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Combustible</title>
        <link rel="stylesheet" type="text/css" href="resources/css/menu.css" media="screen" />
        <link rel="stylesheet" type="text/css" href="resources/css/default.css" media="screen" />
        <link rel="stylesheet" type="text/css" href="resources/css/accordion.css" media="screen" /> 
        <link rel="stylesheet" type="text/css" href="resources/css/horizontal.css" media="screen" />        
    </head>
    <body>
        <%
            if (request.getParameter("txtUnidad") != null && request.getParameter("rbestado") != null
                    && request.getParameter("txtopMen") != null && request.getParameter("txtKm") != null
                    && request.getParameter("txtTCom") != null && request.getParameter("txtcantC") != null
                    && request.getParameter("txttAct") != null) {
                String unidad = request.getParameter("txtUnidad");
                String opemen = request.getParameter("txtopMen");
                String km = request.getParameter("txtKm");
                String tcomb = request.getParameter("txtTCom");
                String cantc = request.getParameter("txtcantC");
                String tact = request.getParameter("txttAct");
                String estado = request.getParameter("rbestado");
                String codigoU = consultas.buscar(unidad);
                String codigoA = consultas.buscarArt(tcomb); 
                boolean resp = consultas.insertarEncReq(codigoU, estado);
                boolean resp1 = consultas.insertarDetcReq(codigoA, tact, opemen, km, cantc);
                if (resp != false) {
        %>
                <script>alert("Datos ingresados correctamente");</script> 
        <%
                } else {
        %>
                <script>alert("Datos no ingresados");</script> 
        <%
                }
            }
        %>
        <div class="barraRoja">                                
        </div>
        <div class="barraGris">                                
        </div>
        <div class="barraGrisClara">                                
        </div>
        <div id="logoFT">       
        </div>
        <div id="cab" class="barraTitulo">
            <b><ui:insert name="nombreSistema">Sistema de Transportes</ui:insert></b>        
            <ui:insert name="tituloPagina"> \ Registro de Requerimiento</ui:insert>
        </div>
        <br/> <br/> <br/> <br/> 
        <br/> <br/>
        <form name ="frmuser" class="formu" method="POST" action="Requerimiento.jsp">
            <table class="tab">
                <tr>
                    <td>
                        <article>
                            <h2>Unidad:</h2>  
                            <%
                                try {
                                    // Conexion con bd 
                                    Connection conexion = null;
                                    Statement sentencia = null;
                                    ResultSet resultado = null;
                                    Class.forName("com.mysql.jdbc.Driver");//driver 
                                    String cadenaConexion = "jdbc:mysql://localhost:3307/combustible";//cadena de conexion 
                                    String usuario = "root";//usuario base de datos 
                                    String clave = "1492";//clave usuario base de datos 
                                    conexion = DriverManager.getConnection(cadenaConexion, usuario, clave);//registrar conexion 
                                    if (!conexion.isClosed()) {
                                        // La consulta 
                                        sentencia = conexion.createStatement();
                                        resultado = sentencia.executeQuery("select * from muni_unida");
                                        out.println(" <select name='txtUnidad' class='comun' id='unidad'>");
                                        out.println("<option>........</option>");
                                        // continuamos con el select 
                                        while (resultado.next()) {
                                            String siglas = resultado.getString("UNI_SIGLAS2");//guardamos un campo de resultado en una variable 
                                            String descri = resultado.getString("UNI_DESCRI2");//guardamos un campo de resultado en una variable 
                                            if (siglas.equals("SIN SIGLAS")) {
                                                out.println("<option value='" + descri + "'>" + descri + "</option>");//imprimimos el contenido del select  
                                            } else {
                                                out.println("<option value='" + siglas + "'>" + siglas + "</option>");
                                            }
                                        }
                                        out.println("</select>");
                                        // cierre de la conexion 
                                        conexion.close();
                                    } else // Error en la conexion 
                                    {
                                        out.println("fallo");
                                    }
                                } catch (Exception e) {
                                    // Error en algun momento. 
                                    out.println("Excepcion " + e);
                                    e.printStackTrace();
                                }
                            %>                    
                            <br/><br/>
                            <h2>Operaciones Mensuales:</h2><input type="number" name="txtopMen" class="comun" required=""/> <br/>
                            <br/><br/>
                            <h2>Kilometraje:</h2><input type="number" name="txtKm"  min="1000" class="comun" required=""/> <br/>
                            <br/><br/>
                            <h2>Tipo de combustible:</h2>
                            <%
                                try {
                                    // Conexion con bd 
                                    Connection conexion = null;
                                    Statement sentencia = null;
                                    ResultSet resultado = null;
                                    Class.forName("com.mysql.jdbc.Driver");//driver 
                                    String cadenaConexion = "jdbc:mysql://localhost:3307/combustible";//cadena de conexion 
                                    String usuario = "root";//usuario base de datos 
                                    String clave = "1492";//clave usuario base de datos 
                                    conexion = DriverManager.getConnection(cadenaConexion, usuario, clave);//registrar conexion 
                                    if (!conexion.isClosed()) {
                                        // La consulta 
                                        sentencia = conexion.createStatement();
                                        resultado = sentencia.executeQuery("select * from lart_artic");
                                        out.println(" <select name='txtTCom' class='comun' id='tcom'>");
                                        out.println("<option>........</option>");
                                        // continuamos con el select 
                                        while (resultado.next()) {
                                            String descriC = resultado.getString("ART_DESCRIP");//guardamos un campo de resultado en una variable 
                                            out.println("<option value='" + descriC + "'>" + descriC + "</option>");
                                        }
                                        out.println("</select>");
                                        // cierre de la conexion 
                                        conexion.close();
                                    } else // Error en la conexion 
                                    {
                                        out.println("fallo");
                                    }
                                } catch (Exception e) {
                                    // Error en algun momento. 
                                    out.println("Excepcion " + e);
                                    e.printStackTrace();
                                }
                            %><br/>
                            <br/><br/>
                            <h2>Catidad de combustible:</h2><input type="number" name="txtcantC" class="comun" required=""/> <br/>
                            <br/><br/>
                        </article>
                    </td>
                    <td>		
                        <aside>
                            <h2>Tipo de actividad:</h2>
                            <select name="txttAct" class="comun" id="tact">
                                <option value="ADM">ADMINISTRATIVA</option>
                                <option value="OPE">OPERACIONES</option>
                                <option value="MYC">MANDO Y CONTROL</option>
                                <option value="MTT">MTTO. INSTALACIONES</option>
                            </select><br/>
                            <br/><br/><br/><br/>
                            <h2>Estado:</h2>
                            <input type="radio" name="rbestado" value="PEN" class="radioB"/> PENDIENTE<br/>
                            <input type="radio" name="rbestado" value="ATE" class="radioB"/> ATENDIDO <br/>
                            <br/><br/>
                        </aside>					
                    </td>				
                </tr>
                <tr>
                    <td colspan="2" style="text-align:center;">
                        <br/><br/>
                        <input type="submit" name="btnEnvReq" class="formulario_submit" value="Registrar Requerimiento"/>
                    </td>
                </tr>
            </table>
        </form>        
    </body>
</html>
