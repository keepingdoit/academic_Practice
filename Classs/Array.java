package Classs;

public class Array {

int tot;

	int tot(int ... values) {
		for (int i=0; i<values.length; i++) {
			tot += values[i];
		}
		return tot;
	} //tot�� ���� ȣ��ǰ� 'tot'�ʵ忡 arr�迭�� ���� �ʱ�ȭ(����)�ȴ�.
	
	double avg() {
		int a = tot();
		return a/5.0; //tot �Ŀ� ȣ��� avg�� 'tot'�� �ʵ忡 ����� ���� �״�� ���Եȴ�.
	}
}
