package Week4;
import java.util.Scanner;
public class S_example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸� ���� ���� ���� �Է�");
		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		S2 s = new S2(name, kor, eng, mat);
		s.print(); //��ӹ��� �żҵ�
		s.tot();
		s.avg();
	}

}
