package countDigits;

public class CountDigits {

	public static void main(String[] args) {
		
		int num = 7564;
		int countDigits = (int) Math.log10(num) + 1;
		System.out.println(countDigits);

	}

}
