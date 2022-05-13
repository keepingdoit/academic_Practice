package week1_week2;

public class Array_copy {
	public static void main(String[] args) {
		/*String[] a = {"java", "array", "copy"};
		String[] b = new String[5];
		
		//배열카피
		System.arraycopy(a,0,b,0,a.length);
		
		for(int i=0; i<b.length;i++)
			System.out.print(b[i]+",");
		*/
		
		//aa 값을 bb에 거꾸로 카피
		int aa[] = new int[10];
		int bb[] = new int[10];
		for(int i=0; i<aa.length; i++) {
			aa[i]=i+1;
			System.out.print(aa[i]+" ");
		}
		for(int i=0; i<bb.length; i++) {
			bb[i]=aa[(aa.length-1)-i];
			System.out.print(bb[i]+" ");
		}
		
	}
}
