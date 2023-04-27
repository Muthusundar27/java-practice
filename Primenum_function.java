package sample;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Primenum_function {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
     Scanner myobj = new Scanner(System.in);
     System.out.println("Enter the First number: ");
     int start = myobj.nextInt();
     System.out.println("Enter the second number: ");
     int end = myobj.nextInt();
     System.out.println("List of prime numbers between " 
     + start + " and " + end); 
     

 
        if (start>end){
    	 System.out.println("Provide valid input");
     }
     for (int i = start; i <= end; i++) {   
          if (isPrime(i)) {  
             System.out.println(i);  
         }
     }  
 }
	
public static boolean isPrime(int n) {  
     if (n <= 1) {  
         return false;  
     }  
     for (int i = 2; i <= Math.sqrt(n); i++) {  
         if (n % i == 0) {  
             return false;  
         }  
     }  
     return true;  
   
 }    
}
     	