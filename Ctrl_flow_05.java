package sample;

import java.util.Scanner;

public class Ctrl_flow_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj = new Scanner(System.in);
System.out.println("Enter the cost of the mobile: ");
int cost=obj.nextInt();
if(cost<=15000) {
	System.out.println("Mobile chosen is within the budget");
}
else {
	System.out.println("Mobile chosen is beyond the budget ");
}
	}

}
