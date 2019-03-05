
package chap4;
/*
discuss on "static" keyword and can 
- apply to variable and method
- shared 
*/

public class Book {
    static int bil = 0; // shared by all obj and own by class
    String title;
    
    public static void cetak(){
        System.out.println("Jumlah Buku = " + Book.bil);
    }
    
    public void info(){
    }
    
    Book(){
        Book.bil = Book.bil + 1;
        System.out.println("Bil buku = " + Book.bil);        
    }
    
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        Book.cetak();
        //info(); // tak boleh sbb dia bukan statik       
        
    }
    
}
