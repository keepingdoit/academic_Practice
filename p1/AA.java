package p1;
//getter setter
public class AA {
	String name;
	int num1, num2;
	int num3;
	private int num4;
	
	public AA() {}
	
	public AA(String name, int num1, int num2) {
		this.name = name;
		this.num1 = num1;
		this.num2 = num2;
	}
	
	AA(int num3, int num4){
		this.num3 = num3;
		this.num4 = num4;
	}
	
	public void getCalc() {
		System.out.println("두 수의 합 : " + (num1 + num2));
		System.out.println("두 수의 차 : " + (num1 - num2));
		System.out.println("두 수의 곱 : " + (num1 * num2));
		System.out.println("두 수의 나누기 : " + ((double)num1 / num2));
	}
	
	boolean getEven() {
		boolean boo;
		if(num3%2==0)
			boo=true;
		else
			boo=false;
		return boo;
	}
	
	public int getNum(int num) {
		return this.num4 = num;
	}
}
