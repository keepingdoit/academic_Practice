package p2;
import java.util.Scanner;
public class Tax_ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�޿� �Է�");
		int salary = sc.nextInt();
		Tax.setTax(salary);
		int tax = (Tax.getTax() + Tax.getTax2());
		
		System.out.println("���� : " + salary + "��");
		System.out.println("�ҵ漼 : " + Tax.getTax() + "��");
		System.out.println("���漼 : " + Tax.getTax2() + "��");
		System.out.println("�� ���� : " + tax + "��");
		System.out.println("�Ǽ��ɾ� : " + (salary - tax) + "��");
	}

}
