import java.util.Scanner;

public class VacationDestinations {

    public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);

	System.out.print("What kind of vacation would you like to go on, music, tropical, or adventurous?");
	String vacationType = scnr.next();

	System.out.print("How many people are in your group?");
	int groupSize = scnr.nextInt();

	scnr.close();

	String vacationDestination;

	if (vacationType.equals("musical")) {
	    vacationDestination = "New Orleans";
	} else if (vacationType.equals("tropical")) {
	    vacationDestination = "Beach Vacation in Mexico";
	} else if (vacationType.equals("adventurous")) {
	    vacationDestination = "Whitewater Rafting the Grand Canyon";
	} else {
	    System.out.println("You must choose musical, tropical, or adventurous.");
	    return;
	}

	String travelSuggestion;

	if (groupSize <= 0) {
	    System.out.println("Group size must be positive.");
	    return;
	} else if (groupSize <= 2) {
	    travelSuggestion = "First Class";
	} else if (groupSize <= 5) {
	    travelSuggestion = "Helicopter";
	} else {
	    travelSuggestion = "Charter Flight";
	}

	String result = "Since you’re a group of " + groupSize + " going on a " + vacationType
		+ " vacation, you should take a " + travelSuggestion + " to " + vacationDestination + ".";

	System.out.println(result);
    }
}
