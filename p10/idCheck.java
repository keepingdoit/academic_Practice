package p10;

public class idCheck {
	String id, pw;
	
	idCheck(String id, String pw){
		this.id = id;
		this.pw = pw;
	}
	
	public void login(idCheck idcheck) {
		if(id.equals("admin")&&pw.equals("1111"))
			System.out.println("�α��μ���");
		else
			System.out.println("�α��ν���");
	}
}
