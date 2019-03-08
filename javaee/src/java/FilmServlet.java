
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/film"})
public class FilmServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        PrintWriter out = response.getWriter();
        
        try{
            // load driver
            Class.forName("com.mysql.jdbc.Driver");
            // connect to mysql database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/sakila","root","");
            stmt = conn.createStatement();
            String sql ="SELECT * FROM film";
            rs = stmt.executeQuery(sql);
            
            out.print("<table border=''>");
            out.print("<tr>");
            out.print("<td>Id</td>");
            out.print("<td>Title</td>");
            out.print("</tr>");
            out.print("<tr>");
            while(rs.next()){
                int id = rs.getInt("film_id");
                out.print("<tr>");
                out.print("<td>" + id + "</td>");
                out.print("<td>" + rs.getString("title") + "</td>");
                out.println("</tr>");
            }
            out.print("</table>");
        }catch(Exception e){
            System.out.println("Berlaku error");
            System.out.println(e.getMessage());            
        }
            // query
        
            // display result
        
        
    }  

}
