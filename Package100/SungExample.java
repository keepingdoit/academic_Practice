package Package100;
import java.util.Scanner;
public class SungExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id, pw;
		
		String name[] = new String[3];
		int kor[] = new int[3];
		int eng[] = new int[3];
		int mat[] = new int[3];
		
		while(true) {
			System.out.println("1.�����Է�\t2.�������\t3.�հݿ���\t4.���̵�üũ\t5.����");
			int num = sc.nextInt();
			switch(num) {
			case 1 :
				System.out.println("---�����Է�---");
				for(int i=0; i<3; i++) {
					System.out.println("�̸��Է�");
					name[i] = sc.next();
					System.out.println("���������Է�");
					kor[i] = sc.nextInt();
					System.out.println("���������Է�");
					eng[i] = sc.nextInt();
					System.out.println("���������Է�");
					mat[i] = sc.nextInt();
					
					Sung sung = new Sung(name[i], kor[i], eng[i], mat[i]);
				}
				break;
			case 2 :
				System.out.println("---�������---");
				for(int i=0; i<3; i++) {
					System.out.println(sung.)
				}
				
			}
		}
		
		
	}

}
