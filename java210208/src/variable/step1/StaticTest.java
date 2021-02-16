package variable.step1;
// static 쓰임 - Integer.parseInt();
// Integer는 클래스가 갖고 있는 타입 중 하나이다.

public class StaticTest {
	
	/*
	 * non-static타입은 static영역에서 접근 불가, 호출 안 된다. 
	 */
	
	static void avg() {	// 사용자 정의 메소드
		System.out.println("avg호출 성공");
	}

	public static void main(String[] args) {
//		if(args[]==null | args.length > 0) {
		// String args[] = new String[3];
		// args[0] = null;
		// args[1] = null;
		// args[2] = null;
		// args.length - NullPointerException 이 발생 할 수도 있다.
			if (args.length == 0) {	//args 주소번지를 가지고 방의 갯수를 비교한다. 배열의 길이
				// 아래 문장은 조건에 따라 한 번도 실행 기회를 못 가질수 있다.
				System.out.println("입력해주세요.");
				return;		//main 메소드 탈출하기, 아래 소스코드는 실행 x
			}
			
		System.out.println(args[0]+10);		// 20이 출력되도록 코드를 수정하시오.
		int imsi = Integer.parseInt(args[0]);
		System.out.println(imsi+10);					// int + int = int
		System.out.println("=========> " + imsi + 10);	// string + int = String, "=========>" : string
		// 주소 번지 없이도 호출 할 수 있는 메소드가 있다. 메소드 이름 앞에 static이 있다면.......
		
		// main메소드는 자바가 제공하는 메소드이다? => Yes
		// 사용자 정의 메소드도 가능하다.
		// 내가 필요한 메소드는 문자열(파라미터)을 집어 넣으면 int 타입으로 변환하여 반환(리턴)해주는 메소드가 필요하다.
		// parseInt()이다.
		// 네이버나 구글링을 해서 위 요구사항을 만족하는 코드를 작성해 보시오.
		StaticTest.avg();
		

	}/////////////////// end of main

}////////////////////// end of class
