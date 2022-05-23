package week1_week2;
import java.util.Scanner;
public class function_ex {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. 구구단 2. 성적처리 0.종료\n메뉴번호입력 :");
			int i=sc.nextInt();
			
			if (i==1) 
				gugudan();
			
			else if(i==2) {
				String grade = sungjuk();
				System.out.println("합격여부 : " + grade);
			}
			else if(i==0) {
				System.out.println("수고하셨습니다.");
				break;
				
			} else 
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
		}
	}
	public static void gugudan() {
		System.out.println("구구단입니다.");
		for(int x=2; x<=9; x++) {
			System.out.println("----"+x+"단 ----");
			for(int y=1; y<=9; y++)
				System.out.println(x+"x"+y+"="+(x*y));
		}
	}
	
	public static String sungjuk() {
		Scanner sc = new Scanner(System.in);
		System.out.println("성적처리입니다.\n국어 영어 수학점수 순으로 입력해주세요");
		int kor=sc.nextInt();
		int eng=sc.nextInt();
		int mat=sc.nextInt();
		int tot = kor+eng+mat;	int avg=tot/3;
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
		if (avg>=60&&kor>=40&&eng>=40&&mat>=40)
			return "합격";
		else
			return "불합격";
	}
}
		


