import java.util.Scanner;

public class inputGallery {
	private void basicQs() {

	switch(Main.role) {
	case 1:
	    Player x = new Offensive();
	    x.playVolleyball();
	case 2:
		System.out.println("Have you ever played volleyball before? \t (1)Yes \t (2) No");
		int experience = Main.input.nextInt();
		switch (experience) {
		case 1:
			experienceQs();
			break;
		case 2: 
			
		}
		break;
	}
	}
	private void experienceQs() {
		

	}
	private void basicInfo() {
	    System.out.println("Select field you would like to learn more about?");
	    System.out.println("\t (1) Offensive Player");
	    System.out.println("\t (2) Defensive Player");
		int info = Main.input.nextInt();
		switch(info) {
		case 1:
			//connect to offensive class
			break;
		case 2:
		}
	}


}
