package TJpractice;

import java.util.Scanner;

public class calcurate {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String error = " ";
		System.out.println("1. +\t2. -\t3. *\t4. /\t5. exit");
		int i=sc.nextInt();
		
		while (i<0 || i>=0) {
			cal(i);
			if (i==5) {
				error = "�����ϼ̽��ϴ�!";
				System.out.println(error);
				break;
			}
			else {
				error = "�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���!";
				System.out.println(error);
			}
			i=sc.nextInt();
		}
	}
	
	
	
	public static void cal(int i){
		Scanner sc = new Scanner(System.in);
		int a;	int b;
			while(0<i && i<=4) {
				if(i==1) {
					System.out.println("���� �� ���ڸ� �Է����ּ���");
					a = sc.nextInt();
					b = sc.nextInt();
					int add = a+b;
					System.out.println("��� : " + add);
				}
				if(i==2) {
					System.out.println("�� �� ���ڸ� �Է����ּ���");
					a = sc.nextInt();
					b = sc.nextInt();
					int sub = a-b;
					System.out.println("��� : " + sub);
				}
				if(i==3) {
					System.out.println("���� �� ���ڸ� �Է����ּ���");
					a = sc.nextInt();
					b = sc.nextInt();
					int gup = a*b;
					System.out.println("��� : " + gup);
				}
				if(i==4) {
					System.out.println("���� �� ���ڸ� �Է����ּ���");
					a = sc.nextInt();
					b = sc.nextInt();
					double div = (double)a/b;
					System.out.println("��� : " + div);
				}
				System.out.println("���\n1. +\t2. -\t3. *\t4. /\t5. exit");
				i = sc.nextInt();
			}
	}

}
