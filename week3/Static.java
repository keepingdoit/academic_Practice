package week3;

public class Static {
	static String name;
	static int kor, eng, mat;
	
	static int tot() {
		return kor+eng+mat;
	}
	
	static double avg() {
		return (kor+eng+mat)/3.0; //메인 매소드에 값을 줄 수 있는 리턴
	}
	
	static void grade() { //메인 메소드에 값을 줄 수 없고 grade매소드 자체만을 실행하고 꺼짐
		double avg1 = avg();
		if((avg1>60) && (kor>40) && (eng>40) && (mat>40))
			System.out.println("합격");
		else
			System.out.println("불합격");
	}
}
