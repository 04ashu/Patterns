package pattern1;

public class Pattern11 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			int start = 1;
			if(i%2==0)
				start = 0;
			for(int j=1;j<=i;j++) {
				System.out.print(start);
				start = 1-start;
			}
			System.out.println();
		}

	}

}
