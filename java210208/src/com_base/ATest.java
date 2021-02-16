package com_base;

import variable.step1.A;
// public > protected > friendly > private
public class ATest {

	public static void main(String[] args) {
		A a = new A();
		
		System.out.println("영어 : " + a.kor);	// 문제 발생, 다른 class에서는 호출 불가
		
		// 다른 패키지에 있는 메소드를 호출 하려면
		// 호출하려는 패키지에 들어가 변수에 앞에 'public'을 붙여준다. => variable.step1 - A.java - 
		// public double kor = 0; 을 확인해 본다.
	}

}
