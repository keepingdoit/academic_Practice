package Week4;

public class S1 {
	String name;
	int kor, eng;
	
	S1(String name, int kor, int eng){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	public void print() {
		System.out.println("==========성적처리==========");
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
	}

	
		
	
}
