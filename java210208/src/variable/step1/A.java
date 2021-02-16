package variable.step1;

public class A {
	// 전역 변수의 경우 초기화를 생략 할 수 있다.
	public double kor = 0;		// 국어점수
	double math = 0;	// 수학점수
	double eng = 0;		// 영어점수
	
	double kor1;		// 국어점수
	double math1;		// 수학점수
	double eng1;		// 영어점수
	
	double kor2 = 70;		// 국어점수
	double math2 = 80;		// 수학점수
	double eng2 = 90;		// 영어점수
	
	void methodA() {
		
		kor = 70;
		math = 80;
		eng = 90;
	}

}
