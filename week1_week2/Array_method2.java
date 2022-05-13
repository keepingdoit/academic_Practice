package week1_week2;
import java.util.Scanner;
public class Array_method2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int jumsu[]=new int[5];
		
		for(int i=0;i<5;i++) { 
			jumsu[i] = sc.nextInt();
		}
		int tot = tot(jumsu); //입력된 값은 배열 명만 주어도 된다.
		System.out.println(tot);
	}
	
	public static int tot(int[] jumsu) {
		int tot=0;
		for(int i=0; i<5; i++) {
			tot += jumsu[i];
			System.out.println("jumsu"+i+" : "+jumsu[i]);
		}
		return tot;
	}

}
