package Week4;

public class S2 extends S1 {
	int mat;
	
	S2(String name, int kor, int eng, int mat){
		super(name, kor, eng);
		this.mat = mat;
	}
	
//	void print() {	 //메소드 재정의
//		System.out.println("----성적----");
//	}
	
	void tot() {
		super.print();
		System.out.println("총점 : " + (kor+eng+mat));
	}
	
	void avg() {
		print();
		System.out.println("평균 : " + (kor+eng+mat)/3.0);
	}
}
