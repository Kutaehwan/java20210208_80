package com.vo;

public class DeptVOSimulation {
	
	void methodA() {		// 반환 값이 전혀 역할을 못함.
		
	}
	
	DeptVO methodB() {		// 반환값이 3가지가 가능함
		return new DeptVO();
	}
	
	DeptVO[] methodC() {	// 반환 값이 3가지 종류에 대해서 n개 로우까지도 가능하다.
		return new DeptVO[3];
	}
	
	public static void main(String[] args) {
		
		DeptVO dvo = new DeptVO();
		
		int myDeptno = dvo.getDeptno();		// 0 출력
		// insert here  - 부서번호 30을 출력하도록 코드를 추가하시오.
		String myDname = dvo.getDname();	// null
		String myLoc = dvo.getLoc();		// null
		
		dvo.setDeptno(30);		// 생성자로 처리, API활용
		System.out.println(dvo.getDeptno());
		
		dvo.setDname("영업부");
		System.out.println(dvo.getDname());
		
		dvo.setLoc("서울");
		System.out.println(dvo.getLoc());
		
		dvo = new DeptVO();			// 인스턴스 활성화
		dvo.setDeptno(300);
		System.out.println(dvo.getDeptno());
		
	}

}
