
package models;

import java.sql.ResultSet;
import java.sql.Statement;

public class UserModel extends Model{
    // property 
    // need to declare public : right click -> insert code -> getter() and setter()
    private int id;
    private String staffId;
    private String name;
    private String pwd;
    private String role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public boolean isExist(String staffId, String pwd){
        
        String sql = "SELECT * FROM users WHERE staff_id ='" + staffId + "' AND pwd = '" + pwd + "'";
        
        try{
            Statement stmt = this.getStmt();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                //user wujud
                this.id = rs.getInt("id");
                this.pwd = rs.getString("pwd");
                this.staffId = rs.getString("staff_id");
                this.name = rs.getString("name");
                this.role = rs.getString("role");
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
