package pattern1;

public class Pattern19 {

	public static void main(String[] args) {
		
		int n=5;
		
		//upper pattern
		for(int i=n;i>=1;i--) {
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			for(int j=1;j<= (2*n)-(2*i);j++) {
				System.out.print(" ");
			}
			
			for(int l=1;l<=i;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//lower pattern
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print("*");
			}
			for(int c=1;c<=(2*n)-(2*a);c++) {
				System.out.print(" ");
			}
			for(int d = 1;d<=a;d++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
