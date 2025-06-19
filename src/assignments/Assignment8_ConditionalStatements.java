package assignments;

import java.util.ArrayList;

public class Assignment8_ConditionalStatements {

	public static void main(String[] args) {
		
		int debits = 0;
		int debitAmount = 0;
		int credits = 0;
		int creditAmount = 0;
		double RemainingAmt = 0;
		double amt = 0;
		
		ArrayList<String> amount = new ArrayList<String>();
		amount.add("50000");
		amount.add("-2000");
		amount.add("3000");
		amount.add("-15000");
		amount.add("-200");
		amount.add("-300");
		amount.add("4000");
		amount.add("-3000");

		for(String num : amount) {
			amt = Double.parseDouble(num);
			RemainingAmt += amt;
			if(num.contains("-")) {
				debits++;
				debitAmount += amt;
			} else {
				credits++;
				creditAmount += amt;
			}
			if(amt > 10000) {
				System.out.println("Suspicious credit debit Transaction with Amount -- "+amt);
			}
			
		}
		
		System.out.println("Debits => "+debits);
		System.out.println("Debit Amount  => "+debitAmount);
		System.out.println("Credit => "+credits);
		System.out.println("Credit Amount => "+creditAmount);
		System.out.println("Remaining Amount => "+RemainingAmt);
	}

}
