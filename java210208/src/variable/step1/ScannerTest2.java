package variable.step1;

import java.util.Scanner;

public class ScannerTest2 {
	
	double addsum(double n) {
		int sum = 0;
		for (int i=0; i<=n; i++) {
			sum = sum + i;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("어디까지 더하실 겁니까? ");
		Scanner scan = new Scanner(System.in);
		double n = scan.nextInt();
		
		ScannerTest2 sum = new ScannerTest2();
		
		while(n <= 0) {
			System.out.println("다시 입력해 주세요.");
			n = scan.nextInt();
		}
		
		System.out.println("총 합은 : " + sum.addsum(n));
		
	}

}
