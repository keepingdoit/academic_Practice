package Classs;
import java.util.Scanner;
public class Array_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int [5];
		for(int i=0; i<arr.length; i++) {
			System.out.println("values ["+(i+1)+"]�� �� : ");
			arr[i] = sc.nextInt();
		}
		
		Array values = new Array();
		int tot = values.tot(arr);
		double avg = values.avg();
		
		System.out.print("�迭�� : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println("\n���� : " + tot);
		System.out.println("��� : " + avg);
		
	}

}
