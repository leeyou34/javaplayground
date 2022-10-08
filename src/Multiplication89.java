import java.util.Scanner;

public class Multiplication89 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("구구단 계산을 위해 숫자를 입력하세요");
		
		int x = input.nextInt();
			if (x <2) {
				System.out.println("please put the numerical value above 2");
			} else if(x>10) {
				System.out.println("please put the numerical value below 10");
			} else {
				for(int i=1; i<10; i++) {
					System.out.println(x+"*"+i+"="+x*i);
				}
			}
		input.close();
		}

}

