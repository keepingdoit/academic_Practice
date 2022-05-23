package Classs;

public class Cal_ex {

	public static void main(String[] args) {
		Cal C1 = new Cal();
		C1.print();
		
		C1.add=100;
		C1.divide=200;
		C1.print();
		
		System.out.println("합 : " + C1.add1(123, 154));
		
		String odd = C1.odd(10);
		System.out.println("값 : " + C1.su1 + " 결과 : " + odd);
	}

}
