package controlstm.selection;

public class SwitchTest {
	
	/*
	 * -------------- switch ------------------
	 * # syntax :
	 * 
	 *    switch(variable){
	 *    
	 *        case 1 :
	 *          //statements
	 *          break;
	 *          
	 *        case 2 :
	 *          //statements
	 *          break;
	 *          
	 *          ...............
	 *          ............
	 *          .............
	 *          default :
	 *           //statements  
	 *          
	 *    }
	 *    
	 *    case value may be String,int,char and Enum
	 */
	
	public static void main(String[] args) {
		
		int day = 2;
		
		switch(day) {
		
		case 1 :
			//System.out.println("Sunday");
			//break;
			
		case 2:
			//System.out.println("Monday");
			//break;
			
		case 3:
			System.out.println("Coding");
			break;
			
		case 4:
			System.out.println("Wednesday");
			break;
			
		case 5:
			System.out.println("Thursday");
			break;
			
		case 6:
			System.out.println("Friday");
			break;
			
		case 7:
			System.out.println("Saturday");
			break;
			
			default :
				System.out.println("invalid input");
			
		}
	}
	
	/*
	 *   Q1>  WAP to calculate total salary of following post :
	 *   
	 *      post         basic salary      bonus   total salary 
	 *    ---------     --------------    -------  --------------
	 *    MD                 230000         20%         ?
	 *    CEO                250000         25.79%      ?
	 *    MANAGER            176000         16 %        ?
	 *    HELPER             145900         9%          ?
	 *  ---------------------------------------------------
	 *  
	 *  Q2> WAP to calculate +,-,*,/ of two int values using switch.
	 *      char op = sc.next().chatAt(0);
	 */
}
