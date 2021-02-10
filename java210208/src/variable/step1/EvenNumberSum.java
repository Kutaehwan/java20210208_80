package variable.step1;

public class EvenNumberSum {

	public static void main(String[] args) {
		
		int i, sum = 0;
		
		for (i=1; i<11; i++) {
			if (i % 2 != 0) {
				continue;
			}
			sum = sum + i;
		}
		
		System.out.println("짝수의 합은 : " + sum);

	}

}
