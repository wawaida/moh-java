
package chap5;

// class member ada 2: 1)property 2)method
public class Person {
    
    // property
    String name;
    int age;
    String gender;    
    private String statusKahwin;
    
    public String getStatusKahwin(String jenisOrang){
        if(jenisOrang.equals("kanak2")){
            return "Muda lagi";
        }else if(jenisOrang.equals("tansri")){
            return "Janda";
        }else{
            return "Bujang";
        }
    }
    
    // method constractor
    public void walk(){
        
    }
    
    // method constractor
    public void talk(){
        
    }
    
    // method constractor
    public void sing(){
        
    }
    
}
