package Classs;

public class Calc_example {
	public static void main(String[] args) {
		Calc c1 = new Calc(); //static�� ������ ��üȭ
		// c1�� �������� = Ŭ��������
		
		c1.tot(80, 70, 90);
		double avg1 = c1.avg1(80, 70, 90);
		System.out.println("��� 1 : " + avg1);
		c1.avg2();
	}
}
