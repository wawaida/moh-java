
// dari JDK
import java.io.IOException;
import java.io.PrintWriter;
// dari file .jar
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/student"})
public class StudentController extends HttpServlet {
    
        
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {            
            response.setContentType("text/html");            
            PrintWriter out = response.getWriter();
            
            String nama = request.getParameter("nama");
            //String age = request.getParameter("age");
            String gender = request.getParameter("gender");
            
            request.setAttribute("name", nama);
            //request.setAttribute("age", age);
            request.setAttribute("gender", gender);
            
            RequestDispatcher dispatch = request.getRequestDispatcher("student_details.jsp");
            dispatch.forward(request, response);
    }   

}
