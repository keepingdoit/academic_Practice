package Classs;
import java.util.Scanner;
public class Login_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id;	String pw;
		
		while(true) {
			System.out.println("id/pw �Է�");
			id = sc.next();
			pw = sc.next();
			Login log = new Login(id, pw);
			String result = log.idCheck();
			System.out.println(result);
			if(result.equals("�α��� ����")) 
				break;
			else
				System.out.println("�ٽ��Է����ּ���");
		}
		
	}

}
