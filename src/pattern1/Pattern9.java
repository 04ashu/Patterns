package pattern1;

public class Pattern9 {

	public static void main(String[] args) {
		
		//Erect Pyramid
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//inverted pyramid
		for(int a=5;a>=1;a--) {
			for(int b=1;b<=5-a;b++) {
				System.out.print(" ");
			}
			for(int c=1;c<=2*a-1;c++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
