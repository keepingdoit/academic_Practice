package p20;
import java.util.Scanner;
public class SungjukExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 영어 수학 점수 아이디 비번");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		String id = sc.next();
		String pw = sc.next();
		Sungjuk2 sung = new Sungjuk2(kor, eng, mat, id, pw);
		sung.tot();
		System.out.println(sung.avg());
		sung.grade();
		sung.idCheck();
		
	}

}
