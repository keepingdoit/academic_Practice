package p1;

public class A {
	//필드
	public int f1; //모든 곳에서 사용 가능 편하지만 보안성 하락
	int f2 ;//default > 같은 패키지에만 생성자 접근 가능
	private int f3; // private > 같은 클래스 내에서만 생성자 접근 가능
	
	//메소드
	public void method1() {}
	void method2() {}
	private void method3() {}
	
	public A(){
		f1=1;
		f2=1;
		setF3(1);
		
		method1();
		method2();
		method3();
	}
	public int getF3() {
		return f3;
	}
	public void setF3(int f3) {
		this.f3 = f3;
	}
}
