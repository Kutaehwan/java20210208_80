// 1~10까지 홀수의 합과 짝수의 합을 구하는 프로그램
// 만일 이 작업이 다른 클래스에서도 재사용되어야 한다면 전역변수로 선언한다.
package book.ch4;

public class ForTest {
	
	public static void main(String[] args) {
		
		int evensum = 0;	// 짝수의 합 저장하는 변수
		int oddsum = 0;		// 홀수의 합 저장하는 변수
		
		for (int i=0; i<=10; i++) {
			
			if (i % 2 == 0) {	// i로 나눈 나머지가 0하고 같은가?, 짝수인가?
				evensum = evensum + i;	// 짝수면 더해서 sum에 저장해
			}
			
			else {	// 홀수
				oddsum = oddsum + i;
			}
		}
		
		System.out.println("짝수의 합 : " + evensum);
		System.out.println("홀수의 합 : " + oddsum);
		System.out.println("====================");
		
		//////////////////////////////////////////////////////////////////////////////
		
		evensum = 0;
		oddsum = 0;
		for (int a=0; a<11; a++) {
			if (a % 2 == 0) {	// 
				evensum = evensum + a;	
				System.out.print(evensum + " ");
			}
		}
		System.out.println("\n짝수의 합 : " + evensum);
		
		for (int a=0; a<11; a++) {
			if (a % 2 != 0) {	// 
				oddsum = oddsum + a;	
				System.out.print(oddsum + " ");
			}
		}
		System.out.println("\n홀수의 합 : " + oddsum);
		
	}

}
