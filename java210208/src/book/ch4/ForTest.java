package book.ch4;

public class ForTest {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i=0; i<11; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("짝수의 합 : " + sum);

	}

}
