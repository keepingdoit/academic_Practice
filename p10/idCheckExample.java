package p10;
import java.util.Scanner;
public class idCheckExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� �Է�");
		String id = sc.next();
		System.out.println("��й�ȣ �Է�");
		String pw = sc.next();
		//�θ� Ŭ����
		idCheck check = new idCheck(id, pw);
		check.login(check);
		//�ڽ� Ŭ���� �Ű� ����(Ŭ��������) �����ؼ� �θ�Ÿ������ �ڵ� ����ȯ
		idCheck check2 = new idCheck01(id,pw);
		check2.login(check2); // > idCheck check2 = new idCheck(id, pw);
	}

}
