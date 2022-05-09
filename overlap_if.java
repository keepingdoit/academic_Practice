package TJ;
import java.util.Scanner;
public class overlap_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디 입력 : ");
		String id = sc.next();
		System.out.println("비밀번호 입력 : ");
		String pw = sc.next();
		
		if(id.equals("admin")) {
			if(pw.equals("1234")) {
				System.out.println("정상적으로 admin으로 로그인이 되었습니다.");
			} else {
				System.out.println(pw + "는 잘못된 비밀번호입니다 다시 시도해주세요.");
			}
		} else {
			System.out.println(id + "는 잘못된 관리자 아이디입니다 다시 시도해주세요.");
		}
	}

}
