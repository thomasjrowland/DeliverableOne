import java.util.Scanner;

public class VacationDecisions {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		String vacationType = "";
		int numPeople;
		String destinationOut = "";
		String transportationOut = "";
		String musical = "Musical";
		String tropical = "Tropical";
		String adventurous = "Adventurous";
		String fullOutput;
		boolean vacationValidInput;
		boolean peopleValidInput;
		
		System.out.println("What kind of trip would you like to go on?");
		System.out.println("Please type ONE of the following: Musical, Tropical, Adventurous)");
		
		vacationType = scnr.next();
		
		System.out.println("Ok: " + vacationType);
		
		System.out.println("How many people are in your group?");
		
		numPeople = scnr.nextInt();
		
		System.out.println("Ok: " + numPeople);
		
		if (numPeople <= 0) {
			peopleValidInput = false;
			System.out.println("Sorry, it takes at lease one person to do anything, let alone take a vacation!");
		}
		else if (numPeople <= 2) {
			peopleValidInput = true;
			transportationOut = "first class";
		}
		else if (numPeople <=5) {
			peopleValidInput = true;
			transportationOut = "helicopter";
		}
		else {
			peopleValidInput = true;
			transportationOut = "charter flight";
		}
		
		if (vacationType.equals(musical)) {
			vacationValidInput = true;
			destinationOut = "New Orleans";
		}
		else if (vacationType.equals(tropical)) {
			vacationValidInput = true;
			destinationOut = "beach vacation in Mexico";
		}
		else if (vacationType.equals(adventurous)) {
			vacationValidInput = true;
			destinationOut = "whitewater rafting the Grand Canyon";
		}
		else {
			vacationValidInput = false;
			System.out.println("You did not select an approved type of vacation.");		
		}
		
		if (peopleValidInput && vacationValidInput) {
			fullOutput = "Since you have a group of " + numPeople + " going on a " + vacationType
					+ " vacation, you should take a " + transportationOut + " to " + destinationOut + ".";
		}
		else {
			fullOutput = "Please try again with valid input.";
		}
		
		System.out.println(fullOutput);
		
	}

}
