package M2_D16;

public class Pass {
	
	void doStuff(int x) {
		System.out.println(" doStuff x = " + ++x + " / " + " main x = " + x);
		System.out.println(" doStuff x = " + --x + " / "  + " main x = " + x);
		System.out.println(" doStuff x = " + x++ + " / " + " main x = " + x);
		System.out.println(" doStuff x = " + x-- + " / " + " main x = " + x);
		
	}

	public static void main(String[] args) {
		
		int x = 5;
		Pass p = new Pass();
		p.doStuff(x);
		// System.out.println(" main x = " + x);
		// System.out.println("============================");

	}

}
