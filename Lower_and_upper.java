package sample;

import java.util.Scanner;

public class Lower_and_upper {
	
	public static int sumofeven(int a) { 
		int evensum=0;
	for (int j=2; j<=a;j+=2)
		
	 evensum = evensum +j;
	 return evensum;		
	}


	public static int sumofodd(int b) { 
		int oddsum=0;
		 for (int k=1; k<=b; k+=2) 
			 oddsum = oddsum +k;
		
		return oddsum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int start = sc.nextInt();
		System.out.println("Enter the second number: ");
		int end = sc.nextInt();
		System.out.println("List between "+ start +" and " + end );
		int result = 0, result1=0 ;
		for (int i=start; i<=end; i++) {
			if(i%2 ==0) 
//				  System.out.println(i);
				result = sumofeven(i);
		  else if (i%2!=0)
				result1 = sumofodd(i);

		}
		int diff = result - result1;
		System.out.println("The sum of even numbers from "+start+" to "+end+" is: "+ result );
		System.out.println("The sum of odd numbers from "+start+" to "+end+" is: "+ result1 );
		System.out.println("The absolute difference between the two sums is: "+ diff);    }
}


