package week3;
import java.util.Scanner;
public class Static_ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��Է�");
		Static.name = sc.next();
		System.out.println("�������� �Է�");
		Static.kor = sc.nextInt();
		System.out.println("�������� �Է�");
		Static.eng = sc.nextInt();
		System.out.println("�������� �Է�");
		Static.mat = sc.nextInt();
		
		System.out.println("�̸� : " + Static.name);
		System.out.println("���� : " + Static.tot());
		System.out.println("��� : " + Static.avg());
		Static.grade();
	}
}
