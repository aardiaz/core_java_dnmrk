package controlstm.selection;

public class IfElseTest {
	
	/*
	 * ------------ if-else-----------------
	 * # if we have exactly two conditions.
	 * 
	 *  #Syntax :
	 *  
	 *    if(condition){
	 *       //statements
	 *    }else{
	 *       //statements
	 *    }
	 */
	
	public static void main(String[] args) {
		
		int n = 679;
		
		if(n%2 == 0) {
			System.out.println(n+" is even number");
		}else {
			System.out.println(n+" is odd number");
		}
		
	}

}
