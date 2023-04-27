package sample;

import java.util.Scanner;

public class Ctrl_flow_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner myobj = new Scanner(System.in);
System.out.println("Enter the car no: ");
int car =myobj.nextInt();
int digit, sum = 0;
if (car<999 || car > 10000) {
	System.out.println(car +" is not a valid car number ");
}
	while (car>0) {
		digit = car%10;
		
		sum = sum +digit;
		
		car = car / 10;
		
 	}
	int result = sum;
	if ((result%3==0) || (result%5==0) || (result%7==0)) {
	System.out.println("Lucky Number");
	} 
	

else {
	 System.out.println("Sorry its not my lucky number ");
}

		}
}
