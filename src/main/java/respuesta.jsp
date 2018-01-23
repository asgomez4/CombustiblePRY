<%-- 
    Document   : respuesta
    Created on : 18/01/2018, 14:21:18
    Author     : Sofia Gomez
--%>

<%@page import="ec.mil.ejercito.combustible.consultas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Combustible</title>
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
                <a href="Requerimiento.jsp">Regresar</a>
        <%
                } else {
        %>
                <script>alert("Datos no ingresados");</script> 
                <a href="Requerimiento.jsp">Regresar</a>
        <%
                }
            }
        %>
            }
        %>
    </body>
</html>
