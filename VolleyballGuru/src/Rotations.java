
public class Rotations {
	public static int roNum;
	public static boolean newRo = true;
	public static String one1 = "1";
	public static String two1 = "2";
	public static String three1 = "3";
	public static String four1 = "4";
	public static String five1 = "5";
	public static String six1 = "6";
	public static String one2 = "1";
	public static String two2 = "2";
	public static String three2 = "3";
	public static String four2 = "4";
	public static String five2 = "5";
	public static String six2 = "6";
	public static String one3 = "1";
	public static String two3 = "2";
	public static String three3 = "3";
	public static String four3 = "4";
	public static String five3 = "5";
	public static String six3 = "6";
	public static String one4 = "1";
	public static String two4 = "2";
	public static String three4 = "3";
	public static String four4 = "4";
	public static String five4 = "5";
	public static String six4 = "6";
	public static String one5 = "1";
	public static String two5 = "2";
	public static String three5 = "3";
	public static String four5 = "4";
	public static String five5 = "5";
	public static String six5 = "6";
	public static String one6 = "1";
	public static String two6 = "2";
	public static String three6 = "3";
	public static String four6 = "4";
	public static String five6 = "5";
	public static String six6 = "6";

	public static void roOut() {
		two1 = "X";
		one2 = "X";
		six3 = "X";
		two4 = "X";
		one5 = "X";
		six6 = "X";
		while (newRo == true) {

			rotationQ();
			if (roNum == 2 || roNum == 3 || roNum == 4) {
				System.out.println("Outsides are  subbed out by the DS when they get to rotation " + roNum
						+ " and are subbed back in to play front row: ");
			}
			System.out.println("\nOutsides always hit from Zone 4");
			
			System.out.println("\nWould you like to look at the possible plays for an Outside? (1) Yes (2) No");
			int op = Main.input.nextInt();
			if(op == 1) {
				Plays.sOplays();
			}
			else {
				System.out.println(" ");
			}
			whileLoop();

		}

	}

	public static void roMid() {
		three1 = "X";
		two2 = "X";
		four3 = "X";
		three4 = "X";
		two5 = "X";
		four6 = "X";
		while (newRo == true) {

			rotationQ();
			if (roNum == 5 || roNum == 3 || roNum == 4) {
				System.out.println("Middles are subbed out by the Libero when they get to rotation " + roNum
						+ " and are subbed back in to play front row  ");
			}
			System.out.println("\nMiddles always hit from Zone 3");
			System.out.println("\nWould you like to look at the possible plays for a Middle? (1) Yes (2) No");
			int op = Main.input.nextInt();
			if(op == 1) {
				Plays.sMplays();
			}
			else {
				System.out.println(" ");
			}
			whileLoop();


		}
		

	}

	public static void roRight() {
		four1 = "X";
		three2 = "X";
		two3 = "X";
		four4 = "X";
		three5 = "X";
		two6 = "X";
		while (newRo == true) {

			rotationQ();
			if (roNum == 5 || roNum == 6 || roNum == 4) {
				System.out.println("Rightsides are subbed out by Setter when they get to rotation " + roNum
						+ " and are subbed back in to play front row:  ");
			}
			System.out.println("\nRightsides always hit from Zone 2");
			
			System.out.println("\nWould you like to look at the possible plays for a Rightside? (1) Yes (2) No");
			int op = Main.input.nextInt();
			if(op == 1) {
				Plays.sRplays();
			}
			else {
				System.out.println(" ");
			}

			whileLoop();
			
		}

	}

	public static void roSet() {
		one1 = "X";
		six2 = "X";
		five3 = "X";
		one4 = "X";
		six5 = "X";
		five6 = "X";
		while (newRo == true) {

			rotationQ();

			if (roNum == 5 || roNum == 6 || roNum == 4) {
				System.out.println("Setters are subbed out by a Rightside Hitter when they get to rotation " + roNum
						+ " and are subbed back in to play back row:  ");
			}
			
			System.out.println("\nWould you like to look at the possible plays for a Setter? (1) Yes (2) No");
			int op = Main.input.nextInt();
			if(op == 1) {
				Plays.plays();
			}
			else {
				System.out.println(" ");
			}

			whileLoop();
		}

	}

	public static void roLib() {
		six1 = "X";
		five2 = "X";
		one3 = "X";
		six4 = "X";
		five5 = "X";
		one6 = "X";
		while (newRo == true) {
			rotationQ();

			if (roNum == 5 || roNum == 3 || roNum == 4) {
				System.out.println("Liberos are subbed out by a Middle Hitter when they get to rotation " + roNum
						+ " and are subbed back in to play back row:  ");
			}
			System.out.println("\nLiberos will always pass from Zone 5");
			System.out.println("\nWould you like to look at the possible plays for a Libero? (1) Yes (2) No");
			int op = Main.input.nextInt();
			if(op == 1) {
				Plays.slplays();
			}
			else {
				System.out.println(" ");
			}

			whileLoop();
		}

	}

	public static void roDS() {
		five1 = "X";
		one2 = "X";
		six3 = "X";
		five4 = "X";
		one5 = "X";
		six6 = "X";
		while (newRo == true) {
			rotationQ();

			if (roNum == 2 || roNum == 3 || roNum == 4) {
				System.out
						.println("Defensive Specialistst are subbed out by a Outside Hitter when they get to rotation "
								+ roNum + " and are subbed back in to play back row:  ");
			}

			System.out.println("\nDefensive Specialists will always pass from Zone 6");
			System.out.println("\nWould you like to look at the possible plays for a Defensive Specialist? (1) Yes (2) No");
			int op = Main.input.nextInt();
			if(op == 1) {
				Plays.sDSplays();
			}
			else {
				System.out.println(" ");
			}

			whileLoop();
		}

	}

	public static void rotationQ() {
		System.out.println("Which rotation do you want to look at: 1, 2, 3, 4, 5, or 6?");
		roNum = Main.input.nextInt();
		System.out.println("X marks your starting spot in rotation " + roNum);
		switch (roNum) {
		case 1:
			System.out.println("__________________");
			System.out.println("|                 |");
			System.out.println("|  1     6     5  |");
			System.out.println("|                 |");
			System.out.println("|  2     3     4  |");
			System.out.println("|                 |");
			System.out.println("|-----------------|");
			System.out.println("|                 |");
			System.out.println("|  " + four1 + "     " + three1 + "     " + two1 + "  |");
			System.out.println("|                 |");
			System.out.println("|  " + five1 + "     " + six1 + "     " + one1 + "  |");
			System.out.println("__________________");

			break;
		case 2:
			System.out.println("__________________");
			System.out.println("|                 |");
			System.out.println("|  1     6     5  |");
			System.out.println("|                 |");
			System.out.println("|  2     3     4  |");
			System.out.println("|                 |");
			System.out.println("|-----------------|");
			System.out.println("|                 |");
			System.out.println("|  " + four2 + "     " + three2 + "     " + two2 + "  |");
			System.out.println("|                 |");
			System.out.println("|  " + five2 + "     " + six2 + "     " + one2 + "  |");
			System.out.println("__________________");
			break;
		case 3:
			System.out.println("__________________");
			System.out.println("|                 |");
			System.out.println("|  1     6     5  |");
			System.out.println("|                 |");
			System.out.println("|  2     3     4  |");
			System.out.println("|                 |");
			System.out.println("|-----------------|");
			System.out.println("|                 |");
			System.out.println("|  " + four3 + "     " + three3 + "     " + two3 + "  |");
			System.out.println("|                 |");
			System.out.println("|  " + five3 + "     " + six3 + "     " + one3 + "  |");
			System.out.println("__________________");
			break;
		case 4:
			System.out.println("__________________");
			System.out.println("|                 |");
			System.out.println("|  1     6     5  |");
			System.out.println("|                 |");
			System.out.println("|  2     3     4  |");
			System.out.println("|                 |");
			System.out.println("|-----------------|");
			System.out.println("|                 |");
			System.out.println("|  " + four4 + "     " + three4 + "     " + two4 + "  |");
			System.out.println("|                 |");
			System.out.println("|  " + five4 + "     " + six4 + "     " + one4 + "  |");
			System.out.println("__________________");
			break;
		case 5:
			System.out.println("__________________");
			System.out.println("|                 |");
			System.out.println("|  1     6     5  |");
			System.out.println("|                 |");
			System.out.println("|  2     3     4  |");
			System.out.println("|                 |");
			System.out.println("|-----------------|");
			System.out.println("|                 |");
			System.out.println("|  " + four5 + "     " + three5 + "     " + two5 + "  |");
			System.out.println("|                 |");
			System.out.println("|  " + five5 + "     " + six5 + "     " + one5 + "  |");
			System.out.println("__________________");
			break;
		case 6:
			System.out.println("__________________");
			System.out.println("|                 |");
			System.out.println("|  1     6     5  |");
			System.out.println("|                 |");
			System.out.println("|  2     3     4  |");
			System.out.println("|                 |");
			System.out.println("|-----------------|");
			System.out.println("|                 |");
			System.out.println("|  " + four6 + "     " + three6 + "     " + two6 + "  |");
			System.out.println("|                 |");
			System.out.println("|  " + five6 + "     " + six6 + "     " + one6 + "  |");
			System.out.println("__________________");
			break;
		}
	}

	public static void whileLoop() {
		System.out.println("Would you like to look at another rotation? \t (1) Yes \t (2) No");
		int newRoAnswer = Main.input.nextInt();
		if (newRoAnswer == 1) {
			newRo = true;
		} else {
			newRo = false;
			System.out.println("See you next time!");

		}
	}
}
