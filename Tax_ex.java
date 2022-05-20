package p2;
import java.util.Scanner;
public class Tax_ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("급여 입력");
		int salary = sc.nextInt();
		Tax.setTax(salary);
		int tax = (Tax.getTax() + Tax.getTax2());
		
		System.out.println("본봉 : " + salary + "원");
		System.out.println("소득세 : " + Tax.getTax() + "원");
		System.out.println("지방세 : " + Tax.getTax2() + "원");
		System.out.println("총 세금 : " + tax + "원");
		System.out.println("실수령액 : " + (salary - tax) + "원");
	}

}
