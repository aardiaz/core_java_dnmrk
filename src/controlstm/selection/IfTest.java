package controlstm.selection;

import java.util.Scanner;

public class IfTest {
	
	/*
	 *  # syntax :
	 *    if(condition){
	 *        //statements
	 *    }
	 *    
	 */
  
	  public static void main(String[] args) {
		
		  int salary;
		  
		  Scanner sc = new Scanner(System.in);
		 
		  System.out.println("Enter your salary ");
		  salary = sc.nextInt();
		  
		  if(salary < 30000) {
		       salary = salary + 8000;
		  }
		  
		  System.out.println("Your Total salary = "+salary);
	}
}
