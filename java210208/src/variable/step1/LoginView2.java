package variable.step1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LoginView2 extends JFrame implements ActionListener{
	// java.lang에 있는 패키지가 아니므로 별도로 import해야 한다.
	JButton jbtn_login = new JButton("로그인");
	
	// 화면 그리기 구형
	public void initDisplay() {
		this.setTitle("네이버 로그인");
		this.setSize(500, 400);
		this.setVisible(true);		// true이면 활성화. false이면 비활성화
		this.add("North", jbtn_login);
		// 내 자신이 이벤트 처리를 담당하는 핸들러 클래스이다. 라는 의미로 this를 사용하기도 한다.
		jbtn_login.addActionListener(this); 		// 이벤트 소스와 이벤트 처리를 담당하는 클래스 연결, 매칭 - call back 함수 호출
		
	}
	
	// 내 안에 있는 메소드 이지만 static영역 안에서 non-static을 접근할 수 없으므로 인스턴스화를 해서 해결한다.

	public static void main(String[] args) {
		LoginView2 view = new LoginView2();
		view.initDisplay();
	
	}

	@Override	// 부모 클래스를 재 정의
	public void actionPerformed(ActionEvent e) {	// call back 메소드라고 한다. 내가 호출하는 메소드가 아니라 이벤트 감지가 일어나면 자동 호출된다.
		// 만약 로그인 버튼을 누르면??
		if(jbtn_login == e.getSource()) {		// 이벤트 감지는 컴터가 하고 버튼의 주소번지는 내가 정의한다. 주소번지가 같니?
			System.out.println("로그인 성공.");
		}
		
	}

}
