package Classs;

import method.Sungjuk;

public class Calc {
	//필드 선언
	String name;
	int kor, eng, mat;
	
	//매소드 선언
	public void tot(int kor, int eng, int mat) {
		int tot = kor + eng + mat;
		System.out.println("합계 : " + tot);
	}
	
	public double avg1(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		double avg = (this.kor+this.eng+this.mat)/3.0;
		return avg;
	}
	
	public void avg2() {
		double avg = this.avg1(kor, eng, mat); 
		//매소드 안에서 다른 매소드 호출 가능 그리고 데이터값이 없으니 필드
		System.out.println("평균 2 : " + avg);
	}
	
}
