package controlstm.looping;

public class JumpigTest {
	
	/*
	 * --------------- Jumping Statements -------------
	 * a> beak;         => exit from loop
	 * b> continue;     => skip values
	 * c> return;       => exit from method
	 */

	  public static void main(String[] args) {
		
		  for(int i=1; i<=10; i++) {
			  
			    if(i == 5 || i == 9) {
			    	//break;
			    	//continue;
			    	return;
			    }
			  System.out.println(i);
		  }
		  
		  System.out.println("----end for loop----");
	}
}
