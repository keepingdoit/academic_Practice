package week3;
import java.util.Scanner;
//fianl�� �ʱⰪ�� �ʵ忡 �ָ� �� �ķδ� ���� �ٲ��� ���Ѵ�.
public class Person {
	
	int kor, eng, mat;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �Է�");
		kor = sc.nextInt();
		System.out.println("�������� �Է�");
		eng = sc.nextInt();
		System.out.println("�������� �Է�");
		mat = sc.nextInt();
	}
	
	public void excute() {
		input();
		int tot = tot();
		double avg = avg();
		String result = grade();
		System.out.println("�������� : " + kor);
		System.out.println("�������� : " + eng);
		System.out.println("�������� : " + mat);
		System.out.println("���� : " + tot);
		System.out.println("��� : " + avg);
		System.out.println("�հݿ��� : " + result);
	}
	
	int tot() {
		return kor+eng+mat;
	}
	
	double avg() {
		int sum = tot();
		return sum/3.0;
	}
	
	String grade() {
		if(avg()>60 && kor>40 && eng>40 && mat>40)
			return "�հ�";
		else
			return "���հ�";
	}
	
}
