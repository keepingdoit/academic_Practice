package Classs;

public class Login {
	String id;	String pw;
	
	Login(String id, String pw){
		this.id = id;
		this.pw = pw;
	}
	
	public String idCheck() {
		
		if(id.equals("admin")&&pw.equals("1111"))
			return "�α��� ����";
		else
			return "�α��� ����";
	}
}
