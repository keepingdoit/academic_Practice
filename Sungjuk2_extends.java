package p1;

public class Sungjuk2_extends extends Sungjuk_extends {
	double avg;
	
	Sungjuk2_extends(String name, int kor, int mat){
		this.name = name;
		this.kor = kor;
		this.mat = mat;
	}
	
	void avg() {
		avg=(kor+mat)/3.0;
		System.out.println("ЦђБе : " + avg);
	}
}
