
import java.sql.Connection;
import java.sql.DriverManager;
  

public class Model {
    
    public Statement getStmt(){
        
        Connection conn = null;
        Statement stmt = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/sakila","root","");
            stmt = conn.createStatement();
            
        }catch(Exception e){
            System.out.println("Berlaku error");
            System.out.println(e.getMessage());  
            e.printStackTrace();            
        }
        return stmt;
    }
}
