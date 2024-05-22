package pattern1;

public class Pattern20 {

	public static void main(String[] args) {
		
		int n =5;
		
		for(int i=1;i<=2*n-1;i++) {
			int stars = i;
			int spaces = (2*n)-(2*i);
			if(i>n) {
				stars = 2*n - i;
				spaces = 2*(i-n);
			}
			for(int j=1;j<=stars;j++) {
				System.out.print("*");
			}
			for(int k=1;k<=spaces;k++) {
				System.out.print(" ");
			}
			for(int l=1;l<=stars;l++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
