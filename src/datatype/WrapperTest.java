package datatype;

import java.util.List;

public class WrapperTest {
	
	/*
	 * ---------------- Wrapper Class -------------------
	 * # every primitive data type have their respective class
	 *   is known as wrapper class.
	 *   
	 *   Primitive      Wrapper class
	 *  -----------    ----------------
	 *     byte			Byte
	 *     short		Short
	 *     int			Interger
	 *     long			Long
	 *     float		Float
	 *     double		Double
	 *     char			Character
	 *     boolean 		Boolean		    
	 */
	public static void main(String[] args) {
		
		Math.subtractExact(3434, 5656);
		
		int a = 600;
		Integer p = 800;
		
		/*
		 *   ----- Auto-boxing-----
		 *   -> conversion of primitive type into wrapper type.
		 *   
		 */
		
		  int k = 3434;
		  Integer m = k;//auto-boxing
		  
		  /*
		   * ------- Auto-unboxing -------------
		   * 
		   *  -> conversion of wrapper type into primitive typ
		   */
		  
		  Double n = 343435.45454;
		  double ar = n; //auto un-boxing
		  
		  System.out.println(Integer.toBinaryString(456789));
		  System.out.println(Integer.toOctalString(456789));
		  System.out.println(Integer.toHexString(456789));
		  
	}

}
