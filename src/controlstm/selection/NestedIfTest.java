package controlstm.selection;

public class NestedIfTest {
	/*
	 * ---------nested if-else ------------
	 * 
	 * # syntax :
	 * 
	 *   if(condition-1){
	 *   
	 *      if(condition-2){
	 *      
	 *         .............
	 *         ...............
	 *         ............
	 *      
	 *      }else{
	 *      
	 *      }
	 *      
	 *   }else{
	 *   
	 *   }
	 */
	
	public static void main(String[] args) {
		
		String citizen = "nepali";
		int age = 50;
		boolean haveVoteId = false;
		
		if(citizen.equals("nepali")) {
			
			  if(age >= 18) {
				  
				   if(haveVoteId) {
					   System.out.println("U can vote");
				   }else {
					   System.out.println("U dont hv vId");
				   }
				  
			  }else {
				  System.out.println("You are under age");
			  }
			
		}else {
			System.out.println("invalid citizen");
		}
		
	}

}









