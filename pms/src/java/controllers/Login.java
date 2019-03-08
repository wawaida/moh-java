/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.ProjectModel;
import models.UserModel;


@WebServlet(name = "Login", urlPatterns = {"/login"})
public class Login extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        String staffId = req.getParameter("staff_id");
        String pwd = req.getParameter("pwd");
        UserModel user = new UserModel();
        
        if(user.isExist(staffId, pwd)){
            // user wujud, set session, then go project list
            HttpSession sess = req.getSession();
            sess.setAttribute("loggedin", true);
            res.sendRedirect("/pms/project");
        }else{
            //user tak wujud, go back to login            
            res.sendRedirect("/pms/pub/login.jsp?msg");
        }
        
    }

}
