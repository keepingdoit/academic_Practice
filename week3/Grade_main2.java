package week3;

public class Grade_main2 {

	public static void main(String[] args) {
		
		//�̷��� �żҵ���� �ܿ� �� ���� ������ �ʿ��� �� ���۸��� ����
		//����� �˾ƿ´�.
		
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
			Grade GRADE = Grade.valueOf(jumsu); // GRADE > ���ο� ���� ����
			
			if(GRADE == Grade.A || GRADE == Grade.B)
				System.out.println("�������");
			else
				System.out.println("��������");
		}
		
		Grade[] grades = Grade.values();
		for(Grade g : grades) { //Grade g > ���ο� ���� ����
			System.out.println(g);
			
		}
		
		
		
	}

}
