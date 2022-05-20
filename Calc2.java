package p1;

public class Calc2 extends Calc {

	double area1(double r) {
		System.out.println("자식객체 area1 실행");
		return Math.PI*r*r;
	}
}
