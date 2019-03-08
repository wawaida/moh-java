/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.ProjectModel;

@WebServlet(name = "Project", urlPatterns = {"/project"})
public class Project extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action != null){
            int id = Integer.parseInt(request.getParameter("id"));
            ProjectModel pro = new ProjectModel();
            if(action.equals("edit")){
                pro = pro.getOne(id);
                request.setAttribute("project", pro);
                request.getRequestDispatcher("project/form.jsp").forward(request, response);
            }else if(action.equals("del")){
                pro.delete(id);
            }
        }
        ArrayList list = new ProjectModel().getAll();
        request.setAttribute("list", list);
        request.getRequestDispatcher("project/list.jsp").forward(request, response);
        
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String search = request.getParameter("search");
        if(search != null){
            //search
            String title = request.getParameter("title");
            String desc = request.getParameter("description");
            
            ProjectModel pro = new ProjectModel();
            ArrayList list = pro.search(title,desc);
            
            request.setAttribute("list", list);
            request.getRequestDispatcher("project/list.jsp").forward(request, response);            
            
        }else{       
            //insert or update
            String title = request.getParameter("title");
            String description = request.getParameter("description");
            String id = request.getParameter("id");

            ProjectModel pro = new ProjectModel();
            pro.setTitle(title); // decleration adalah private so keno panggil gini
            pro.setDescription(description);

            if(id.equals("0")){
                //insert
                pro.insert();
            }else{
                //update
                int id2 = Integer.parseInt(id);
                pro.update(id2);
            }        

            //request.getRequestDispatcher("project/list.jsp").forward(request, response);
            response.sendRedirect("project"); // submit dan nk tuju ke mana
        }
        
    }
    
    


}
