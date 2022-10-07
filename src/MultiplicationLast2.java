import java.util.Scanner;

public class MultiplicationLast2 {

	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		
		String[] splitedValue = inputValue.split(",");
		
		int first=Integer.parseInt(splitedValue[0]);
		int second=Integer.parseInt(splitedValue[1]);

		//8,7 과 같은 문자열을 입력하면...
		
			for(int i=1; i<=first; i++) {
				//for(int j=2; j<=second; j++) {
					System.out.println(first+"x"+i+"="+first*i);
				//}
		}
	}
}
	

