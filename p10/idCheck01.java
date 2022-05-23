package p10;

public class idCheck01 extends idCheck{
	
	//부모 생성자 정의
	idCheck01(String id, String pw){
		super(id, pw);
	}
	
	//매소드 재정의
	public void login(idCheck idcheck) {
		if(id.equals("admin")&&pw.equals("1234"))
			System.out.println("로그인성공");
		else
			System.out.println("로그인실패");
	}
	
}
