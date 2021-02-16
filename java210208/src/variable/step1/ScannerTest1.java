package variable.step1;

import java.util.Scanner;

public class ScannerTest1 {
	
	double m_weight(double weight) {
		weight = weight * 0.17;
		return weight;
	}

	public static void main(String[] args) {
		
		System.out.println("당신의 몸무게를 입력하세요. ");
		Scanner scan = new Scanner(System.in);
		
		double weight = scan.nextInt();
		
		ScannerTest1 st = new ScannerTest1();
		double m_weight = st.m_weight(100);
		
		System.out.println("달에서의 당신 몸무게는 : " + m_weight + "kg 입니다.");
		
	}

}
