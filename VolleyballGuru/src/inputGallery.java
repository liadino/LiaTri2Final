import java.util.Scanner;

public class inputGallery {
	private static int hOS;

	public static void basicQs() {
		System.out.println(Main.role);

		switch (Main.role) {
		case 1: {
			Main.x.playVolleyball();
		}
		case 2: {
			System.out.println("Have you ever played volleyball before? \t (1)Yes \t (2) No");
			int experience = Main.input.nextInt();
			switch (experience) {
			case 1: {
				experienceQs();
				break;
			}

			case 2: {
				basicInfo();

				break;
			}
			}
		}
		}
	}

	public static void experienceQs() {
		//understand how much the player already knows (i.e. if they already know they are offensive skip that step but go to position decider)

	}
	public static void hOS() {
		switch (hOS) {
		case 1:
			Main.x = new Hitter();

			Main.x.getPurpose();
			Main.x.getPosition();


			break;
		case 2:
			Main.x = new Setter();
			
			Main.x.getPurpose();
			Main.x.getPosition();

			
			break;
		}
		
	}

	public static void basicInfo() {
		System.out.println("Select field you would like to learn more about?");
		System.out.println("\t (1) Offensive Player");
		System.out.println("\t (2) Defensive Player");
		int info = Main.input.nextInt();
		switch (info) {
		case 1:
			Main.x = new Offensive();

			Main.x.getPurpose();
			System.out.println(" ");
			Main.x.getPosition();
			System.out.println("Do you want to be a (1) hitter or (2) setter?");
			int hOS = Main.input.nextInt();

			break;
		case 2:
			Main.x = new Defensive();

			Main.x.getPurpose();
			System.out.println(" ");
			Main.x.getPosition();
			break;

		}
	}

}
