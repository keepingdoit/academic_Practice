package week3;

public class Grade_main2 {

	public static void main(String[] args) {
		
		//이러한 매소드들을 외울 수 없기 때문에 필요할 때 구글링을 통해
		//기능을 알아온다.
		
		Grade grade = Grade.C;
		int ordinal = grade.ordinal();
		System.out.println(ordinal);
		
		Grade grade1 = Grade.A;
		Grade grade2 = Grade.F;
		int result1 = grade1.compareTo(grade2);
		int result2 = grade2.compareTo(grade1);
		System.out.println(result1);
		System.out.println(result2);
		
		if (args.length == 1) {
			String jumsu = args[0]; 
			Grade GRADE = Grade.valueOf(jumsu); // GRADE > 새로운 변수 선언
			
			if(GRADE == Grade.A || GRADE == Grade.B)
				System.out.println("우수성적");
			else
				System.out.println("보통학점");
		}
		
		Grade[] grades = Grade.values();
		for(Grade g : grades) { //Grade g > 새로운 변수 선언
			System.out.println(g);
			
		}
		
		
		
	}

}
