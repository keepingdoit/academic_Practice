package method;

//����Ŭ����
public class Sungjuk {
	//�Լ�1
	public void gugudan() {
		for (int i=2; i<=9; i++) {
			System.out.println(i+"��");
			for (int j=1; j<=9; j++) {
				System.out.println(i+"x"+j+"="+(i*j));
			}
		}
	}
	//�Լ�2
	public static void print() {
		System.out.println("Test Print");
	}
}
