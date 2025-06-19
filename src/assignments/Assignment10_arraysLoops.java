package assignments;

public class Assignment10_arraysLoops {

	public static void main(String[] args) {

		int[] numbers = { 100, 34, 1134, 36, 87, 98, 6666 };
		int temp = 0;

		for (int i = 0; i < numbers.length; i++) {

			for (int j = i + 1; j < numbers.length; j++) {

				if (numbers[i] < numbers[j]) { //compare adjacent number and swap if second number is greater than first number
					temp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = temp;
				}
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Sorted Array " + numbers[i]);
		}
	}
}
