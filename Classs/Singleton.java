package Classs;

public class Singleton {
	//정적필드
	private static Singleton singleton = new Singleton();
	static String name;
	static int eng;
	static int kor;
	static int mat;
	
	private Singleton() { 
	}
	
	static {
		name = "홍길동";
		kor = 41;
		eng = 85;
		mat = 94;
	}
	
	static Singleton get1() {
		return singleton;
	}
	
	static int tot() {
		return kor+eng+mat;
	}
	
	static double avg() {
		int tot = tot();
		return tot/3.0;
	}
}
