package assignments;

public class Assignment17_StarTriangle {

	public static void main(String[] args) {

		int starCount = 5;
		int spaces = 0;

		for (int i = 1; i <= starCount; i++) {
			spaces = starCount - i;

			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			int temp = i;
			while (temp != 0) {
				System.out.print("*");
				temp--;
			}

			System.out.println();
		}

	}

}
