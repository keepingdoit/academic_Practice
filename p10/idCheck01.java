package p10;

public class idCheck01 extends idCheck{
	
	//�θ� ������ ����
	idCheck01(String id, String pw){
		super(id, pw);
	}
	
	//�żҵ� ������
	public void login(idCheck idcheck) {
		if(id.equals("admin")&&pw.equals("1234"))
			System.out.println("�α��μ���");
		else
			System.out.println("�α��ν���");
	}
	
}
