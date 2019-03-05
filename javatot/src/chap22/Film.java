
package chap22;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Film {
    
    protected void list(){
        
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
    
        // lis all film title and descr
        // try..catch = exception/err handling
        // code berada dlm try, catch bila berlaku err
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sakila?useLegacyDatetimeCode=false&serverTimezone=America/New_York  ","root","");
            stmt = con.createStatement();
            String sql ="SELECT * FROM film";
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.print(rs.getString("title") + "\t\t");
                System.out.println(rs.getString("description"));
            }
        }catch(Exception e){
            System.out.println("Berlaku error");
            System.out.println(e.getMessage());
        }
        
    }
    
    public static void main(String[] args) {
        Film f = new Film();
        f.list();
    }
    
}
