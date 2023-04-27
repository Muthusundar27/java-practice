package sample;

import java.util.Scanner;

public class Ctrl_flow_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int code;
double sum, x = 0, y = 0;
Scanner se = new Scanner(System.in);
System.out.println("Enter the code: ");
code = se.nextInt();
 if(code==1) {
 System.out.println("Enter the first num: ");
	x = se.nextDouble();
System.out.println("Enter the second num: ");
	y = se.nextDouble();
	sum = x + y;
	System.out.println("Sum: " + sum);
}
 else {
		System.out.println("Sum: 0.00");
	}

// System.out.println("Entered integer is: "  + code);




	}

}
