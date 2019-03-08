
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.UserModel;

@WebServlet(name = "User", urlPatterns = {"/user"})
public class User extends HttpServlet {
    
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        String name = req.getParameter("name");
        String role = req.getParameter("role");
        String staffId = req.getParameter("staff_id");
        String pwd = req.getParameter("pwd");
        String gender = req.getParameter("gender");
        
        UserModel user = new UserModel();
        
        user.setGender(gender);
        user.setName(name);
        user.setRole(role);
        user.setStaffId(staffId);
        user.setPwd(pwd);
        user.insert();
        
    }
    
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
    }

}
