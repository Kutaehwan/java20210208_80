// 달에서의 나의 몸무게 구하기
package variable.step1;

import java.util.Scanner;

public class ScannerTest1_2 {
	public double moonWeight(double wEarth) {
		// 달에서의 나의 몸무게
		double wMoon = 0.0;
		wMoon = (wEarth*17) / 100;
		return wMoon;
	}

	public static void main(String[] args) {
		
		double wEarth = 0.0;
		
		System.out.println("지구의 몸무게를 입력하세요. ");
		Scanner sc = new Scanner(System.in);
		wEarth = sc.nextDouble();
		
		double wMoon = 0.0;
		ScannerTest1_2 st = new ScannerTest1_2();
		wMoon = st.moonWeight(wEarth);
		System.out.println("지구의 몸무게: " + wEarth + " kg");
		System.out.println("달의 몸무게: " + wMoon + " kg");
	
	}

}
