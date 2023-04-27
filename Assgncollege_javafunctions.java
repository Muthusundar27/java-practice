package sample;

import java.util.Scanner;

public class Assgncollege_javafunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner obj = new Scanner (System.in);
	System.out.println("Enter CS, EC, ME:");

		int CS =obj.nextInt();
		int EC =obj.nextInt();
		int ME =obj.nextInt();
		
	if (CS == EC && EC == ME && ME == CS ) {
		System.out.println("None of the department has got the highest placement");
	}
	else if(CS<0 || EC<0 || ME<0)
	{
		System.out.println("Input is Invalid- Enter the correct value");
	}
	else if (CS==EC) {
		System.out.println("Highest placement CS,EC");
	}
	else if (CS==ME) {
		System.out.println("Highest placement CS,ME");
	}
	else if (EC==ME) {
		System.out.println("Highest placement EC,ME");
	}
	else if (CS>EC && CS>ME) {
		System.out.println("Highest placement CS");
	}
	else if (EC>ME && EC>CS) {
		System.out.println("Highest placement EC");
	}
	else {
		System.out.println("Highest placement ME");
	}

	}

}
