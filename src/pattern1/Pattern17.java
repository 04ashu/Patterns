package pattern1;

public class Pattern17 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			char ch = 'A';
			for(int j=1;j<= 5-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i)-1;k++) {
				System.out.print(ch);
				if(k<i)
					ch++;
				else
					ch--;
			}
			System.out.println();
		}

	}

}
