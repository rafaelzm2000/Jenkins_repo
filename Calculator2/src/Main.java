import java.util.*;

public class Main {

	public static void main(String[] args) {

		Calculator calculator = new Calculator(); 
		TemperatureConverter convert = new TemperatureConverter();

		System.out.println("Enter 1 for calc \nEnter 2 for temp");
	   	
		Scanner in = new Scanner(System.in); 
		int flag = in.nextInt();
		
		if(flag == 1) {
			float result = calculator.calculate();
			
			System.out.print("Result from main = " + result);
		}
		else {		
		
		float temp = convert.convert();
		
		System.out.print("Temperature from main = " + temp);
		}
			
	}
}


