package p20;

public class Sungjuk2 extends Sungjuk{
	
	Sungjuk2(int kor, int eng, int mat, String id, String pw){
		super(kor, eng, mat, id, pw);
		
	}

	public void tot() {
		int tot = kor+eng+mat;
		System.out.println("รัมก : " + tot);
	}
	
}
