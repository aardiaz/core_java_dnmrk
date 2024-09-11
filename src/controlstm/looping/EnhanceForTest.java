package controlstm.looping;

public class EnhanceForTest {
	
	/*
	 * -------- forEach loop --------------------------------------
	 *   # use to read data from collection(array,list,set,map etc)
	 *   
	 *   # syntax :
	 *   
	 *      for(data_type  var : collection ){
	 *         
	 *           //statements
	 *      }
	 */
	
	  public static void main(String[] args) {
		
		    int[]   values = {4,5,67,89,76,54,32,45,67,89,76,54,67};
		    int s = 0;
		    
		    for(int x : values) {
		    	System.out.println(x);
		    	s = s + x;
		    }
		    
		    System.out.println("Total = "+s);
	}

}
