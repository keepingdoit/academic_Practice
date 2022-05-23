package method;

//참조클래스
public class Sungjuk {
	//함수1
	public void gugudan() {
		for (int i=2; i<=9; i++) {
			System.out.println(i+"단");
			for (int j=1; j<=9; j++) {
				System.out.println(i+"x"+j+"="+(i*j));
			}
		}
	}
	//함수2
	public static void print() {
		System.out.println("Test Print");
	}
}
