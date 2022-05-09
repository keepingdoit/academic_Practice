package TJ;
//문자열은 참조번지를 비교함 그래서 문자열 자체를 비교하고 싶다면 @.equals(@)이용
public class String_compare_address {

	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");
		System.out.println(strVar1==strVar2);
		System.out.println(strVar2==strVar3);
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
		//참조번지
		System.out.println(strVar1.hashCode()); //참조 주소번지 확인 .hashCode()
		System.out.println(strVar3.hashCode());
	}
	
}

