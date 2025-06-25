package assignments;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Assignment19_DefaultfunctionalInterface {

	public static void main(String[] args) {

// PREDICATE
		// Check if the given String is "JAVA"
		Predicate<String> text = x -> x.matches("JAVA");
		System.out.println(text.test("JAVA"));

		// Check if the given string contains "Special" at the index 13
		Predicate<String> data = n -> n.startsWith("Special", 13);
		System.out.println(data.test("Google has many Special features"));

// FUNCTION
		// Repeat the string to the number of time mentioned
		Function<String, String> rep = i -> i.repeat(4);
		System.out.println(rep.apply("Home "));

		// Convert the given odd number to even number
		Function<Integer, Integer> num = k -> k * 2;
		System.out.println(num.apply(9));

// SUPPLIER
		//Check if the character is vowel or consonant
		Supplier<String> fun1 = () -> {
			char ch = 'i';
			if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				return "Voel";
			} else {
				return "Consonant";
			}
		};
		System.out.println(fun1.get());
		
		//check if the number is positive or negative
		Supplier<String> fun2 = () -> {
			int number = -20;
			String result ;
			
			if(number > 0) {
				result = "Positive";
			} else {
				result = "Negative";
			}
			return result;		
		};
		System.out.println(fun2.get());
		
//CONSUMER
		//Concatenate a string to existing one
		Consumer<String> n = x -> System.out.println(x.concat("automation"));
		String data1 = "Full stack ";
		n.accept(data1);
		
		//Remove the white space for a given string
		Consumer<String> con = x -> System.out.println(x.strip());
		con.accept("White House");
	}
}
