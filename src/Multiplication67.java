import java.util.Scanner;

public class Multiplication67 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("구구단 계산을 위해 숫자를 입력하세요");
		
		int x = input.nextInt();
		
		while (1<=x && x< 10) {
			for(int i=1; i<=9; i++) {
				System.out.println(x*i);
			}
			System.out.println("loop break has been activated");
			break;
		}
		
	}

}
