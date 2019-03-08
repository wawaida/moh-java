
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" 
              href="/pms/assets/bootstrap/css/bootstrap.css">
        <title>Welcome To Movie Details</title>
    </head>
    <body>
        <%
            String msg = request.getParameter("msg");
            
            if(msg != null){
                out.print("<div class='alert alert-danger'>User not recognized !!!</div>");
            }
        %>        
        <div class="col-md-6" style="background-color: #eee;" >
            <form method="post" action="/pms/login">
                <div>Staff ID</div>
                <div><input type="text" name="staff_id" class="form-control"></div>
                <div>Password</div>
                <div><input type="password" name="pwd" class="form-control"></div>
                <br>
                <div><input type="submit" value="Signin" class="btn btn-primary"></div>              
            </form>
        </div>
    </body>
</html>
