package TJ;
import java.util.Scanner;
public class else_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��ȣ�� �Է����ּ���\n1. �������\t2. ������ ���\t3. ���̵�üũ\t4. ������");
		int i = sc.nextInt();
		
		while (true) {
		if (i==1) {
			System.out.println("�̸��� �Է����ּ���");
			String name = sc.next();
			System.out.println("���� ���� �Է�");
			int kor = sc.nextInt();
			System.out.println("���� ���� �Է�");
			int eng = sc.nextInt();
			System.out.println("���� ���� �Է�");
			int mat = sc.nextInt();
			int tot=kor+eng+mat;		int avg=tot/3;
			System.out.println("�̸� : " + name);
			System.out.println("���� ���� : " + kor);
			System.out.println("���� ���� : " + eng);
			System.out.println("���� ���� : " + mat);
			System.out.println("���� : " + tot);
			System.out.println("��� : " + avg);
		} else if (i==2) {
			System.out.println("���� �Է��ϼ���");
			int dan = sc.nextInt();
			for (int k=1; k<10; k++) 
				System.out.println(dan + "*" + k + "=" + dan*k);
		} else if(i==3) {
			System.out.println("���̵� �Է�: ");
			String id=sc.next();
			System.out.println("��й�ȣ �Է� : ");
			String pw=sc.next();
			if (id.equals("admin")&&pw.equals("1234")) {
				System.out.println("�α��μ���");
			} else {
				System.out.println("�α��ν���");
			}
		} else break;
		i=sc.nextInt();
		}
		
	}

}
