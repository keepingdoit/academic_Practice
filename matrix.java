package week3;

public class matrix {
//�࿭
	public static void main(String[] args) {
		int[][] engScores = new int[2][];
		engScores[0] = new int[2];
		engScores[1] = new int[3];
		
		for(int i=0; i<engScores.length; i++) {
			for(int k=0; k<engScores[i].length; k++) {
				System.out.println("engScores["+i+"]["+k+"] = "
						+ engScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] javaScores = { {95,80}, {92,96,80} };
		for (int i=0; i<javaScores.length; i++) {
			for(int k=0; k<javaScores[i].length; k++) {
				System.out.println("javaScores["+i+"]["+k+"]="
						+ javaScores[i][k] );
			}
		}
	}

}
