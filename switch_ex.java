package TJ;
import java.util.Scanner;
public class switch_ex {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1 login
		System.out.println("id�� �Է��ϼ���");
		String id = sc.next();
		if (id.equals("admin")||id.equals("Admin")) {
			System.out.println("�������Դϴ�.");
		} else
			System.out.println("������� �Դϴ�.");
		
		//2 switch example
		System.out.println("���� 1. ������\t2. ����ó��");
		int num = sc.nextInt();
		switch(num) {
		case 1 : //������
			System.out.println("�ʱ�ġ");
			int a=sc.nextInt();	
			System.out.println("����ġ");
			int b=sc.nextInt();
			int sum1=0;		int sum2=0;		int sum3=0;
			for(int i=a; i<=b; i++ ) {
				if (i%2==1) {
					sum1+=i;
				} else {
					sum2+=i;
				}
				if (i%3==0||i%4==0) {
					sum3+=i;
				}
			}
			System.out.println("Ȧ���� �� : " + sum1);
			System.out.println("¦���� �� : " + sum2);
			System.out.println("3�Ǵ� 4�� ����� �� : " + sum3);
			break;
		case 2 : //����ó��
			System.out.println("�������� : ");
			int kor=sc.nextInt();
			System.out.println("�������� : ");
			int eng=sc.nextInt();
			String grade;
			int avg = (kor+eng)/2;
			
			if(avg>=60&&kor>=40&&eng>=40) {
				grade="�հ�";
			} else {
				grade="���հ�";
			}
			
			System.out.println("�������� : "+ kor);
			System.out.println("�������� : " + eng);
			System.out.println("��� : " + avg);
			System.out.println("�հݿ���" + grade);
			break;
		}
	}
}

