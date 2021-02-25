import java.util.Scanner;

public class inputGallery {
	private static int hOS;
	private static int dOl;

	private static int ofODe;
	private static int exRole;
	private static int exHit;
	public static int pickOMR;
	public static int setQ;




	public static void basicQs() {

		switch (Main.role) {
		case 2: 
			System.out.println("As a coach, it is your job to know where each player should be in a rotation and instruct the setter on what plays to run.");
			System.out.println("Would you like to look at player rotations or plays to run first? \t (1) Rotations \t (2) Plays");
			int rOp = Main.input.nextInt();
			switch(rOp) {
			case 1:
				System.out.println("Select the position you would like to view rotations for: \t (1) Setter \t (2) Rightside \t (3) Middle \t (4) Outside \t (5) Defensive Specialist \t (6) Libero ");
				int roPo = Main.input.nextInt();
				switch(roPo) {
				case 1:
					Rotations.roSet();
					break;
				case 2:
					Rotations.roRight();
					break;
				case 3:
					Rotations.roMid();
					break;
				case 4:
					Rotations.roOut();
					break;
				case 5:
					Rotations.roDS();
					break;
				case 6:
					Rotations.roLib();
					break;
				}
				break;
				
			case 2: 
				Plays.plays();
				
			}

			break;
		
		case 1: 
			Main.x = new Offensive();

			Main.x.playVolleyball();
			
			System.out.println("Have you ever played volleyball before? \t (1)Yes \t (2) No");
			int experience = Main.input.nextInt();
			switch (experience) {
			case 1: 
				experienceQs();
				break;
			

			case 2: 
				basicInfo();

				break;
			
			}
			break;
		
		}
	}

	public static void experienceQs() {
		System.out.println("I am a: \t (1) Offensive Player \t (2) Defensive \t (3) I don't know");
		ofODe = Main.input.nextInt();
		switch(ofODe) {
		case 1:
			System.out.println("My role is: \t (1) Hitter \t (2) Setter \t (3) I don't know");
			exRole = Main.input.nextInt();
			switch(exRole) {
			case 1: {
				System.out.println("Are you a \t (1) Outside \t (2) Middle \t (3) RightSide \t (4) I don't know");
				exHit = Main.input.nextInt();
				switch(exHit) {
				case 1: 
					Rotations.roOut();
					break;
				case 2: 
					Rotations.roMid();
					break;
				case 3: 
					Rotations.roRight();
					break;
				case 4: 
					System.out.println("No worries! Let's look into the possibilities");
					break;
					//call hitter position info class
				}
				}
			case 2: {
				System.out.println("Would you like to go over (1) Setter's Rotations or (2) Setter'Run Plays:");
				int exSet = Main.input.nextInt();
				switch (exSet) {
				case 1: 
					Rotations.roSet();
					break;
				case 2: 
					Plays.plays();
					break;
				}

				break;
			}

			}
		case 2: 
			System.out.println("I am a: \t (1) Libero \t (2) Defensive Specialist \t (3) I don't know ");
			int exDe = Main.input.nextInt();
			switch(exDe) {
			case 1: 
				System.out.println("Let's go over the rotations for a Libero");
				Rotations.roLib();
				break;
			case 2: 
				System.out.println("Let's go over the rotations for a Defensive Specialist (DS)");
				Rotations.roDS();
				break;
			}
			break;
		case 3:
			basicInfo();
			break;
		
		

		
		}

		//understand how much the player already knows (i.e. if they already know they are offensive skip that step but go to position decider)

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
			 hOS = Main.input.nextInt();
			 hOS();

			break;
		case 2:
			Main.x = new Defensive();

			Main.x.getPurpose();
			System.out.println(" ");
			Main.x.getPosition();
			System.out.println("Would you like to be a (1) Libero or (2) Defensive Specialist");
			dOl = Main.input.nextInt();
			dOl();
			break;

		}
	}
	public static void hOS() {
		switch (hOS) {
		
		case 1:
			Main.x = new Hitter();

			Main.x.getPurpose();
			Main.x.getPosition();
			
			System.out.println("Do you want to be a(n): \t (1) Outside \t (2) Middle \t (3) Rightside ");
			 pickOMR = Main.input.nextInt();
			 switch(pickOMR) {
			 case 1:
				 System.out.println("Let's look at the rotations for Outside");
				 Rotations.roOut();
				 break;
			 case 2:
				 System.out.println("Let's look at the rotations for Middle");
				 Rotations.roMid();
				 break;
			 case 3:
				 System.out.println("Let's look at the rotations for Rightside");
				 Rotations.roRight();
				 break;
			 }


			break;
		case 2:
			Main.x = new Setter();
			
			Main.x.getPurpose();
			Main.x.getPosition();
			
			System.out.println("Do you want to look at (1) Setter Rotations or (2) Setter-Run Plays");
			setQ = Main.input.nextInt();
			switch(setQ) {
			case 1:
				Rotations.roSet();
				break;
			case 2: 
				Plays.plays();
			}

			
			break;
		}
	}
		public static void dOl() {
			switch (dOl) {
			
			case 1:

			
					 System.out.println("Let's look at the rotations for Libero");
					 Rotations.roLib();
					 break;
	
				 

			case 2:
				
				 System.out.println("Let's look at the rotations for Defensive Specialist");
				 Rotations.roDS();
				 break;

				}

				
			}
		
	}


