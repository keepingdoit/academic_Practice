package TJ;
import java.util.Scanner;
public class overlap_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̵� �Է� : ");
		String id = sc.next();
		System.out.println("��й�ȣ �Է� : ");
		String pw = sc.next();
		
		if(id.equals("admin")) {
			if(pw.equals("1234")) {
				System.out.println("���������� admin���� �α����� �Ǿ����ϴ�.");
			} else {
				System.out.println(pw + "�� �߸��� ��й�ȣ�Դϴ� �ٽ� �õ����ּ���.");
			}
		} else {
			System.out.println(id + "�� �߸��� ������ ���̵��Դϴ� �ٽ� �õ����ּ���.");
		}
	}

}
