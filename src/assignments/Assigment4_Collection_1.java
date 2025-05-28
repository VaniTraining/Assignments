package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assigment4_Collection_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ====ArrayList usage
		List<Float> citiAreas = new ArrayList<Float>();
		citiAreas.add(1484f);
		citiAreas.add(714f);
		citiAreas.add(681.96f);
		citiAreas.add(650.0f);
		citiAreas.add(631.0f);

		System.out.println("Size of Array List -> " + citiAreas.size());
		System.out.println("Total area of cities 3 and 4 ->" + (citiAreas.get(2) + citiAreas.get(3)));
		System.out.println();

		// ==== Set usage
		Set<String> touristPlace = new HashSet<String>();
		touristPlace.add("Forbidden city");
		touristPlace.add("Eiffel Tower");
		touristPlace.add("Taj Mahal");
		touristPlace.add("Colosseium");
		touristPlace.add("Basilica");
		touristPlace.add("Versailles");
		touristPlace.add("Parthenon");
		touristPlace.add("Hargia Sophia");
		touristPlace.add("Times Sqaure");
		touristPlace.add("Louvre Museum");

		System.out.println("The size of Set -> " + touristPlace.size());
		System.out.println("The values in set -> " + touristPlace);

		// ===== Array usage
		int[] numbers = { 10, 15, 20, 5, 22, 55, 25, 66, 29, 66 };
		/*
		 * System.out.println("Number 5 ="+ numbers[4]);
		 * System.out.println("Number 6 ="+ numbers[5]);
		 */

		int avg = (numbers[4] + numbers[5]) / 2;
		System.out.println("Average of Number 5 and 6 =" + avg);

		// ArrayList
		List<String> TopGrossingMovies = new ArrayList<String>();
		TopGrossingMovies.add("Dangal");
		TopGrossingMovies.add("Bahubali 2");
		TopGrossingMovies.add("Pushpa 2");
		TopGrossingMovies.add("RRR");
		TopGrossingMovies.add("KGF");

		System.out.println("Highesst Grossing 3rd movie -> " + TopGrossingMovies.get(2));
	}

}
