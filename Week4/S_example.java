package Week4;
import java.util.Scanner;
public class S_example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 국어 영어 수학 입력");
		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		S2 s = new S2(name, kor, eng, mat);
		s.print(); //상속받은 매소드
		s.tot();
		s.avg();
	}

}
