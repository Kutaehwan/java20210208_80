package variable.step1;

public class Quiz1 {
	
	int x = 3;

	public static void main(String[] args) {
		
		Quiz1 q = new Quiz1();
		q.methodA(5);
		q.methodA(5.0);
		System.out.println(q.x);

	}
	
	private void methodA() {
		System.out.println("methodA 호출 성공");
	}
	
	private void methodA(int x) {
		System.out.println("methodA(int x) 호출 성공 =====>" +x);
	}
	
	private int methodA(double y) {
		System.out.println("methodA 호출 성공");
		return 0;
	}
	

}
