package week1_week2;

import java.util.Scanner;

public class Array_minmax {
	//5���� ������ �Է¹޾� �ְ�����, ��������, ����, ��� ���ϱ�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int jumsu[] = new int[5];
		int sum=0;	int max=0;	int min=1000;
		
		for(int i=0; i<5; i++) {
			System.out.println("jumsu[" + i + "] �Է� :");
			jumsu[i] = sc.nextInt();
			
			if(max<=jumsu[i]) 
				max=jumsu[i];
			
			if(min>=jumsu[i]) 
				min=jumsu[i];
			
			sum+=jumsu[i];
		}
		
		double avg = (double)sum/5;
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		System.out.println("�ּڰ� : " + min);
		System.out.println("�ִ� : " + max);
	}

}
