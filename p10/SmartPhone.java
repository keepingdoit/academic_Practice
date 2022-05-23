package p10;

public class SmartPhone extends Phone{
	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색");
	}
	
	//오버라이드
	public void sound() {
		System.out.println("야옹야옹");
	}
}
