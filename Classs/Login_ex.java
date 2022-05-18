package Classs;
import java.util.Scanner;
public class Login_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id;	String pw;
		
		while(true) {
			System.out.println("id/pw 입력");
			id = sc.next();
			pw = sc.next();
			Login log = new Login(id, pw);
			String result = log.idCheck();
			System.out.println(result);
			if(result.equals("로그인 성공")) 
				break;
			else
				System.out.println("다시입력해주세요");
		}
		
	}

}
