package week3;
import java.util.Scanner;
public class Static_ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름입력");
		Static.name = sc.next();
		System.out.println("국어점수 입력");
		Static.kor = sc.nextInt();
		System.out.println("영어점수 입력");
		Static.eng = sc.nextInt();
		System.out.println("수학점수 입력");
		Static.mat = sc.nextInt();
		
		System.out.println("이름 : " + Static.name);
		System.out.println("총점 : " + Static.tot());
		System.out.println("평균 : " + Static.avg());
		Static.grade();
	}
}
