
package chap5;


public class Array {
    public static void main(String[] args) {
        
        // $people = [] // php
        // bil date dlm array = 3. fixed
        String[] people = new String[3];
        people[0] = "Ani";
        people[1] = "Ana";
        people[2] = "Asma";
        
        System.out.println(people[2]);
        
        // int[] bil = new int - x blh 
        Integer[] bil = new Integer[5]; // atau
        int[] jum = {1,2,3}; // cara primitive
        
        for (int i=0; i<jum.length; i++){
            System.out.println(jum[i] +". "+people[0]);
        }
        
        int j = 0;
        while(j < jum.length){
            System.out.printf("Val = %s", jum[j]);                    
            j++;
        }
    }
}
