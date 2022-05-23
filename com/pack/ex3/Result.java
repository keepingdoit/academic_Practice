package com.pack.ex3;
import com.pack.ex1.Sungjuk;
import com.pack.ex2.idCheck;
import java.util.Scanner;
public class Result {

	/* 접근 제한자;
	 * public 모든 패키지
	 * default 같은 패키지 (아무것도 선언하지 않은 것)
	 * protected 자식 클래스
	 * private 자신의 클래스
	 */
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		String pw = sc.next();
		Sungjuk sung = new Sungjuk(80, 48);
		idCheck login = new idCheck(id, pw);
		login.getId();
		System.out.println(sung.getTot());
	}

}
