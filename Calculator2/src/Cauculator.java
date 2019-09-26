
public class Cauculator {

	public static void main(String[] args) {

		int num = 10;
		
		int result = calulate(num);
		
		System.out.print("Buil completed sucessfully. the resutls is " + result);

	}
	
	public static int calulate (int input) {
		
		int result = (input * (input + 1)) / 2;
		return result;
		
	}

}
