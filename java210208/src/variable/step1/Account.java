package variable.step1;		//내가 짠 코드  

public class Account {
	
	// 전역 변수 초기화
	double kor = 0;
	double math = 0;
	double eng = 0;
	
	double Avg(double total, int count) {	// 평균값 계산 및 과목 수
		double avg = total;
		avg = total / count;				// 계산된 평균 값을 avg변수 넣기
		return avg;							// 계산된 평균 값 반환
	}
	
	
	double total(double kor, double math, double eng) {	// 총 점수 구하기
		double total = kor + math + eng;				// total에 국어,수학,영어 점수 더해서 넣기
		return total;									// 계산된 총점수 반환
		
	}
	
	

	public static void main(String[] args) {
		
		Account acc = new Account();		// 인스턴스화
		// 국어, 수학, 영어 점수 초기화
		acc.kor = 90;
		acc.math = 80;
		acc.eng = 70;
		
		double total = 0;		// total : 총 점수
		total = acc.total(acc.kor, acc.math, acc.eng);	// total 메소드의 리턴 값 저장
		System.out.println("총점 : " + total);		// 출력
		
		double avg = 0;			// avg : 평균 점수
		avg = acc.Avg(total, 3);					// avg 메소드의 리턴 값 저장
		System.out.println("평균 : " + avg);			// 출력
		
	}

}
