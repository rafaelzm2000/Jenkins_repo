import java.util.Scanner;

public class Calculator {

	public float calculate() {
	    
		float num;
		   
		Scanner in = new Scanner(System.in); 
    
		System.out.println("Enter a number");
		
		num = in.nextInt();
    
		float result = (num * (num + 1)) / 2;		
		
		return result;
		
	}
}
