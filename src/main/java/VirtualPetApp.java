import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		VirtualPet myCat = new VirtualPet();
		Scanner input = new Scanner(System.in);

		System.out.println("This is Majima the cat! What would you like to do? Type \'help\' to see options.");
		while (myCat.isAlive()) {
			String choice = input.nextLine();
			boolean helpInvalid = false;

			if (choice.equals("1")) {
				myCat.feed();
			} else if (choice.equals("2")) {
				myCat.entertain();
			} else if (choice.equals("3")) {
				myCat.useBathroom();
			} else if (choice.equals("4")) {
				myCat.rest();
			} else if (choice.equals("help")) {
				helpInvalid = true;
				System.out.println("Type 1 to Feed, 2 to Play, 3 to Use the Bathroom, or 4 to Go To Sleep!");
			} else {
				helpInvalid = true;
				System.out.println(
						"Invalid command. Type 1 to Feed, 2 to Play, 3 to Use the Bathroom, or 4 to Go To Sleep!");
			}

			if (helpInvalid == false) {
				myCat.tick();
			}
		}

	}

}
