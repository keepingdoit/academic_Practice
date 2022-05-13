package QZ;

public class sungjuk_example {
	
	public static void main(String[] args) {
		sungjuk ss1 = new sungjuk();
		sungjuk ss2 = new sungjuk();
		
		ss1.name = "홍길동";
		ss1.kor = 10;	ss1.eng = 20;	ss1.mat = 30;
		
		System.out.println(ss1.name);
		System.out.println(ss1.kor);
		System.out.println(ss1.eng);
		System.out.println(ss1.mat);
		
		/*
		 * int tot = ss2.tot();
		 * double avg = ss2.avg();
		 */
		
		ss2.name = "홍길순";
		ss2.kor = 100;	ss2.eng = 100;	ss2.mat = 100;
		System.out.println(ss2.name);
		System.out.println(ss2.tot());
		System.out.println(ss2.avg());
		
		//ss1과 ss2는 다른 참조변수를 가져 완전히 다른 값을 가진다.
	}
}
