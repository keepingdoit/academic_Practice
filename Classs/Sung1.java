package Classs;

public class Sung1 {
	String name = "ȫ�浿";
	int kor, eng, mat;
	
	//������
	Sung1(int kor, int eng, int mat){
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	
	//�żҵ�
	public void tot() {
		int tot = kor+eng+mat;
		System.out.println("���� : " + tot);
	}
	
	public double avg() {
		return (kor+eng+mat)/3.0;
	}
	
	
}
