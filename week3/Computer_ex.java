package week3;
import java.util.Scanner;
public class Computer_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
		while(true) {
			System.out.println("1. ���������\n2. ����ó��\n3. �α���\n4. ����");
			a = sc.nextInt();
			
			if(a==1) {	//������
				Computer ggd = new Computer();
				System.out.println("������");
				ggd.gugudan();
			} else if(a==2) {	//����ó��
				System.out.println("����ó��");
				System.out.println("���� ���� ���� ���� ������ �Է�");
				int kor = sc.nextInt();
				int eng = sc.nextInt();
				int mat = sc.nextInt();
				Computer sung = new Computer(kor, eng, mat);
				sung.sungjuk();
				
			} else if(a==3) {	//�α���
				System.out.println("�α���\n id/pw �Է�");
				String id = sc.next();
				String pw = sc.next();
				Computer idCheck = new Computer(id,pw);
				System.out.println(idCheck.login());
				
			} else {	//����
				System.out.println("�����ϼ̽��ϴ�.");
				break;
			}
			
		}
		
		
		
		
	}

}

