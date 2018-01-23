<%-- 
    Document   : remision
    Created on : 18/01/2018, 11:47:00
    Author     : Sofia Gomez
--%>

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
            <ui:insert name="tituloPagina"> \ Guía de Remisión</ui:insert>
        </div>
        <br/> <br/> <br/> <br/> 
        <br/> <br/>
        <form class="formu">
            <table class="tab" >
                <tr>
                    <!--encabezado -->
                    <td colspan="2"> &nbsp; 
                        <div>
                            <h2 ALIGN="CENTER"><B>ACTA REQUERIMIENTO DE COMBUSTIBLE</B></h2>
                            <h3>
                                
                            </h3>                        
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>
                        <article>
                            <h2>Unidad:</h2>  
                            <select name="txtUnidad" class="comun">
                                <option>SECCION PERSONAL</option>
                                <option>SECCION LOGISTICA</option>
                                <option>ACADEMIA DE GUERRA FT</option>
                                <option>DIRECCIÓN</option>
                                <option>SUBDIRECCIÓN</option>
                                <option>POLICIA MILITAR</option>
                                <option>COMANDO GENERAL FT</option>
                                <option>C.E.M 1</option>
                                <option>U.E. COMIL 4</option>
                                <option>G.A.L.M 80</option>
                                <option>29 B.I.M</option>
                                <option>B.O.E.S 54</option>
                            </select> <br/>
                            <br/><br/>
                            <h2>Número de factura:</h2><input type="text" name="txtnumFac" class="comun"/> <br/>
                            <br/><br/> 
                            <h2>Fecha de inicio de transferencia:</h2><input type="date" name="txtofIngreso" class="comun"/> <br/>
                            <br/><br/>
                            <h2>Responsable:</h2><input type="text" name="txtResponsable" class="comun"/> <br/>
                        </article>
                    </td>
                    <td>		
                        <aside>			    		
                            <h2>Tipo de combustible:</h2>
                            <select name="txtTCom" class="comun">
                                <option>GASOLINA 92 OCTANOS</option>
                                <option>GASOLINA ECO</option>
                                <option>GASOLINA SUPER</option>
                                <option>DIESEL PREMIUN</option>
                            </select> <br/>
                            <br/><br/>
                            <h2>Código de control:</h2><input type="text" name="txtcodControl" class="comun"/> <br/>
                            <br/><br/> 
                            <h2>Cantidad total de combustible:</h2><input type="text" name="txtcantComb" class="comun"/> <br/>
                            <br/><br/> 
                            <h2>Estado:</h2><br/> 
                            <input type="radio" name="rbestado" value="PEN" class="radio"/> PENDIENTE
                            <input type="radio" name="rbestado" value="PRO" class="radio"/> EN PROCESO<br/>      
                            <input type="radio" name="rbestado" value="CAD" class="radio"/> CADUCADA
                            <input type="radio" name="rbestado" value="LIQ" class="radio"/> LIQUIDADA<br/>                  
                        </aside>					
                    </td>				
                </tr>
                <tr>
                    <td colspan="2" style="text-align:center;">
                        <br/><br/>
                        <button type="submit" name="btnRegRemi" class="formulario_submit">Registrar Orden de Remisión</button> 
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
