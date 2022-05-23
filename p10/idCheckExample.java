package p10;
import java.util.Scanner;
public class idCheckExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력");
		String id = sc.next();
		System.out.println("비밀번호 입력");
		String pw = sc.next();
		//부모 클래스
		idCheck check = new idCheck(id, pw);
		check.login(check);
		//자식 클래스 매개 변수(클래스변수) 대입해서 부모타입으로 자동 형변환
		idCheck check2 = new idCheck01(id,pw);
		check2.login(check2); // > idCheck check2 = new idCheck(id, pw);
	}

}
