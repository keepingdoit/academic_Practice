package QZ;
//���赵
public class student {
	//�ʵ弱��
	String name;
	int avg=10;
	double height = 180.0;
	double weight;
	int kor;	int eng;
	
	//������ (������ Ŭ���� �̸��̶� �����ؾ� �Ѵ�.)
	student(int aaa){
		kor = aaa;
	}
	//�⺻ ������ ����
	student(){
		
	}
	
	//�޼ҵ� ����
	void print() {
		System.out.println("Ŭ���� ����");
	}
	int tot() {
		int tot = kor + eng;
		return tot;
	}
}
