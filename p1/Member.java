package p1;
// 부모 클래스
public class Member {
	String id,pw;
	
	Member(String id, String pw){
		this.id = id;
		this.pw = pw;
	}
	
	void idCheck() {
		if(id.equals("admin")&&pw.equals("1111"))
			System.out.println("로그인성공");
		else
			System.out.println("로그인실패");
	}
}
