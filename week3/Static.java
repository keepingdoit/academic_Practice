package week3;

public class Static {
	static String name;
	static int kor, eng, mat;
	
	static int tot() {
		return kor+eng+mat;
	}
	
	static double avg() {
		return (kor+eng+mat)/3.0; //���� �żҵ忡 ���� �� �� �ִ� ����
	}
	
	static void grade() { //���� �޼ҵ忡 ���� �� �� ���� grade�żҵ� ��ü���� �����ϰ� ����
		double avg1 = avg();
		if((avg1>60) && (kor>40) && (eng>40) && (mat>40))
			System.out.println("�հ�");
		else
			System.out.println("���հ�");
	}
}
