import java.util.Scanner;

public class Multiplication45 {

	public static void main(String[] args) {
		/**구구단을 만들어라
		2단부터 9단까지 만들어라 **/
		
		//1st stage: 입력 받을 스캐너 작성
		Scanner reader = new Scanner(System.in);
		
		System.out.println("구구단 프로그램을 실행해 주셔서 감사합니다.\n숫자를 입력하시면 입력값의 구구단 값을 출력합니다.");
		
		int input = reader.nextInt();
		
		//for문 선언으로 숫자 조건에 따라 자동 증갑하게 작동
		for(int i=1; i<=9; i++) {
			System.out.println(input*i);
		
		}

	}
}