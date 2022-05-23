package p20;

public abstract class Sungjuk {
	int kor, eng, mat;
	String id, pw;
	
	Sungjuk(int kor, int eng, int mat, String id, String pw){
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.id = id;
		this.pw = pw;
	}
	
	public abstract void tot();
	
	public double avg() {
		return (kor+eng+mat)/3.0;
	}
	
	public void grade() {
		if(avg()>60 && kor>40 && eng>40 && mat>40)
			System.out.println("합격");
		else
			System.out.println("불합격");
	}
	
	public void idCheck() {
		if(id.equals("admin")&&pw.equals("1234"))
			System.out.println("로그인성공");
		else
			System.out.println("로그인실패");
	}
}
