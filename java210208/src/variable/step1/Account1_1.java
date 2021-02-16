// 2월 9일 총점 및 평균 값 구하기
// 연습용 "save as"
package variable.step1;	//선생님이랑 같이 짠 코드

public class Account1_1 {
	
	double kor = 0;		// 국어점수
	double math = 0;	// 수학점수
	double eng = 0;		// 영어점수
	
	/**********************************************************************************
	 * 
	 * @param kor2 - 학생의 국어 점수
	 * @param math2 - 학생의 수학 점수
	 * @param eng2 - 학생의 영어 점수
	 * @return tot - 한 학생의 세 과목의 총점을 구하여 담는 변수
	 *********************************************************************************/
	
	private double hap(double kor2, double math2, double eng2) {
		double tot = 0;
		tot = kor2 + math2 + eng2;
		return tot;
	}
	
	/****************************************************************************
	 * 
	 * @param tot - hap 메소드를 호출하여 tot를 받아온다.
	 * @param num - 과목 수를 받아온다.
	 * @return
	 *************************************************************************/
	
	private double avg(double tot) {
		// 메소드에서 파라미터를 사용할 떄 배달 사고 이런것들을 주의하기
		System.out.println("파라미터로 넘어온 tot 값 출력해 보기 ====> " + tot);		// 총 점수 값 재 확인
		double avg = 0;
		avg = tot / 3;
		return avg;
	}

	public static void main(String[] args) {
		Account1_1 ac = new Account1_1();
		ac.kor = 70;
		ac.math = 80;
		ac.eng = 90;
		double tot = ac.hap(ac.kor, ac.math, ac.eng);
		
		double test_avg = ac.avg(tot, 3);
		
		System.out.println(tot);
		// System.out.println(avg);
		// 위에서 계산한 총점을 avg메소드의 파라미터로 넘기려면
		// 반드시 리턴타입이 필요하다.

	}
	
	/***********************************************************************
	 * 
	 * @param tot - 총 합을 계산한 값
	 * @param subjectNumber - 과목 수
	 * @return
	********************************************************************/
	
	private double avg(double tot, int subjectNumber) {
		// 0.0.이 찍히면 배달사고가 일어 났다. - 단위 테스트를 통해 확인하고 진행하기
		System.out.println("tot==>" + tot + ", subjectNumber==>" + subjectNumber);
		double imsi = tot / subjectNumber;
		return imsi;
	}


}
