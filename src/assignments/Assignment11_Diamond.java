package assignments;

/* Print the numbers in diamond-shaped pyramid of numbers.*/
public class Assignment11_Diamond {

	public static void main(String[] args) {
        int n = 5; // You can change the size of the diamond here

        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print numbers in ascending order
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            // Print numbers in descending order (excluding the peak number)
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println(); // Move to the next line
        }

        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print numbers in ascending order
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            // Print numbers in descending order (excluding the peak number)
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println(); // Move to the next line
        }
    }

}
