package sample;

import java.util.Scanner;

public class Ctrl_flow_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a, current_num ;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number: ");
a = sc.nextInt();
if (a%2!=0) {
	current_num = (a*3)+1;
}
else {
	current_num = a/2;
}
System.out.println("CurrentNumber: " + current_num);
	}

}
