package assignments;

/*
 * 1. Count the total number of words in the sentence.
	2. Print the sentence words in reverse order.
	3. Convert the first character of each word to uppercase and print original sentence 
*/

public class Assignment15_StringCount {

	public static void main(String[] args) {
		String sample = "Java programming is fun and challenging";
		String[] words = sample.split(" ");
		int wordLength = words.length;
		String reverse = "";

		System.out.println("Total number of words in the sentence => " + wordLength);

		for (int i = wordLength - 1; i >= 0; i--) {
			String temp = words[i]; //get each word from string
			String wordRev = "";
			for (int j = temp.length() - 1; j >= 0; j--) { 
				wordRev = wordRev + temp.charAt(j); //reverse each word of the string
			}
			reverse = reverse + wordRev;
			reverse = reverse + " ";
		}
		System.out.println("Reverse String => " + reverse);
		
		/*convert first char of each word to uppercase */
		String CamelCase = "";
		for(int i=0; i<wordLength; i++) {
			String s = words[i];
			CamelCase += s.substring(0, 1).toUpperCase() + s.substring(1);
			CamelCase += " ";
		}
		System.out.println("Camel case => "+CamelCase);

	}

}
