package week3;
import java.util.Scanner;
public class Computer_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
		while(true) {
			System.out.println("1. 구구단출력\n2. 성적처리\n3. 로그인\n4. 종료");
			a = sc.nextInt();
			
			if(a==1) {	//구구단
				Computer ggd = new Computer();
				System.out.println("구구단");
				ggd.gugudan();
			} else if(a==2) {	//성적처리
				System.out.println("성적처리");
				System.out.println("국어 영어 수학 점수 순으로 입력");
				int kor = sc.nextInt();
				int eng = sc.nextInt();
				int mat = sc.nextInt();
				Computer sung = new Computer(kor, eng, mat);
				sung.sungjuk();
				
			} else if(a==3) {	//로그인
				System.out.println("로그인\n id/pw 입력");
				String id = sc.next();
				String pw = sc.next();
				Computer idCheck = new Computer(id,pw);
				System.out.println(idCheck.login());
				
			} else {	//종료
				System.out.println("수고하셨습니다.");
				break;
			}
			
		}
		
		
		
		
	}

}

