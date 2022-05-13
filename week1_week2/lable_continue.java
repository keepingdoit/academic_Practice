package week1_week2;

public class lable_continue {

	public static void main(String[] args) {
		//Outter 레이블을 써서 break로 중지할 위치를 정할 수 있다.
		Outter : for (char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g')
					break Outter;
			}
		}
		
		//continue를 이용해 홀수를 제외한 짝수만 출력
		for (int i=1; i<=10; i++) {
			if (i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}
		//합계가 40이 넘어가면 그 때의 i값과 sum값만 출력
		int sum=0; 	int j=0;
		for (int i=1; i<=10; i++) {
			if(sum<40) {
				j=i;
				sum+=i;
				continue; //continue를 만나면 스킵하고 처음으로!
			}
			System.out.println(j+"\t"+sum);
		}
	}

}
