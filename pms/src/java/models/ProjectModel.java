
package models;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProjectModel extends Model{
    
    public ProjectModel(){
        this.title = "";
        this.description = "";    
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public boolean insert(){
        String sql = "INSERT INTO project(title, description) VALUES('" + this.title + "','" + this.description + "')";
        try{
            Statement stmt = this.getStmt();
            stmt.execute(sql); // insert,update,delete                   
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }  
        return true;
    }
    
    public boolean update(int id){
        String sql = "UPDATE project SET title = '" + this.title + "', description = '" + this.description + "' WHERE ID = " + id;
        try{
            Statement stmt = this.getStmt();
            stmt.execute(sql); // insert,update,delete                   
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }  
        return true;
    }
    
    public boolean delete(int id){
        String sql = "DELETE FROM project WHERE ID = " + id;
        try{
            Statement stmt = this.getStmt();
            stmt.execute(sql); // insert,update,delete                   
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }  
        return true;
    }
    
    // return one record
    public ProjectModel getOne(int id){ 
        ArrayList arr = new ArrayList();
        String sql = "SELECT * FROM project WHERE ID = " + id;
        ProjectModel pro = new ProjectModel();
        
        try{
            Statement stmt = this.getStmt();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next()){                
                pro.id = rs.getInt("id");
                pro.title = rs.getString("title");
                pro.description = rs.getString("description");
                arr.add(pro);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }        
        return pro;        
    }
    
    private int id;
    private String title;
    private String description;
    
    public ArrayList getAll(){ 
        ArrayList arr = new ArrayList();
        String sql = "SELECT * FROM project";
        try{
            Statement stmt = this.getStmt();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                ProjectModel pro = new ProjectModel();
                pro.id = rs.getInt("id");
                pro.title = rs.getString("title");
                pro.description = rs.getString("description");
                arr.add(pro);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }        
        return arr;        
    }
    
    public ArrayList search(String title, String desc){ 
        ArrayList arr = new ArrayList();
        String sql = "SELECT * FROM project WHERE 1 "; 
        
        if(! title.equals("")){
            sql += "AND title LIKE '%" + title + "%' ";
        }
        
        if(! desc.equals("")){
            sql += "AND description LIKE '%" + desc + "%'";
        }
        
        try{
            Statement stmt = this.getStmt();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                ProjectModel pro = new ProjectModel();
                pro.id = rs.getInt("id");
                pro.title = rs.getString("title");
                pro.description = rs.getString("description");
                arr.add(pro);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }        
        return arr;        
    }
    
    public static void main(String[] args) {
        ProjectModel p = new ProjectModel();
        p.setTitle("Baby Boss");
        p.setDescription("..pandainyew!!!..");
        p.insert();
        
        ArrayList list = p.getAll();
        for(int i=0; i<list.size(); i++){
            ProjectModel pro = (ProjectModel) list.get(i);
            System.out.println(pro.title);            
        }
    }
    
}
