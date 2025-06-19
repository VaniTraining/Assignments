package assignments;

import java.lang.reflect.Parameter;

public class Assignement18_Palindrome {

	public static void main(String[] args) {

		//String text = "A man, a plan, a canal: Panama";
		//String text = "race a car";
		String text = "Madam";
		String temp = text.replaceAll("[^a-zA-Z]", "").toLowerCase();
		int textLength = temp.length();
		boolean palindome = true;
		
		System.out.println("Text -> "+temp);
		

		for (int i = 0, j = textLength - 1; i < textLength; i++) {
			if (temp.charAt(i) != temp.charAt(j)) {
				palindome = false;
			}
			j--;
		}
		System.out.println(palindome);
	}

}
