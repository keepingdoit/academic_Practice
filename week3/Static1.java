package week3;

public class Static1 {
	//인스턴스 필드
	int f1;
	void method1() {};
	
	//정적
	static int f2;
	static void method2() {};
	
	//정적블록
	static {
		f2=10;
		method2();
	}
	//정적 매소드
	static void method3() {
		Static1 st1 = new Static1();
		st1.f1 =1;
		st1.method1();
		f2=10;
		method2();
	} //스태틱 매소드에선 인스턴스화(객체화)해야 인스턴스 팀에 접근 가능
	//스태틱은 스태틱끼리 클래스.~~로 객체지향 가능
}
