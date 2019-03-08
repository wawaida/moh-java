
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IF...ELSE Example</title>
    </head>
    <body>
        <%!
            int day = 3;
        %>
        
        <% if(day == 1 | day == 7){ %>
        <p>Today is weekend</p>
        <% }else{ %>
        <p>Today is not weekend</p>
        <% } %>        
    </body>
</html>
