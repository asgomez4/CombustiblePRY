<%-- 
    Document   : Req_ReporteUnidad
    Created on : 22/01/2018, 10:36:11
    Author     : Sofia Gomez
--%>

<%@page import="ec.mil.ejercito.combustible.modelo.LcencEncreq"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ec.mil.ejercito.combustible.modelo.LcdetDetreq"%>
<%@page import="java.util.List"%>
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
        <link rel="stylesheet" type="text/css" href="resources/css/menuRep.css" media="screen" />
        <link rel="stylesheet" type="text/css" href="resources/css/default.css" media="screen" />
        <link rel="stylesheet" type="text/css" href="resources/css/accordion.css" media="screen" /> 
        <link rel="stylesheet" type="text/css" href="resources/css/horizontal.css" media="screen" />        
    </head>
    <body>
        <%!
            String unidad = "";
            String resultado = "";
        %>
        <%
            if (request.getParameter("txtUnidad") != null) {
                unidad = request.getParameter("txtUnidad");
                String codigoU = consultas.buscar(unidad);
                List<LcencEncreq> listEnc = new ArrayList();
                listEnc = consultas.buscarEncReq(codigoU);
                List<LcdetDetreq> listDet = new ArrayList();
                listDet = consultas.buscarDetReq(codigoU);
                resultado
                        = "<table style='text-align:center;' class='tab' border='1'>"
                        + "<tr>"
                        + "<th><h3>ORD</h3></th> <th>DESCRIPCIÓN</th> <th>CANTIDAD</th>";
                for(int a=0; a<listEnc.size(); a++){
                    resultado += "<tr>"
                        + "<th>" + listEnc.get(a).getEncFecha() + "</th>"
                        + "<th>" + listDet.get(a).getDetTactv() + "</th>"
                        + "<th>" + listDet.get(a).getDetOpemen() + "</th>"
                        + "<th>" + listDet.get(a).getLartArtic() + "</th>"
                        + "<th>" + listDet.get(a).getDetCantcom() + "</th>"
                        + "<th>" + listDet.get(a).getDetKmHoras() + "</th>"
                        + "</tr>";
                }
                resultado += "</table >";
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
            <ui:insert name="tituloPagina"> \ Consolidado Requerimiento de Combustible</ui:insert>
        </div>
        <br/> <br/> <br/> <br/> 
        <br/> <br/>
        <form name ="frmuser" class="formu" method="POST" action="Req_ReporteUnidad.jsp">
            <table class="tab">
                <tr>
                    <td>
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
                    </td>
                    <td>
                        <input type="submit" name="btnBReqU" class="formulario_submit" value="Generar Consolidado" />
                    </td>
                </tr>
                <tr>
                    <!--encabezado del reporte -->
                    <td colspan="2"> &nbsp; 
                        <h3 ALIGN="RIGHT">
                            <script type="text/javascript">
                                var meses = new Array ("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"); 
                                var f=new Date(); 
                                document.write(f.getDate() + " de " + meses[f.getMonth()] + " del " + f.getFullYear()); 
                            </script>
                        </h3>
                        <h3 ALIGN="LEFT"><B>Asunto: SOLICITANDO REQUERIMIENTO DE COMBUSTIBLE</B></h3>
                    </td>
                </tr>
                <tr>                     
                    <td colspan="2"> &nbsp;                        
                    </td>                    
                </tr>
                <tr>
                    <td colspan="2"> &nbsp;</td>
                </tr> 
               
                <tr>
                    <td colspan="2">
                        <%
                            out.println(resultado);
                        %>
                    </td>
                </tr>
                <tr>
                    <!--firmas -->
                    <td colspan="2"> &nbsp; 
                        <div>
                            <h3>
                                <pre>
                                EL OFICIAL DE LOGÍSTICA             EL OFICIAL DE OPERACIONES               EL COMANDANTE


                                .......................             ........................            .......................
                                     CAPT. DE INT                         MAYO. DE INF.                    Sr. TCRN. DE E.M.
                                </pre>                                
                            </h3> 
                        </div>
                    </td>
                </tr>
            </table>
        </form>        
    </body>
</html>
