// 2월 9일
// if문과 for문 사용
package variable.step1;

public class MainMethod {
/***************************************
 * 
 * @param args - 파라미터의 타입은 배열입니다.
 * String args[] = new String[3];	// 원래 생긴 모양
 * main메소드는 특별한 경우라서 따로 설명하기
 * 학습 목표 
 * main메소드에 대해서 설명
 * <구경>
 **************************************/
	public static void main(String[] args) {
		// 만일 숫자라면 20을 출력
		// 만일 문자라면 1010을 출력
		// int + int = int
		// int + String = 붙여쓰기이다.
		System.out.println(args[0]+10);
		// 타입이 뭔가?
		// 타입을 체크할 수 있는 연산자(instanceof)가 있다.
		// 왜냐하면 자바는 컴파일 할 때 타입을 따지니까......
		if(args[0] instanceof String) {	//instanceof 연산자 : 타입을 물어본다.
			System.out.println("나는 문자열이야.");
		}
		else {
			System.out.println("나는 문자열이 아니야.");
		}///////////// end of if
		
		if(true) {	// else를 실행 경우는 없다.why? => 상수니까
			System.out.println("나는 참 입니다.");
		}
		else {
			System.out.println("나는 거짓 입니다.");
		}//////////// end of if
		
		for (int i=0; i<2; i=i+1) {
			if(true) {
				System.out.println("나는 참 입니다.");
			}
		} ///////////// end of for
		
	}//////////////// end of main

}///////////// end of class
