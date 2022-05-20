package p1;

public class Calc_ex {
 //매소드 오버라이딩
	public static void main(String[] args) {
		int r = 10;
		Calc calc = new Calc();
		System.out.println(calc.area1(r));//부모객체
		
		Calc2 calc1 = new Calc2();
		System.out.println(calc1.area1(r));//재정의를 통해 부모객체를 가리고 자식객체 찍어냄
		
	}
}
