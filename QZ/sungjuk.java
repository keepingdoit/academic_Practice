package QZ;

public class sungjuk {
	//�ʵ� ����
	String name;
	int kor;	int eng;	int mat;
	
	//�޼ҵ� ����
	int tot() {
		return (kor + eng + mat);
	}
	//�޼ҵ� ����
	double avg() {
		return (kor+eng+mat)/3.0;
	}
}
