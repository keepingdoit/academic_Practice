package Classs;

public class Singleton_ex {

	public static void main(String[] args) {
		Singleton o1 = Singleton.get1();
		System.out.println(o1.tot());
		System.out.println(o1.avg());
		System.out.println(o1.name);
	}

}
