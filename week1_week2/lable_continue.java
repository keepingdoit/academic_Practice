package week1_week2;

public class lable_continue {

	public static void main(String[] args) {
		//Outter ���̺��� �Ἥ break�� ������ ��ġ�� ���� �� �ִ�.
		Outter : for (char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g')
					break Outter;
			}
		}
		
		//continue�� �̿��� Ȧ���� ������ ¦���� ���
		for (int i=1; i<=10; i++) {
			if (i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}
		//�հ谡 40�� �Ѿ�� �� ���� i���� sum���� ���
		int sum=0; 	int j=0;
		for (int i=1; i<=10; i++) {
			if(sum<40) {
				j=i;
				sum+=i;
				continue; //continue�� ������ ��ŵ�ϰ� ó������!
			}
			System.out.println(j+"\t"+sum);
		}
	}

}
