package p1;
import java.util.Random;
public class BB {

	public static void main(String[] args) {
		Random rd = new Random();
		AA aa = new AA(rd.nextInt(100),1);
		System.out.println(aa.num3);
		System.out.println(aa.getEven());
		
	}

}
