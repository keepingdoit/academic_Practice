package week1_week2;

import java.util.Scanner;

public class Array_minmax {
	//5명의 점수를 입력받아 최고점수, 최저점수, 총점, 평균 구하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int jumsu[] = new int[5];
		int sum=0;	int max=0;	int min=1000;
		
		for(int i=0; i<5; i++) {
			System.out.println("jumsu[" + i + "] 입력 :");
			jumsu[i] = sc.nextInt();
			
			if(max<=jumsu[i]) 
				max=jumsu[i];
			
			if(min>=jumsu[i]) 
				min=jumsu[i];
			
			sum+=jumsu[i];
		}
		
		double avg = (double)sum/5;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("최솟값 : " + min);
		System.out.println("최댓값 : " + max);
	}

}
