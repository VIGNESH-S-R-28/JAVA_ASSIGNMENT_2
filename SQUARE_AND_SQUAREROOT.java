import java.util.*; 

public class SQUARE_AND_SQUAREROOT {
		
		void SQUARE_AND_SQUAREROOT() {
			
			@SuppressWarnings("resource")
			Scanner sc= new Scanner(System.in);
			
			System.out.print("Enter number :");
			
			double number1= sc.nextInt();
							
			double t;
			
			double squareroot = number1 / 2;
			
			do {
				t=squareroot;
				
				squareroot = (t+(number1/t))/2;
				
			   } while ((t - squareroot) !=0);
			
			
			double number2 = number1 * number1;
			
			System.out.println("Square Root : "+squareroot);
			
			System.out.println("Square Value : "+number2);
			
		}
			

		public static void main(String[] args) {
			
			SQUARE_AND_SQUAREROOT obj = new SQUARE_AND_SQUAREROOT();
					
			obj.SQUARE_AND_SQUAREROOT();
			


	}

}
