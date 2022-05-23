package p2;

public class Tax {
	static final double tax = 0.03; //고정값
	static int salary;
	static final double TAX = 0.1; //고정값
	
	static void setTax(int salary) {
		Tax.salary = salary;
	}
	
	static int getTax(){
		return (int) (salary*tax);
	}
	
	static int getTax2() {
		int jtax = (int) (getTax()*TAX);
		return jtax;
	}
	
}
