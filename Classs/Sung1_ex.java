package Classs;
import java.util.Scanner;
public class Sung1_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �� �� ������ ���� �Է�");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		
		Sung1 sung = new Sung1(kor, eng, mat);
		
		System.out.println("�̸� : " + sung.name);
		sung.tot();
		System.out.println("��� : " + sung.avg());
		
		
		
	}

}
