package QZ;

public class sungjuk {
	//필드 선언
	String name;
	int kor;	int eng;	int mat;
	
	//메소드 선언
	int tot() {
		return (kor + eng + mat);
	}
	//메소드 선언
	double avg() {
		return (kor+eng+mat)/3.0;
	}
}
