package Classs;

import method.Sungjuk;

public class Calc {
	//�ʵ� ����
	String name;
	int kor, eng, mat;
	
	//�żҵ� ����
	public void tot(int kor, int eng, int mat) {
		int tot = kor + eng + mat;
		System.out.println("�հ� : " + tot);
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
		//�żҵ� �ȿ��� �ٸ� �żҵ� ȣ�� ���� �׸��� �����Ͱ��� ������ �ʵ�
		System.out.println("��� 2 : " + avg);
	}
	
}
