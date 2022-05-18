package week3;
import java.util.Scanner;
public class Grade_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 영어 순서대로 입력");
		
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int tot = kor + eng;
		int avg = tot/2;
		Grade grade = null;
		
		switch(avg/10) {
		case 10:
		case 9: grade = Grade.A; break;
		case 8: grade = Grade.B; break;
		case 7: grade = Grade.C; break;
		case 6: grade = Grade.D; break;
		default: grade = Grade.F; break;
		}
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(tot);
		System.out.println(avg);
		System.out.println(grade);

	}

}
