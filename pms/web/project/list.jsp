
<%@page import="models.ProjectModel"%>
<%@page import="controllers.Project"%>
<%@page import="java.util.ArrayList"%>
<%@include file="../include/header.jsp"%>

 
 <form method="post" action="/pms/project">
 <div>
    <table class="table">   
    <tr>
        <td>
            Title
            <br><input type="text" name="title" class="form-control">
        </td>
        <td>
            Description
            <br><input type="text" name="description" class="form-control">
        </td>
    </tr>
    <tr>
        <td><input type="submit"  name="search" class="btn btn-primary" value="Search"> <a href="/pms/project/form.jsp" class="btn btn-primary"> Add </a></td>
        <td></td>
    </tr>
    </table> 
    <br>
 </div>
</form>
<table class="table table-bordered">   
    <tr>
        <td>Bil</td>
        <td>Tajuk</td>
        <td>Keterangan</td>
        <td>Tindakan</td>        
    </tr>
    <%
        ArrayList list = (ArrayList)request.getAttribute("list");
        for (int i=0; i<list.size(); i++){
            ProjectModel pro = (ProjectModel)list.get(i);          
    %>
    <tr>
        <td><%= i+1 %>.</td>
        <td><%= pro.getTitle() %></td>
        <td><%= pro.getDescription() %></td>
        <td>
            <a href="/pms/project?id=<%= pro.getId() %>&action=edit" class="btn btn-success btn-sm">Edit</a>
            <a href="/pms/project?id=<%= pro.getId() %>&action=del" class="btn btn-danger btn-sm">Delete</a>
        </td>        
    </tr>    
    <% } %>    
</table>

<%@include file="../include/footer.jsp"%>