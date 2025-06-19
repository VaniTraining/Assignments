package assignments;

import java.util.ArrayList;
import java.util.List;

/*
 * Write a program to search for all occurrences of a “Java” word in the paragraph and print their
indexes.
*/
public class Assignment16 {

	public static void main(String[] args) {

		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		String[] word = paragraph.split(" "); // get all words from sentence
		int count = 0;
		String findKey = "Java";

		for (int i = 0; i < word.length; i++) {
			String temp = word[i]; // Get each word
			temp.replaceAll("[^a-zA-Z]", ""); // get only alphabets and replace other characters with ""

			if (temp.equalsIgnoreCase(findKey)) {
				count++; // increment the count on finding the Java word
			}
		}

		System.out.println("Total Java occurence => " + count);

		int index = 0;
		List<Integer> indexArr = new ArrayList<Integer>();

		while (index != -1) {
			index = paragraph.indexOf(findKey, index);

			if (index != -1) {
				indexArr.add(index);
				index = index + findKey.length();
			}
		}
		
		System.out.println(indexArr);
	}
}
