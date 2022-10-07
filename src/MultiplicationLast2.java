import java.util.Scanner;

public class MultiplicationLast2 {

	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		
		int first=Integer.parseInt(inputValue);

		for(int i=1; i<=first; i++) {
			System.out.println(first+"x"+i+"="+first*i);
		}
	}
}
