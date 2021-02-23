
public class Rotations {
	public static int roNum;
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
	public static String six5= "6";
	public static String one6 = "1";
	public static String two6 = "2";
	public static String three6 = "3";
	public static String four6 = "4";
	public static String five6 = "5";
	public static String six6 = "6";

	//create var num for each rotation that is replaced by the correct photo in that class
	public static void roOut() {
		two1 = "X";
		rotationQ();

	}
	public static void roMid() {
		one1 = "X";
		rotationQ();


		
	}	
	public static void roRight() {
		six1 = "X";
		rotationQ();


		
	}
	public static void roSet() {
		five1 = "X";
		rotationQ();


		
	}
	public static void roLib() {

		
	}
	public static void rotationQ() {
		System.out.println("Which rotation do you want to look at: 1, 2, 3, 4, 5, or 6?");
		roNum = Main.input.nextInt();
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
			System.out.println("|  "+four1+"     "+three1+"     "+two1+"  |");
			System.out.println("|                 |");
			System.out.println("|  "+five1+"     "+six1+"     " + one1 +"  |");
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
			System.out.println("|  "+four2+"     "+three2+"     "+two2+"  |");
			System.out.println("|                 |");
			System.out.println("|  "+five2+"     "+six2+"     " + one2 +"  |");
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
			System.out.println("|  "+four3+"     "+three3+"     "+two3+"  |");
			System.out.println("|                 |");
			System.out.println("|  "+five3+"     "+six3+"     " + one3 +"  |");
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
			System.out.println("|  "+four4+"     "+three4+"     "+two4+"  |");
			System.out.println("|                 |");
			System.out.println("|  "+five4+"     "+six4+"     " + one4 +"  |");
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
			System.out.println("|  "+four5+"     "+three5+"     "+two5+"  |");
			System.out.println("|                 |");
			System.out.println("|  "+five5+"     "+six5+"     " + one5 +"  |");
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
			System.out.println("|  "+four6+"     "+three6+"     "+two6+"  |");
			System.out.println("|                 |");
			System.out.println("|  "+five6+"     "+six6+"     " + one6 +"  |");
			System.out.println("__________________");
			break;
		}
		
	}

}
