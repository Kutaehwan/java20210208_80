// Param.java 와 짝궁
package M2_D16;

public class ParamTest {
	
	void effectParam(Param p) {
		// insert here일 때는 얼마가 출력되는 것일까요?
		p = new Param();		// 인스턴스 활성화
		System.out.println(p.ival);
		
		p.ival = 500;
		System.out.println("sub ival\n" + p.ival);
	}

	public static void main(String[] args) {
		// 클래스는 반드시 대문자 
		ParamTest pt = new ParamTest();
		Param p = new Param();
		
		p.ival = 100;
		pt.effectParam(p);
		//p.ival = 100;
		System.out.println("\nmain ival\n" + p.ival);

	}

}
