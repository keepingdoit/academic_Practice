package p1;
// �θ� Ŭ����
public class Member {
	String id,pw;
	
	Member(String id, String pw){
		this.id = id;
		this.pw = pw;
	}
	
	void idCheck() {
		if(id.equals("admin")&&pw.equals("1111"))
			System.out.println("�α��μ���");
		else
			System.out.println("�α��ν���");
	}
}
