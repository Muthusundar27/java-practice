package sample;

import java.util.Scanner;

public class Assignment_javafunction {
	static int increment1(int salary, int percent) {
	    return (salary/percent)*10;
	  }
	static int increment2(int salary, int percent) {
	    return (salary/percent)*25;
	  }
	static int increment3(int salary, int percent) {
	    return (salary/percent)*30;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter salary, ratings:");
		
         int salary = myObj.nextInt();
		 float ratings = myObj.nextFloat();
		 int percent = 100;
		 
		 if(ratings==0) {
			 System.out.println("Invalid Input- Enter the valid input");
		 }
		 
		 else if(ratings<=4){		 
			    int newsalary = (increment1(salary, percent));
			    System.out.println(newsalary + salary); 
		 }
		 
		 else if(ratings <=7) {
			 int newsalary = (increment2(salary, percent));
			    System.out.println(newsalary + salary);
		 }
		 
		 else if(ratings <=10) {
			 int newsalary = (increment3(salary, percent));
			    System.out.println(newsalary + salary);
		 }
		
		 else { 
			 System.out.println("Invalid Input- Enter the valid input");
		 }
			
	}

}
