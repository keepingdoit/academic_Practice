package Classs;

public class sungjuk {
	String name="ȫ�浿";
	int kor, eng, mat;
	
	void print() {
		System.out.println("======================================================");
		System.out.println("�̸�\t����\t����\t����\t����\t���\t�հݿ���\t");
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
			return "�հ�";
		else
			return "���հ�";
	}
}
