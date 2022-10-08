import java.util.Scanner;

public class MultiplicationLast4 {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		
		String[]splitedValue = inputValue.split(",");
		
		int first=Integer.parseInt(splitedValue[0]);
		int second=Integer.parseInt(splitedValue[1]);
		
		int i=2;
		do {
			int j=1;
			do {
				System.out.println(i+"x"+j+"="+i*j);
			} while (j++ <second);
		} while (i++ < first);
		scanner.close();
	}
}
