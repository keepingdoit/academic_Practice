package p1;

public class A {
	//�ʵ�
	public int f1; //��� ������ ��� ���� �������� ���ȼ� �϶�
	int f2 ;//default > ���� ��Ű������ ������ ���� ����
	private int f3; // private > ���� Ŭ���� �������� ������ ���� ����
	
	//�޼ҵ�
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
