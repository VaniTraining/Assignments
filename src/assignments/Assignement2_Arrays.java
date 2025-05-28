package assignments;

public class Assignement2_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Subject names
		String[][] subjects = {
				{ "Mathematics i", "Physics", "Chemistry", "ComputerProgramming", "EngineeringDrawring",
						"Basic Electrical Engg" },
				{ "Mathmatics ii", "Mechanic", "Environmental Sci", "Basic Electronics", "Engg physics",
						"Engg Graphics" },
				{ "Data Structures", "Descrete Mathematics", "Digital Electronics", "Operating Systems",
						"Signals and systems", "Obj Ori Prg" },

				{ "Algorithms", "Comp networks", "Data systems", "Micro processors", "Comm engg", "Software engg" },

				{ "Probability and stats", "Marchine learning", "Compiler Designs", "Theory of computation",
						"Embedded systems", "Computer graphics" } };

		//Marks scored in all subjects
		String[][] marks = { { "Pass(78)", "Pass(85)", "Fail(21)", "Pass(74)", "Pass(88)", "Pass(79)" },
				{ "Pass(82)", "Pass(77)", "Pass(93)", "Fail(19)", "Fail(24)", "Pass(90)" },
				{ "Pass(88)", "Pass(81)", "Pass(76)", "Fail(32)", "Pass(85)", "Pass(78)" },
				{ "Pass(91)", "Pass(73)", "Fail(19)", "Pass(80)", "Pass(76)", "Pass(87)" },
				{ "Pass(86)", "Pass(88)", "Pass(84)", "Pass(95)", "Pass(73)", "Pass(90)" } };

		//3D array to store subjects and marks
		String[][][] subject_Marks = { subjects, marks };

		//Print Semester 2, subject 4 and subject 5 names
		System.out.println("Semester 2, subject 4 Name -> " + subject_Marks[0][1][3] + " Subject 5 Name "
				+ subject_Marks[0][1][4]);
		
		//Print Semester 4 subject 3 name and score
		System.out.println(
				"Semester 4, subject 3 Name -> " + subject_Marks[0][3][2] + " Marks " + subject_Marks[1][3][2]);
		//Print Semester 4 subject 6 name and score
		System.out.println(
				"Semester 4, subject 6 Name -> " + subject_Marks[0][3][5] + " Marks " + subject_Marks[1][3][5]);

	}

}
