// 1~10까지 홀수의 합과 짝수의 합을 구하는 프로그램
// 만일 이 작업이 다른 클래스에서도 재사용되어야 한다면 전역변수로 선언한다.
package book.ch4;

public class ForTest1_1 {
	
	public static void main(String[] args) {
		
		int evensum = 0;	// 짝수의 합 저장하는 변수
		int oddsum = 0;		// 홀수의 합 저장하는 변수
		int totalsum = 0;
		int totalsum_cp = 0;
		
		for (int i=0; i<=10; i++) {
			
			if (i % 2 == 0) {	// i로 나눈 나머지가 0하고 같은가?, 짝수인가?
				evensum = evensum + i;	// 짝수면 더해서 sum에 저장해
			}
			
			else {	// 홀수
				oddsum = oddsum + i;
			}
			
			totalsum = evensum + oddsum;	// 1~10까지의 합
		}
		
		for(int i=0; i<11; i++ ) {
			totalsum_cp += i;
			
			if (totalsum == totalsum_cp) {
				System.out.println(totalsum);
			}
		}
		
		System.out.println("짝수의 합 : " + evensum);
		System.out.println("홀수의 합 : " + oddsum);
		System.out.println("====================");
				
	}

}
