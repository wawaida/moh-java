
package chap4;

public class Student {
    
    // pass variable by val vs by reference 
    // primitive + String = passing by value
    // object always passing by reference
    void setName (String name){
        System.out.println(name);
        name = name + "binti che pauzur";
        System.out.println(name);
    }
    
    void changeBookTitle(Book b){
        b.title = "JAVA ADVANCE";
    }
    
    public static void main(String[] args) {
        
        Student std1 = new Student();
        String nama = "che wahida ";
        
        // passing var by value
        std1.setName(nama);
        System.out.println(nama);
        
        // passing var by reference
        Book b1 = new Book();
        b1.title= "JAVA FOR BEGINNER";
        System.out.println(b1.title);        
        std1.changeBookTitle(b1);
        System.out.println(b1.title);
    }
    
}
