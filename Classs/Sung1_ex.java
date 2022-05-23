package Classs;
import java.util.Scanner;
public class Sung1_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국 영 수 순으로 점수 입력");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		
		Sung1 sung = new Sung1(kor, eng, mat);
		
		System.out.println("이름 : " + sung.name);
		sung.tot();
		System.out.println("평균 : " + sung.avg());
		
		
		
	}

}
