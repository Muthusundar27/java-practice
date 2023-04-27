package sample;

import java.util.Scanner;

public class Ctrl_flow_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value a: "+'\n'+"Enter the value b: ");
int a = sc.nextInt();
int b = sc.nextInt();
int teen_sum;
if(a==13 || b==13) {
	System.out.println("teenSum : 19");
}
else {
	teen_sum = a + b;
	System.out.println("teenSum : " + teen_sum);
}
	}

}
