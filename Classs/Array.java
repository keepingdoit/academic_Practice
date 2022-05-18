package Classs;

public class Array {

int tot;

	int tot(int ... values) {
		for (int i=0; i<values.length; i++) {
			tot += values[i];
		}
		return tot;
	} //tot가 먼저 호출되고 'tot'필드에 arr배열의 합이 초기화(저장)된다.
	
	double avg() {
		int a = tot();
		return a/5.0; //tot 후에 호출된 avg의 'tot'는 필드에 저장된 값이 그대로 쓰게된다.
	}
}
