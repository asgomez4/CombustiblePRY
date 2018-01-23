<%@page import="java.sql.Connection"%>
<%@page import="ec.mil.ejercito.combustible.conexion" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>Combustible</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="resources/css/menu.css" media="screen" />
        <link rel="stylesheet" type="text/css" href="resources/css/default.css" media="screen" />
        <link rel="stylesheet" type="text/css" href="resources/css/accordion.css" media="screen" /> 
        <link rel="stylesheet" type="text/css" href="resources/css/horizontal.css" media="screen" /> 
    </head>
    <body>
        <%
            Connection con = conexion.Conexion();
            if(con != null){
                //out.print("conexion establecida");
            }else{
                //out.print("conexion NO establecida");
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
        </div>
        <br/> <br/> <br/> <br/> 
        <br/> <br/> <br/> <br/>
        <div class="encab">
            <input type="checkbox" name="" id="btn-menu"/>
            <label for="btn-menu"><img src="resources/img/icono-menu.png"/></label>
            <nav class="menuHori">
                <ul>
                    <li>
                        <a href="#">Requerimiento de Combustible</a>
                        <ul class="children">
                            <li><a href="Requerimiento.jsp">Registrar</a></li>
                            <li><a href="Req_ReporteUnidad.jsp">Reporte por Unidad</a></li>
                        </ul>
                    </li>
                    <li><a href="factura.jsp">Registro de Factura</a></li>
                    <li><a href="remision.jsp">Registro de Guía de Remisión</a></li>
                    <li><a href="despacho.jsp">Despacho de Combustible</a></li>
                </ul>
            </nav>
        </div>
        <br/><br/><br/>
        <div style="width:30%; margin:0 auto;padding: auto">                
            <img src="resources/img/siloge.jpg" width="100%" alt=""/>
        </div>
</body>
</html>
