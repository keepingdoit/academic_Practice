package week1_week2;
import java.util.Scanner;
public class function_ex {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. ������ 2. ����ó�� 0.����\n�޴���ȣ�Է� :");
			int i=sc.nextInt();
			
			if (i==1) 
				gugudan();
			
			else if(i==2) {
				String grade = sungjuk();
				System.out.println("�հݿ��� : " + grade);
			}
			else if(i==0) {
				System.out.println("�����ϼ̽��ϴ�.");
				break;
				
			} else 
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
		}
	}
	public static void gugudan() {
		System.out.println("�������Դϴ�.");
		for(int x=2; x<=9; x++) {
			System.out.println("----"+x+"�� ----");
			for(int y=1; y<=9; y++)
				System.out.println(x+"x"+y+"="+(x*y));
		}
	}
	
	public static String sungjuk() {
		Scanner sc = new Scanner(System.in);
		System.out.println("����ó���Դϴ�.\n���� ���� �������� ������ �Է����ּ���");
		int kor=sc.nextInt();
		int eng=sc.nextInt();
		int mat=sc.nextInt();
		int tot = kor+eng+mat;	int avg=tot/3;
		System.out.println("���� : " + tot);
		System.out.println("��� : " + avg);
		if (avg>=60&&kor>=40&&eng>=40&&mat>=40)
			return "�հ�";
		else
			return "���հ�";
	}
}
		


