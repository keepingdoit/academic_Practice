package week3;

public class Computer {
	
	int kor, eng, mat;
	String id, pw;
	
	Computer() {
	}
	
	public void gugudan() {
		for(int i=0; i<8; i++) {
			System.out.println(i+2+"��");
			for(int j=0; j<9; j++)
				System.out.println((i+2)+"x"+(j+1)+"="+(i+2)*(j+1));
		}
	}
	
	Computer(int kor, int eng, int mat){
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public void sungjuk() {
		int tot = kor+eng+mat;
		double avg = tot/3.0;
		System.out.println("�������� : " + kor);
		System.out.println("�������� : " + eng);
		System.out.println("�������� : " + mat);
		System.out.println("���� : " + tot);
		System.out.println("��� : " + avg);
	}
	
	Computer(String id, String pw){
		this.id = id;
		this.pw = pw;
	}
	
	public String login() {
		if(id.equals("admin")&&pw.equals("1111"))
			return "�α��� ����";
		else
			return "�α��� ����";
	}
	
}
