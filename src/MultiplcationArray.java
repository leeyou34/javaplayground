
public class MultiplcationArray {
	public static void main(String []args){
		// arraay has been used twice.
		int[] result = new int[9];
		for(int i=2; i<result.length; i++) {
			for(int j=1; j<result.length; j++) {
				System.out.println(j+"*"+i+"="+j*i);
			}
		}
	}
}