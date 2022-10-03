import java.util.Scanner;

public class HelloWorld {
	public static void main(String[]args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Yo man");
		System.out.println("Enter a number to check if number is greater than 5");

		int number = reader.nextInt();
		if (number > 5) {
			System.out.println("The number is greater than 5");
		} else {
			System.out.println("The number is less than 5");
		}
	}
}
