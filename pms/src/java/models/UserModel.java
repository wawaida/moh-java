
package models;

import java.sql.ResultSet;
import java.sql.Statement;

public class UserModel extends Model{
    
    public boolean isExist(String staffId, String pwd){
        
        String sql = "SELECT * FROM users WHERE staff_id ='" + staffId + "' AND pwd = '" + pwd + "'";
        
        try{
            Statement stmt = this.getStmt();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                //user wujud
                return true;
            } else {
                //user tak wujud
                return false;
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;        
    }
    
    public static void main(String[] args) {
        
        UserModel model = new UserModel();
        
        if(model.isExist("11111", "1234")){
            System.out.println("OK");
        }else{
            System.out.println("KO");
        }
    }
    
}
