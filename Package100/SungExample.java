package Package100;
import java.util.Scanner;
public class SungExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id, pw;
		
		String name[] = new String[3];
		int kor[] = new int[3];
		int eng[] = new int[3];
		int mat[] = new int[3];
		
		while(true) {
			System.out.println("1.점수입력\t2.점수출력\t3.합격여부\t4.아이디체크\t5.종료");
			int num = sc.nextInt();
			switch(num) {
			case 1 :
				System.out.println("---점수입력---");
				for(int i=0; i<3; i++) {
					System.out.println("이름입력");
					name[i] = sc.next();
					System.out.println("국어점수입력");
					kor[i] = sc.nextInt();
					System.out.println("영어점수입력");
					eng[i] = sc.nextInt();
					System.out.println("수학점수입력");
					mat[i] = sc.nextInt();
					
					Sung sung = new Sung(name[i], kor[i], eng[i], mat[i]);
				}
				break;
			case 2 :
				System.out.println("---점수출력---");
				for(int i=0; i<3; i++) {
					System.out.println(sung.)
				}
				
			}
		}
		
		
	}

}
