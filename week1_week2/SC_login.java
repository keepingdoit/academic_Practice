package week1_week2;
import java.util.Scanner;
public class SC_login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id;	String pw;
		System.out.println("���̵� �Է� : ");
		id = sc.next();
		System.out.println("��й�ȣ �Է� : ");
		pw = sc.next();
		while(true) {
		if (id.equals("admin")&&pw.equals("1111")) { 
// id = "admin" && pw = "1111"�� ������ �����񱳸� �ϱ⶧���� ���� �ʴٸ� ��µȴ�
			System.out.println("�α��� ����");
			break;
		} else {
			System.out.println("�α��� ����");
			System.out.println("���̵� ���Է� : ");
			id = sc.next();
			System.out.println("��й�ȣ ���Է� : ");
			pw = sc.next();
		}
		}
		
		}
	}


