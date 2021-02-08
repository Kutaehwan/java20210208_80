package variable.step1;

public class Variable {
	
	void methodA(int x) {
		System.out.println(x);
	}
	
	double methodB(int x) {
		return 3.14;
	}

	public static void main(String[] args) {
		
		System.out.println(5);
		
		System.out.println();
		System.out.println(1+"   "+1);
		
		Variable v = new Variable();
		System.out.println(v.methodB(1));
		v.methodA(1);

	}

}
