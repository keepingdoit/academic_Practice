package Package100;

public class Sung {
	int kor, eng, mat;
	String name, id, pw;
	
	Sung(String name, int kor, int eng, int mat){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	Sung(String id, String pw){
		this.id = id;
		this.pw = pw;
	}
	
	public int getTot() {
		return kor+eng+mat;
	}
	
	public double avg() {
		return getTot()/3.0;
	}
	
	public String getGrade() {
		String grade = " ";
		if(avg()>60 && kor>40 && eng>40 && mat>40)
			return grade = "�հ�";
		else
			return grade = "���հ�";
	}
	
	public void getIdCheck() {
		if(id.equals("admin")&&pw.equals("1111"))
			System.out.println("�α��� ����");
		else
			System.out.println("�α��� ����");
	}
	
}
