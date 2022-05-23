package method;
//실행클래스
public class Sungjuk_ex {
	
	public static void main(String[] args) {
		//Sungjuk.gugudan();
		Sungjuk.print(); //static이 있을 때 호출
		Sungjuk a = new Sungjuk();
		a.gugudan(); //static를 뺐을 때 인스턴스화 및 호출
	}

}
