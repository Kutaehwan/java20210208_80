// 등비수열은 각 항의 앞에 일정한 수를 곱해서 이루어지는 수열을 말합니다. 첫번째 부터 7번째 가지의 수열을 출력하시오.
package M2_D16;

import java.util.Scanner;

public class EqualRatio {

	public static void main(String[] args) {
		
		System.out.println("초기 값은 얼마로 설정 해줄까요? ");
		Scanner scan1 = new Scanner(System.in);
		int num = scan1.nextInt();
		
		System.out.println("얼마씩 곱해줄까요? ");
		Scanner scan2 = new Scanner(System.in);
		int mt = scan2.nextInt();
		
		int sum = num;
		
		System.out.println("1 번쨰 항은 : " + sum);
		
		for (int i=2; i<=7; i++) {
			sum = sum * mt;
			System.out.println(i+" 번쨰 항은 : " + sum);
		}
	}
}
