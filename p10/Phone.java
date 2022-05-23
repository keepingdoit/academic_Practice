package p10;
//추상클래스
public abstract class Phone {
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	//추상메소드
	public abstract void sound();
	
}
