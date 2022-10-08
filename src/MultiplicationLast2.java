import java.util.Scanner;

public class MultiplicationLast2 {

	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		
		String[] splitedValue = inputValue.split(",");
		
		int first=Integer.parseInt(splitedValue[0]);
		int second=Integer.parseInt(splitedValue[1]);

		//8,7 과 같은 문자열을 입력하면...
		
		for(int i=2; i<=first; i++) {
			System.out.println("\n"+i+"단 출력 시작\n");
			for(int j=1; j<=second; j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
		}
		scanner.close();
	}
}
