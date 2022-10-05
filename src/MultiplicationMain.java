
public class MultiplicationMain {

	public static void main(String[] args) {
		for(int i=2; i<10; i++) {
			int[] result=MultiplicationWithClass.calculate(i);
			MultiplicationWithClass.print(result);
		}

	}

}
