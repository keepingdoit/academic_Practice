package Week4;

public class S2 extends S1 {
	int mat;
	
	S2(String name, int kor, int eng, int mat){
		super(name, kor, eng);
		this.mat = mat;
	}
	
//	void print() {	 //�޼ҵ� ������
//		System.out.println("----����----");
//	}
	
	void tot() {
		super.print();
		System.out.println("���� : " + (kor+eng+mat));
	}
	
	void avg() {
		print();
		System.out.println("��� : " + (kor+eng+mat)/3.0);
	}
}
