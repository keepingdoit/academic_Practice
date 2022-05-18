package Classs;

public class Sung1 {
	String name = "홍길동";
	int kor, eng, mat;
	
	//생성자
	Sung1(int kor, int eng, int mat){
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	
	//매소드
	public void tot() {
		int tot = kor+eng+mat;
		System.out.println("총점 : " + tot);
	}
	
	public double avg() {
		return (kor+eng+mat)/3.0;
	}
	
	
}
