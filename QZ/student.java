package QZ;
//설계도
public class student {
	//필드선언
	String name;
	int avg=10;
	double height = 180.0;
	double weight;
	int kor;	int eng;
	
	//생성자 (무조건 클래스 이름이랑 동일해야 한다.)
	student(int aaa){
		kor = aaa;
	}
	//기본 생성자 선언
	student(){
		
	}
	
	//메소드 선언
	void print() {
		System.out.println("클래스 연습");
	}
	int tot() {
		int tot = kor + eng;
		return tot;
	}
}
