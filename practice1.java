package TJ;

import java.util.Scanner;

public class practice1 {
	
	public static void main(String[] args) {
		//4
		Scanner k = new Scanner(System.in);
		System.out.println("점수입력");
		int score = k.nextInt();
		char grade = score > 90 ? 'A' : (score > 80 ? 'B' : 'C'); // 삼항연산자 ? : = if
		System.out.println(score +"점은" + grade + "등급입니다.");
		
		//5
		int value = 356;
		System.out.println(356/100*100);
		
		//6
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop + lengthBottom) * height / 2;
		System.out.println(area);
		
		//7
		int x = 10;
		int y = 5;
		System.out.println(x>7&&y<=5);
		System.out.println(x%3==2 || y%2 !=1);
		
		//8
		double a = 5.0;
		double b = 0.0;
		double z = a%b;
		
		if (Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result = z +10;
			System.out.println("결과 : " + result);
			
		}
		
	}

}
