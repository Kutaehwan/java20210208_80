/*
 * 0~9까지 숫자중 내가 입력한 값을 찾기
 * 하나의 숫자를 입력하면 up/down으로 맞추기
 * 기회는 총 3번! 
 */
package M2_D17;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("숫자를 입력해주세요.");
		int find = sc.nextInt();	// 찾아야 할 숫자
		System.out.println();
		int count = 0;				// 기회 수 측정
		
		for (int i=0; i<10; i++) {
			int check = rd.nextInt(10);		// 0~9 중 랜덤 숫자
			if (find > check) {				// 랜덤수가 찾을려는 수보다 클 경우
				count++;					// 기회 수 1 증가
				System.out.println(check);
				System.out.println("UP\n");
			}
			else if (find < check) {		// 랜덤수가 찾을려는 수보다 작을 경우
				count++;					// 기회 수 1 증가
				System.out.println(check);
				System.out.println("Down\n");
			}
			else  {							// 정답일 경우
				System.out.println(check);
				System.out.println("정답 : " + find + " = " + check);
				System.out.println("축하합니다. 정답을 맞추셨습니다.");
				return;						// for문을 빠져나옴
			}
			
			if (count == 3) {			// 총 3번 의 기회가 주어지므로 3번동안 못 찾으면 끝
				System.out.println("아쉽게도, " + count + " 번의 기회동안 맞추지 못하였습니다.");
				return;						// for문을 빠져나옴
			}
			
		}///////// end of for

	}///////// end of main

}///////// end of class
