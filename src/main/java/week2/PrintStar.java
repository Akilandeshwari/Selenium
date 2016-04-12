package week2;

public class PrintStar {

	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			for (int k = 0; k <= i; k++) {
				if (i % 2 == 0) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
