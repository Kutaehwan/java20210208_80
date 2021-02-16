package variable.step1;

import com.vo.DeptVO;

public class MethodOverloading {
	/*********************************************************
	 * 
	 * @param pdvo - 조건절에서 사용 될 상수 값을 담는다. - where 들어갈 조건 값으로 사용된다.
	 * @return rdvo - 오라클에서 조회 된 결과는 담는다. - 화면 출력용으로 사용
	 ******************************************************/
	DeptVO go(DeptVO pdvo) {
		System.out.println(pdvo.getDeptno() + ", " + pdvo.getDname() + ", " + pdvo.getLoc());
		DeptVO rdvo = null;
		rdvo = new DeptVO();
		// 오라클 경우한 다음 조회 결과를 받아온 내용을 담는 클래스이다.
		return rdvo;
	}
	// 메소드 이름은 같으나 서로 다른 메소드로 구성된다.
	
	void go() {
		System.out.println("파라미터가 없는 go( ) 호출 성공");
	}
	
	void go (int i) {		// 값에 의한 호출, i에는 메소드가 호출할 때 파라미로 넘어오는 10이 복사된다.
		System.out.println("파라미터가 int 인 go(10) 호출 성공 \n" + "===> " + i);
	}
	
	void go(String name) {
		System.out.println("파라미터가 String 인 go(smith) 호출 성공 \n" + "===> " + name);
	}
	
	public static void main(String[] args) {
		
		MethodOverloading mol = new MethodOverloading();		// 인스턴스화
		
		mol.go();
		mol.go(10);
		mol.go("Smith");	// 참조형 타입이니까 참조에 의한 호출이다. - String만 예외이다. 호출 했을 때 주소번지가 아니라 값이 출력된다는 점에 대해서.....
		
		DeptVO pdvo = new DeptVO();								// DeptVO 인스턴스화
		pdvo.setDeptno(50);			// int
		pdvo.setDname("개발 1팀");		// String
		pdvo.setLoc("제주도");		// String
		
		mol.go(pdvo);				// 주소번지를 넘겼다. 참조에 의한 호출 <==> 값에 의한 호출이다.

	}

}
