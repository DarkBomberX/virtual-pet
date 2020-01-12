
public class VirtualPet {

	int hunger = 20;
	int play = 20;
	int waste = 10;
	int sleep = 20;
	int health = 10;

	public void tick() {
		hunger = hunger - 1;
		play = play - 1;
		waste = waste - 1;
		sleep = sleep - 1;
	}

	public void feed() {
		hunger = hunger + 6;
		System.out.println("Majima eats his tasty food!");
	}

	public void entertain() {
		play = play + 6;
		double game = Math.floor((Math.random() * ((3 - 1) + 1)) + 1);
		if (game == 1) {
			System.out.println("Majima and you play with a stuffed mouse.");
		} else if (game == 2) {
			System.out.println("You repeatedly throw a ball for Majima to catch.");
		} else if (game == 3) {
			System.out.println("You pick Majima up and dance to music.");
		} else {
			System.out.println("Majima Chases his tail");
		}
	}

	public void useBathroom() {
		waste = waste + 11;
		System.out.println("Majima uses the litter box and cleans off his paws.");
	}

	public void rest() {
		sleep = sleep + 8;
		hunger = hunger - 3;
		waste = waste - 5;
		System.out.println("Majima Sleeps for 5 hours.");
	}

	public boolean isAlive() {
		if (hunger <= 0 || play <= 0 || waste <= 0 || sleep <= 0) {
			System.out.println("He's dead, Jim.");
			return false;
		}
		return true;
	}
}
