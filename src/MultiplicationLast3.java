import java.util.Scanner;

public class MultiplicationLast3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		int i=1;
		while(i++ <first) {
			System.out.println(i+"단을 출력합니다.");
			int j=0;
			while(j++ <second) {
				System.out.println(i+"x"+j+"="+i*j);
			}
		}
	}

}
