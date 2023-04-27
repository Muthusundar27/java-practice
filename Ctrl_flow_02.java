package sample;

import java.util.Scanner;

public class Ctrl_flow_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

double discount, quantity, rate, total_expenses, temp_value;
Scanner obj = new Scanner(System.in);
System.out.println("Enter the Quantity Purchased: ");
quantity = obj.nextDouble();
System.out.println("Enter thr Rate per item ");
rate = obj.nextDouble();
if (quantity > 1000) {
	temp_value= (quantity*rate);
	discount = (temp_value/100)*10;
	total_expenses = temp_value - discount;
	System.out.println("Total Expenses: " + total_expenses);
}
else if (quantity<=1000) {
	total_expenses= (quantity*rate);
	System.out.println("Total Expenses: " + total_expenses);

}
	}

}
