// main() berada satu class khusus yg akan guna clss2 yg lain
public class App {
    // entry point method
    public static void main(String[] args){
        // create object
        Car ferrari = new Car();
        ferrari.numOfDoors = 2;
        ferrari.color = "red"; // mesti "" x boleh '', '' tul char shj
        ferrari.print();    
        ferrari.startEngine();
        
        Car porsche = new Car();   
                
    }    
}
