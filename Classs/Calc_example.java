package Classs;

public class Calc_example {
	public static void main(String[] args) {
		Calc c1 = new Calc(); //static이 없으니 객체화
		// c1은 참조변수 = 클래스변수
		
		c1.tot(80, 70, 90);
		double avg1 = c1.avg1(80, 70, 90);
		System.out.println("평균 1 : " + avg1);
		c1.avg2();
	}
}
