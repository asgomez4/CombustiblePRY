<%@page contentType="text/html" pageEncoding="UTF-8"
        import="java.sql.Connection"
        import="java.sql.DriverManager"
        import="java.sql.ResultSet"
        import="java.sql.Statement"
        import="java.sql.SQLException"
%>
<%
    Connection conex = null;
    Statement sql = null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        conex = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3307/combustible","root","1492");
        sql = conex.createStatement();
        //out.print("CONEXION EXTABLECIDA");
    }
    catch(Exception ex){
        //out.print("ERROR EN LA CONEXION" + ex);
    }
%>
