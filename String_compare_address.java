package TJ;
//���ڿ��� ���������� ���� �׷��� ���ڿ� ��ü�� ���ϰ� �ʹٸ� @.equals(@)�̿�
public class String_compare_address {

	public static void main(String[] args) {
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		String strVar3 = new String("�Ź�ö");
		System.out.println(strVar1==strVar2);
		System.out.println(strVar2==strVar3);
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
		//��������
		System.out.println(strVar1.hashCode()); //���� �ּҹ��� Ȯ�� .hashCode()
		System.out.println(strVar3.hashCode());
	}
	
}

