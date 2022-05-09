package TJ;
import java.util.Scanner;
public class switch_ex {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1 login
		System.out.println("id를 입력하세요");
		String id = sc.next();
		if (id.equals("admin")||id.equals("Admin")) {
			System.out.println("관리자입니다.");
		} else
			System.out.println("비관리자 입니다.");
		
		//2 switch example
		System.out.println("선택 1. 배수출력\t2. 성적처리");
		int num = sc.nextInt();
		switch(num) {
		case 1 : //배수출력
			System.out.println("초기치");
			int a=sc.nextInt();	
			System.out.println("최종치");
			int b=sc.nextInt();
			int sum1=0;		int sum2=0;		int sum3=0;
			for(int i=a; i<=b; i++ ) {
				if (i%2==1) {
					sum1+=i;
				} else {
					sum2+=i;
				}
				if (i%3==0||i%4==0) {
					sum3+=i;
				}
			}
			System.out.println("홀수의 합 : " + sum1);
			System.out.println("짝수의 합 : " + sum2);
			System.out.println("3또는 4의 배수의 합 : " + sum3);
			break;
		case 2 : //성적처리
			System.out.println("국어점수 : ");
			int kor=sc.nextInt();
			System.out.println("영어점수 : ");
			int eng=sc.nextInt();
			String grade;
			int avg = (kor+eng)/2;
			
			if(avg>=60&&kor>=40&&eng>=40) {
				grade="합격";
			} else {
				grade="불합격";
			}
			
			System.out.println("국어점수 : "+ kor);
			System.out.println("영어점수 : " + eng);
			System.out.println("평균 : " + avg);
			System.out.println("합격여부" + grade);
			break;
		}
	}
}

