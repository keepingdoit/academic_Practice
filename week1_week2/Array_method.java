package week1_week2;

public class Array_method {
	//배열 메소드 호출
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83,90,100};
		int sum1=0;
		for(int i=0; i<3; i++) {
			sum1+=scores[i];
		}
		System.out.println(sum1);
		
		int sum2=add(new int[] {83,90,100}); //초기값을 지정해서 메소드 scores에게 전달함
		System.out.println(sum2);
	}
	
	public static int add(int[] scores) {
		int sum=0;
		for(int i=0; i<3; i++) {
			sum+=scores[i];
		}
		return sum;
	}
}
