package TJ;
import java.util.Scanner;
public class SC_login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id;	String pw;
		System.out.println("아이디 입력 : ");
		id = sc.next();
		System.out.println("비밀번호 입력 : ");
		pw = sc.next();
		while(true) {
		if (id.equals("admin")&&pw.equals("1111")) { 
// id = "admin" && pw = "1111"로 넣으면 번지비교를 하기때문에 같지 않다만 출력된다
			System.out.println("로그인 성공");
			break;
		} else {
			System.out.println("로그인 실패");
			System.out.println("아이디 재입력 : ");
			id = sc.next();
			System.out.println("비밀번호 재입력 : ");
			pw = sc.next();
		}
		}
		
		}
	}


