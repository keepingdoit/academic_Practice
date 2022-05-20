package p1;
//자식클래스
public class Member2 extends Member{
	String name, ssn;
	
	Member2(String id, String pw, String name, String ssn) {
		super(id,pw);
		this.name = name;
		this.ssn = ssn;
	}
	
	
}
