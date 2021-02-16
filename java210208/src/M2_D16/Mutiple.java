// 두 개의 정수 사이에 있는 3의 배수는 몇개일까요?
package M2_D16;

import java.util.Scanner;

public class Mutiple {

	public static void main(String[] args) {
		Mutiple mp = new Mutiple();
		
		System.out.println("어디서 부터 시작 할까요? ");
		Scanner scan1 = new Scanner(System.in);
		int n1 = scan1.nextInt();
		
		System.out.println("어디까지 범위를 지정해 주실래요? ");
		Scanner scan2 = new Scanner(System.in);
		int n2 = scan2.nextInt();
		
		int count = 0;
		
		for (int i=n1; i<n2; i++) {
			if (i % 3 == 0) {
				count++;
			}
		}
		
		if (n1 % 3 == 0) {
			count--;
		}
		
		System.out.println(n1 + "과 " + n2 + " 사이의 3의 배수의 수는 : " + count + " 개 입니다.");
	}

}
