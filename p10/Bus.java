package p10;

public class Bus extends Vehicle {
	String name = "Bus";
	//메소드 재정의 (오버라이드)
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}
