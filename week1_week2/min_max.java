package week1_week2;

public class min_max {

	public static void main(String[] args) {
		/*
		 * 문자열 스택연산
		 */
		String a = " ";
		for(int b=0; b<5; b++) {
			a +='*';
			System.out.println(a);
		}
		
		/*
		 *최댓값과 최솟값 구하는 로직 
		 */
		int min=50;	int max=0;	//min은 임의의 수
		for(int i=1; i<=100; i++) {
			//최댓값 구하는 if
			if (i>=max) 
				max=i;
			//최솟값 구하는 if
			if (i<=min) 
				min=i;
		}
		System.out.println(max);
		System.out.println(min);
	}

}
