package M2_D16;
/*
 * ++i 는 i = i + 1;
 * --i 는 i = i -1;
 * i++ 는 후위 연산자 이므로 먼저 비교하고 나중에 1을 증가시킴
 * ++i 는 전위 연산자이다.
 */

public class Exam1 {

	public static void main(String[] args) {
		
		int i = 1;
		int j = 2;
		
		// A & B = A 가 false 여도 B 를 검사한다.
		// 2 > 2(F) && 3 > 1 (T) = F
		if( (++i > j--) & (++i > j) ) {
			
		}
		else {
			System.out.println(i + ", " + j);		// 3 1
		}
		
		// 변수 초기화가 있을 때와 없을 때 차이가 있나?
		//i = 1;
		//j = 2;
		
		// A && B = A가 false면 B는 검사하지 않는다.
		// 4 > 1 (F) && 5 > 0
		if( (++i > j--) && (++i > j) ) {
			System.out.println(i + ", " + j);		// 5 0
		}
		else {
			System.out.println(i + ", " + j);
		}
		
	}

}
