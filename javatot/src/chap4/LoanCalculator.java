package chap4;

public class LoanCalculator extends Calculator{
    
    int jumlah; // variable
    
    // ctrl + space = show auto suggestion
    // 
    public static void main(String[] args) {
        LoanCalculator cal = new LoanCalculator();
        LoanCalculator cal2 = new LoanCalculator(2); // shift + ctrl + arrow bwh
    }
    
    // contractor - tiada return dan nama mesti sama dgn class
    // dlm satu class boleh ad multiple constructor
    // auto call bila create new obj
    // guna biasanyew initialize variable
    // mesti public
    public LoanCalculator(){
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
