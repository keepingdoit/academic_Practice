package Classs;

public class sungjuk {
	String name="홍길동";
	int kor, eng, mat;
	
	void print() {
		System.out.println("======================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t");
		System.out.println("======================================================");
	}
	
	public int tot(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		return kor+eng+mat;
	}
	
	public double avg(int kor, int eng, int mat) {
		return (kor+eng+mat)/3.0;
	}
	
	public String grade(double avg) {
		if(avg>60)
			return "합격";
		else
			return "불합격";
	}
}
