package Classs;

public class sungjuk_example {
	
	public static void main(String[] args) {
		sungjuk sj = new sungjuk(); //static이 없으므로 new연산자를 이용해 객체화(인스턴스화)
		
		sj.print(); //void print 호출
		
		String name = sj.name;
		int tot = sj.tot(80, 80, 80);
		double avg = sj.avg(80, 80, 80);
		String grade = sj.grade(avg);
		
		System.out.println(name +"\t"+sj.kor+"\t"+sj.eng+"\t"+sj.mat+"\t"
				+tot+"\t"+avg+"\t"+grade);
	}
}
