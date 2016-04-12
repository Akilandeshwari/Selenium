package week1;

public class ReverseString {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abcdef");
		StringBuffer reverse = sb.reverse();
		System.out.println("String after reverse: " + reverse);
	}
}
