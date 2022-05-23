package Classs;

public class Cal {
	int add = 10;
	int divide = 20;
	int su1;
	
	void print() {
		System.out.println("add : " + add);
		System.out.println("divide : " + divide);
	}
	
	public int add1(int x, int y) {
		return x+y;
	}
	
	public String odd(int su1) {
		this.su1 = su1;
		if(su1%2==0)
			return "Â¦¼ö";
		else
			return "È¦¼ö";
	}
}
