// nama file dan nama class mesti sama
// variable name guna camel case i.e NamaSaya
// 1 class akan ada dlm 1 file
public class Car {    
    String color;
    int numOfDoors; 
    
    void print(){       
        System.out.println("Color : "+ this.color);
    } 

    void startEngine() {
        System.out.println("Vromm..Vromm..."); //sout tab
    }

    void stopEngine() {
        int tempCounter = 0;
    }
}
