package chap4;
/*
"this" utk set/get a property or call/run method
i.e this.jumlah = 100;
 */

public class LoanCalculator extends Calculator{

    // property
    int jumlah; // variable
    final String tajuk = "LOAN CALCULATOR"; // "final" => value tak boleh tukar
    
    // ini override cetak() dalam parent
    @Override
    public void cetak(){
        //this.tajuk = "abc"; //initial value dh di assign kpd yg utama, dh x blh tukar
        System.out.println("cetak LoanCalculator");
    }
    
    /*public final void info(){
    }*/
    // ini tak boleh sbb parent info() dah final
        
    
    // ctrl + space = show auto suggestion
    // 
    public static void main(String[] args) {
        LoanCalculator cal = new LoanCalculator();
        cal.cetak(); 
        LoanCalculator cal2 = new LoanCalculator(2); // shift + ctrl + arrow bwh
    }
    
    // contractor - tiada return dan nama mesti sama dgn class
    // dlm satu class boleh ad multiple constructor
    // auto call bila create new obj
    // guna biasanyew initialize variable
    // mesti public
    public LoanCalculator(){
        super(); // run parent contractor
        System.out.println("i'm in constractor");
    }
    
    public LoanCalculator(int amount){
        this.jumlah = amount; // initialize value awalan
        System.out.println("i'm in constractor 2");
    }
    
    //mesti return int, void-no return
    int calcLoanPayment(int amount, int numberOfMonths, String state) {
    // Your code goes here
        return 0;
        
    }
    //shift + alt + F = auto arrange code
    
    // method overloading
    int calcLoanPayment(int amount){
        return 0;
    }
    
}
