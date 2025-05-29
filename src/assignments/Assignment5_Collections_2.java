package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment5_Collections_2 {

	public static void main(String[] args) {
		
		
		// Student details
		Map<String, String> students = new HashMap<String, String>();
		students.put("student1Name", "John Doe");
		students.put("student1Age", "20");
		students.put("student1Gender", "Male");
		students.put("student1RoleNo.", "SBA12345");
		students.put("student1Grade", "A++");
		students.put("student1Major", "Computer Sci.");
		students.put("student1GPA", "A3.8");
		students.put("student1Email", "John@example.com");
		students.put("student1PAN", "SDF6543210");
		students.put("student1Address", "123 Elm St.");
		
		students.put("student2Name", "Jane Smith");
		students.put("student2Age", "21");
		students.put("student2Gender", "Female");
		students.put("student2RoleNo.", "SBA12346");
		students.put("student2Grade", "B+");
		students.put("student2Major", "Mathematics");
		students.put("student2GPA", "A3.5");
		students.put("student2Email", "Jane@example.com");
		students.put("student2PAN", "REQ6543211");
		students.put("student2Address", "456 Oak St.");
		
		students.put("student3Name", "Mike Brown");
		students.put("student3Age", "22");
		students.put("student3Gender", "Male");
		students.put("student3RoleNo.", "SBA12347");
		students.put("student3Grade", "A+");
		students.put("student3Major", "Physics");
		students.put("student3GPA", "A3.9");
		students.put("student3Email", "Mike@example.com");
		students.put("student3PAN", "TYR6543212");
		students.put("student3Address", "789 Pine St.");
		
		//Employee details
		Map<String, String> employee = new HashMap<String, String>();
		employee.put("employee1ID", "E001");
		employee.put("employee1Name", "Alice Green");
		employee.put("employee1Age", "30");
		employee.put("employee1Gender", "Female");
		employee.put("employee1Dept", "Engineer");
		employee.put("employee1Pos", "Software Engg");
		employee.put("employee1Salary", "70k Pounds");
		employee.put("employee1Email", "alice@example.com");
		employee.put("employee1PAN", "SDF6543210");
		
		employee.put("employee2ID", "E002");
		employee.put("employee2Name", "Bob Johnson");
		employee.put("employee2Age", "35");
		employee.put("employee2Gender", "Male");
		employee.put("employee2Dept", "Marketing");
		employee.put("employee2Pos", "Marketing Manager");
		employee.put("employee2Salary", "85k Pounds");
		employee.put("employee2Email", "bob@example.com");
		employee.put("employee2PAN", "REW6543211");
		
		employee.put("employee3ID", "E003");
		employee.put("employee3Name", "Carol White");
		employee.put("employee3Age", "28");
		employee.put("employee3Gender", "Female");
		employee.put("employee3dept", "Sales");
		employee.put("employee3Pos", "Sales Executive");
		employee.put("employee3Salary", "65k Pounds");
		employee.put("employee3Email", "carol@example.com");
		employee.put("employee3PAN", "TYR6543212");
		
		//Product details
		Map<String, String> product = new HashMap<String, String>();
		product.put("Product1ID", "P001");
		product.put("Product1Name", "Laptop");
		product.put("Product1Category", "Electronics");
		product.put("Product1Price", "12k Pounds");
		product.put("Product1StockQnty", "Not available");
		product.put("Product1Supplier", "Tech Supplies");
		product.put("Product1Warranty", "2 years");
		product.put("Product1Rating", "4.5 stars");
		product.put("Product1MgnDate", "Aug 2023");
		product.put("Product1ExpDate", "Aug 2008");
		
		product.put("Product2ID", "P001");
		product.put("Product2Name", "Desk chair");
		product.put("Product2Category", "Furniture");
		product.put("Product2Price", "150k Pounds");
		product.put("Product2StockQnty", "Two");
		product.put("Product2Supplier", "Office Depot");
		product.put("Product2Warranty", "1 years");
		product.put("Product2Rating", "4 stars");
		product.put("Product2MgnDate", "Sep 2024");
		product.put("Product2ExpDate", "N/A");
		
		product.put("Product3ID", "P002");
		product.put("Product3Name", "Coffe Maker");
		product.put("Product3Category", "Kitchen");
		product.put("Product3Price", "75k Pounds");
		product.put("Product4StockQnty", "Two hundred");
		product.put("Product5Supplier", "Kitchen World");
		product.put("Product6Warranty", "6 months");
		product.put("Product7Rating", "4.2 stars");
		product.put("Product8MgnDate", "Jan 2025");
		product.put("Product9ExpDate", "Jan 2027");
		
		Map<String, Map<String, String>> allData = new HashMap<String, Map<String,String>>();
		allData.put("stud", students);
		allData.put("emp", employee);
		allData.put("prod", product);
		
		Map<String, String> tempProd = allData.get("prod");
		
		//Printing Product2 Supplier Name
		System.out.println("Product details Supplier Name -> "+ tempProd.get("Product2Supplier"));
	}

}


