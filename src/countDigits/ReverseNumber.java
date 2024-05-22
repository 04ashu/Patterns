package countDigits;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num = -1331;
		int original = num;
		if(num<0)
			num = num*(-1);
		
		int rem;
		int reverse = 0;
		while(num>0) {
			rem = num % 10;
			reverse = reverse*10 + rem;
			num = num/10;
		}
		if(original<0)
			reverse = reverse*(-1);
		System.out.println("Reverse of the num is :" + reverse);
		if(reverse == original)
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
		

	}

}
