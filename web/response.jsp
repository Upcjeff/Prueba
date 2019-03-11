<%-- 
    Document   : response
    Created on : 18-feb-2019, 15:52:01
    Author     : jeffe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <jsp:useBean id="mybeanEstudiante" scope="session" class="co.edu.unipiloto.metodos.Estudiante" />
        <jsp:setProperty name="mybeanEstudiante" property="name" />
        <jsp:setProperty name="mybeanEstudiante" property="apellido" />
        <jsp:setProperty name="mybeanEstudiante" property="ingreso"  /> 
         <jsp:setProperty name="mybeanEstudiante" property="programa"  />
        <jsp:setProperty name="mybeanEstudiante" property="semestre"  />    
        <jsp:setProperty name="mybeanEstudiante" property="dia"/>
        <jsp:setProperty name="mybeanEstudiante" property="mes"/>
        <jsp:setProperty name="mybeanEstudiante" property="anyo"/>
        
        <h1>Hello,
            <jsp:getProperty name="mybeanEstudiante" property="name" /> 
            <jsp:getProperty name="mybeanEstudiante" property="apellido" /> </h1>  
            <h2>Edad: <jsp:getProperty name="mybeanEstudiante" property="resultado" /> años.</h2>
            <h2>Programa: <jsp:getProperty name="mybeanEstudiante" property="programa" /> </h2>
            <h2>Semestre cursados: <jsp:getProperty name="mybeanEstudiante" property="semestreActual" /> </h2> 
    </body>
</html>
