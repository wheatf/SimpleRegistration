<%-- 
    Document   : results
    Created on : 16 Oct, 2019, 10:24:04 PM
    Author     : Jimmy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>
            Hello <%=request.getParameter("name")%>
        </p>
        
        <p>
            The information you have submitted is as follows:<br>
            Admin Number : <%=request.getParameter("adminno")%><br>
            Email : <%=request.getParameter("email")%><br>
            Gender : <%=request.getParameter("gender")%><br>
            Choice of Specialisation : <%=request.getParameter("specialisation")%><br>
        </p>
        
        <p>
            Your BMI is <%=request.getAttribute("bmi")%>.
        </p>
        
        <p>
            <% 
            double bmi = (Double)request.getAttribute("bmi"); 
            if (bmi < 20){
                out.print("You are considered underweight.");
            } else if (bmi <= 25){
                out.print("You are just right.");
            } else {
                out.print("You are considered overweight.");
            }
            %>
        </p>
    </body>
</html>
