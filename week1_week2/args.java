package week1_week2;

public class args {

	public static void main(String[] args) {
		//�迭���� 2��
		if(args.length !=2) {
			System.out.println("���α׷�����");
			System.exit(0);
		}
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1+num2;
		System.out.println(result);
	}

}
