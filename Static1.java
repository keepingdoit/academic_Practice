package week3;

public class Static1 {
	//�ν��Ͻ� �ʵ�
	int f1;
	void method1() {};
	
	//����
	static int f2;
	static void method2() {};
	
	//�������
	static {
		f2=10;
		method2();
	}
	//���� �żҵ�
	static void method3() {
		Static1 st1 = new Static1();
		st1.f1 =1;
		st1.method1();
		f2=10;
		method2();
	} //����ƽ �żҵ忡�� �ν��Ͻ�ȭ(��üȭ)�ؾ� �ν��Ͻ� ���� ���� ����
	//����ƽ�� ����ƽ���� Ŭ����.~~�� ��ü���� ����
}
