package pattern1;

public class Pattern10 {

	public static void main(String[] args) {
		
		int stars;
		for(int i=1;i<=2*5-1;i++) {
			stars = i;
			if(i>5)
				stars = 2*5-i;	
			for(int j=1;j<=stars;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
