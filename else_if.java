package TJ;
import java.util.Scanner;
public class else_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("번호를 입력해주세요\n1. 성적계산\t2. 구구단 계산\t3. 아이디체크\t4. 나가기");
		int i = sc.nextInt();
		
		while (true) {
		if (i==1) {
			System.out.println("이름을 입력해주세요");
			String name = sc.next();
			System.out.println("국어 점수 입력");
			int kor = sc.nextInt();
			System.out.println("영어 점수 입력");
			int eng = sc.nextInt();
			System.out.println("수학 점수 입력");
			int mat = sc.nextInt();
			int tot=kor+eng+mat;		int avg=tot/3;
			System.out.println("이름 : " + name);
			System.out.println("국어 점수 : " + kor);
			System.out.println("영어 점수 : " + eng);
			System.out.println("수학 점수 : " + mat);
			System.out.println("총점 : " + tot);
			System.out.println("평균 : " + avg);
		} else if (i==2) {
			System.out.println("단을 입력하세요");
			int dan = sc.nextInt();
			for (int k=1; k<10; k++) 
				System.out.println(dan + "*" + k + "=" + dan*k);
		} else if(i==3) {
			System.out.println("아이디 입력: ");
			String id=sc.next();
			System.out.println("비밀번호 입력 : ");
			String pw=sc.next();
			if (id.equals("admin")&&pw.equals("1234")) {
				System.out.println("로그인성공");
			} else {
				System.out.println("로그인실패");
			}
		} else break;
		i=sc.nextInt();
		}
		
	}

}
