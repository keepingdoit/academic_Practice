package week3;
import java.util.Scanner;
//fianl은 초기값을 필드에 주면 그 후로는 값을 바꾸지 못한다.
public class Person {
	
	int kor, eng, mat;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수 입력");
		kor = sc.nextInt();
		System.out.println("영어점수 입력");
		eng = sc.nextInt();
		System.out.println("수학점수 입력");
		mat = sc.nextInt();
	}
	
	public void excute() {
		input();
		int tot = tot();
		double avg = avg();
		String result = grade();
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + mat);
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
		System.out.println("합격여부 : " + result);
	}
	
	int tot() {
		return kor+eng+mat;
	}
	
	double avg() {
		int sum = tot();
		return sum/3.0;
	}
	
	String grade() {
		if(avg()>60 && kor>40 && eng>40 && mat>40)
			return "합격";
		else
			return "불합격";
	}
	
}
