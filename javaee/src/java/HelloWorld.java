
// dari JDK
import java.io.IOException;
import java.io.PrintWriter;
// dari file .jar
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/HelloWorld"})
public class HelloWorld extends HttpServlet {
    private String message;
    
    public void init() throws ServletException{
        message = "Malaysia, we proud of you ";
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
            // Set response content type
            response.setContentType("text/html");
            // Actual logic goes here
            PrintWriter out = response.getWriter();
            String nama = request.getParameter("nama");
            out.println("<h1>" + this.message + nama + "</h1>");
    }  

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {            
            // Set response content type
            // Actual logic goes here
            String nama = request.getParameter("nama");
            int umur = Integer.parseInt(request.getParameter("umur"));
            
            PrintWriter out = response.getWriter();
            out.println("<h1>" + this.message + "</h1>");
            out.println("<h1>" + nama + " " + umur + "</h1>");
    }  

}
