package TJ;
import java.util.Scanner;
public class week1_summary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor;	int eng;	int mat;
		int tot;		 double avg;	String grade;
		
		System.out.println("�̸� : ");
		name=sc.next();
		System.out.println("���� : ");
		kor=sc.nextInt();
		System.out.println("���� : ");
		eng=sc.nextInt();
		System.out.println("���� : ");
		mat=sc.nextInt();
		tot = tot (kor, eng, mat);
		avg = avg(kor, eng, mat);
		grade = grade(kor, eng, mat);
		System.out.println("�̸�\t����\t����\t����\t����\t���\t�հݿ���");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg+"\t"+grade);
		
	}
	public static int tot(int kor, int eng, int mat) {
		int tot=kor+eng+mat;
		return tot;
	}
	public static double avg(int kor, int eng, int mat) {
		double avg=(kor+eng+mat)/3;
		return avg;
	}
	public static String grade(int kor, int eng, int mat) {
		String grade;
		double avg=(kor+eng+mat)/3;
		if(avg>=60 && kor>=40 && eng>=40 && mat>=40)
			grade="�հ�";
		else
			grade="���հ�";
		return grade;
	}
	

	}


