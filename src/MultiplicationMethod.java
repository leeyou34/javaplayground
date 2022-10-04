
public class MultiplicationMethod {
	////below is the the method
	/// 1. calculate method
	// the method is declared with array in integer format
	public static int[] calculate(int times) {
		// total 10 digit could save
		int[] result = new int[9];
		// for statement activates
		for(int i=0; i<result.length; i++) {
			result[i]=times*(i+1);
		}
		return result;
	}
	/// 2. print method
	// the print method can print the array format
	public static void print(int[] result){
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	
	public static void main(String[]args) {
		for(int i=2; i<10; i++) {
			int[] result = calculate(i);
			print(result);
		}
	}
}