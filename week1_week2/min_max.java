package week1_week2;

public class min_max {

	public static void main(String[] args) {
		/*
		 * ���ڿ� ���ÿ���
		 */
		String a = " ";
		for(int b=0; b<5; b++) {
			a +='*';
			System.out.println(a);
		}
		
		/*
		 *�ִ񰪰� �ּڰ� ���ϴ� ���� 
		 */
		int min=50;	int max=0;	//min�� ������ ��
		for(int i=1; i<=100; i++) {
			//�ִ� ���ϴ� if
			if (i>=max) 
				max=i;
			//�ּڰ� ���ϴ� if
			if (i<=min) 
				min=i;
		}
		System.out.println(max);
		System.out.println(min);
	}

}
