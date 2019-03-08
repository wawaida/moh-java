<%@page import="models.ProjectModel"%>
<%@include file="../include/header.jsp"%>
<%
    ProjectModel pro = (ProjectModel) request.getAttribute("project");
    if (pro == null){ pro = new ProjectModel(); }
%>
<legend>Movies Information Details</legend>

<form method="post" action="/pms/project">
    <br>
    <input type="hidden" name="id" value="<%=pro.getId() %>">
    <div class="row">
        <div class="col-md-1">Title</div>        
        <div class="col-md-4"><input class="form-control" value="<%=pro.getTitle() %>" type="text" name="title"></div>
    </div>   
    <div class="row">
        <div class="col-md-1">Description</div>        
        <div class="col-md-4"><textarea class="form-control" name="description"><%=pro.getDescription() %></textarea></div>
    </div>
    <br>
    <div class="row">
        <div class="col-md-1"></div>
        <div class="col-md-4">
            <input class="btn btn-primary" type="submit" value="Save">
            <a href="/pms/project" class="btn btn-primary"> Back </a>
            <input class="btn btn-primary" type="Reset" value="Clear">
        </div>
    </div>
</form>

<%@include file="../include/footer.jsp"%>