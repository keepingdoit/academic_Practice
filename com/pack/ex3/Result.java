package com.pack.ex3;
import com.pack.ex1.Sungjuk;
import com.pack.ex2.idCheck;
import java.util.Scanner;
public class Result {

	/* ���� ������;
	 * public ��� ��Ű��
	 * default ���� ��Ű�� (�ƹ��͵� �������� ���� ��)
	 * protected �ڽ� Ŭ����
	 * private �ڽ��� Ŭ����
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
