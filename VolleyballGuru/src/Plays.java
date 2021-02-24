
public class Plays {
	public static boolean viewPlays = true;
	public static String firstTouch;
	public static String secondTouch;
	public static String thirdTouch;
	public static String setDetails;

	public static String one;
	public static String two;
	public static String three;
	public static String four;
	public static String five;
	public static String six;
	public static String set;
	
	public static String b1;
	public static String b2;
	public static String b3;
	public static String b4;
	public static String b5;
	public static String b6;
	public static String bS;
	
	public static String one2;
	public static String two2;
	public static String three2;
	public static String four2;
	public static String five2;
	public static String six2 ;
	public static String set2;
	
	public static String b12 ;
	public static String b22;
	public static String b32;
	public static String b42;
	public static String b52;
	public static String b62;
	public static String bS2;
	
	public static String one3;
	public static String two3;
	public static String three3;
	public static String four3;
	public static String five3;
	public static String six3;
	public static String set3;
	
	public static String b13;
	public static String b23 ;
	public static String b33;
	public static String b43;
	public static String b53;
	public static String b63;
	public static String bS3;
	public static String run3;
	public static String runB;
	
	public static String L = "Libero";
	public static String S = "Setter";
	public static String O = "Outside";
	public static String R = "Rightside";
	public static String M = "Middle";
	public static String DS = "Defensive Specialist";






	public static void plays(){
		while (viewPlays = true){
			 one = " ";
			 two = " ";
			 three = " ";
			 four = " ";
			 five = "  ";
			 six = " ";
			 set = " ";
			
			 b1 = " ";
			 b2 = " ";
			 b3 = " ";
			 b4 = " ";
			 b5 = " ";
			 b6 = " ";
			 bS = " ";
			
			 one2 = " ";
			 two2 = " ";
			 three2 = " ";
			 four2 = " ";
			 five2 = "  ";
			 six2 = " ";
			 set2 = " ";
			
			 b12 = " ";
			 b22 = " ";
			 b32 = " ";
			 b42 = " ";
			 b52 = " ";
			 b62 = " ";
			 bS2 = " ";
			
			 one3 = " ";
			 two3 = " ";
			 three3 = " ";
			 four3 = " ";
			 five3 = "  ";
			 six3 = " ";
			 set3 = " ";
			
			 b13 = " ";
			 b23 = " ";
			 b33 = " ";
			 b43 = " ";
			 b53 = " ";
			 b63 = " ";
			 bS3 = " ";
			 run3 = " ";
			 runB = " ";
			 
		System.out.println("Select which plays you would like to look at: ");
		System.out.println(" \t(1) Setter-Libero Plays");
		System.out.println(" \t(2) Setter-DS Plays");
		System.out.println(" \t(3) Setter-Outside Plays");
		System.out.println(" \t(4) Setter-Middle Plays");
		System.out.println(" \t(5) Setter-Rightside Plays");
		System.out.println(" \t(6) Out-of-System Plays");
		
		int choicePlay = Main.input.nextInt();
		switch(choicePlay) {
		case 1: 
			System.out.println("One play can be run with the setter and the libero: White Offense");
			firstTouch = L;
			secondTouch = S;
			thirdTouch = L;
			setDetails = "with a high arc";
			
			six = "L";
			b6 = "o";
			
			one2 = "S";
			b12 = "o";
			
			six3 = "L";
			b63 = "o";
			
			playExplain();
			break;
			
		case 2: 
			System.out.println("One play can be run with the setter and the DS: Red Offense");
			firstTouch = L;
			secondTouch = S;
			thirdTouch = DS;
			setDetails = "with a high arc";
			
			six = "L";
			b6 = "o";
			
			one2 = "S";
			b12 = "o";
			
			five3 = "DS";
			b53 = "o";
			
			playExplain();
			break;
			
		case 3: 
			System.out.println("Three plays can be run with the Setter and the Outside. \nWould you like to: ");
			System.out.println("(1) Run a 5");
			System.out.println("(2) Run a 4");
			System.out.println("(3) Run a 3");
			
			int OP = Main.input.nextInt();
			switch (OP) {
			case 1:
				firstTouch = L;
				secondTouch = S;
				thirdTouch = " Outside-Hitter moves at third-tempo (some-what fast) pace, makes contact with the ball 2 feet above the net, and";
				setDetails = "with a high arc";
				
				six = "L";
				b6 = "o";
				
				set2 = "S";
				bS2 = "o";
				
				four3 = "O";
				b43 = "o";
				
				playExplain();
				break;
				
			case 2: 
			firstTouch = L;
			secondTouch = S;
			thirdTouch = " Outside-Hitter moves at first-tempo (really fast) pace, makes contact with the ball 1 foot above the net, and";
			setDetails = "with a low arc";
			
			six = "L";
			b6 = "o";
			
			set2 = "S";
			bS2 = "o";
			
			four3 = "O";
			b43 = "o";
			
			playExplain();
			break;
			
			case 3: 
				firstTouch = L;
				secondTouch = S;
				thirdTouch = " Outside-Hitter moves at second-tempo (pretty fast) pace, makes contact with the ball 2 feet above the net, and";
				setDetails = "with a high arc in between the Outide and Middle";
				
				six = "L";
				b6 = "o";
				
				set2 = "S";
				bS2 = "o";
				
				four3 = "O";
				run3 = "o";
				
				playExplain();
				break;
			}
			break;
		case 4: 
			//middle
			System.out.println("Three plays can be run with the Setter and the Middle. \tWould you like to: ");
			System.out.println("(1) Run a 1");
			System.out.println("(2) Run a 2");
			System.out.println("(3) Run a 3");
			
			int OPM = Main.input.nextInt();
			switch (OPM) {
			case 1:
				firstTouch = L;
				secondTouch = S;
				thirdTouch = " Middle-Hitter moves at first-tempo (very fast) pace, makes contact with the ball as soon as it leaves the setter's hands, and";
				setDetails = "right infront of the Middle's hand";
				
				six = "L";
				b6 = "o";
				
				set2 = "S";
				bS2 = "o";
				
				three3 = "M";
				b33 = "o";
				
				playExplain();
				break;
				
			case 2: 
			firstTouch = L;
			secondTouch = S;
			thirdTouch = " Middle-Hitter moves at third-tempo (some-what fast) pace, makes contact with the ball 2 feet above the net, and";
			setDetails = "with a medium-high arc";
			
			six = "L";
			b6 = "o";
			
			set2 = "S";
			bS2 = "o";
			
			three3 = "M";
			b33 = "o";
			
			playExplain();
			break;
			
			case 3: 
				firstTouch = L;
				secondTouch = S;
				thirdTouch = " Middle-Hitter moves at third-tempo (some-what fast) pace, makes contact with the ball 2 feet above the net, and";
				setDetails = "with a high arc in between the Outide and Middle";
				
				six = "L";
				b6 = "o";
				
				set2 = "S";
				bS2 = "o";
				
				three3 = "M";
				run3 = "o";
				
				playExplain();
				break;
			}
			break;
		case 5:
			//rightside
			System.out.println("Two plays can be run with the Setter and the Rightside. \tWould you like to: ");
			System.out.println("(1) Run a C");
			System.out.println("(2) Run a B");
			
			int OPR = Main.input.nextInt();
			switch (OPR) {
			case 1:
				firstTouch = L;
				secondTouch = S;
				thirdTouch = " Rightside-Hitter moves at third-tempo (some-what fast) pace, makes contact with the ball 2 feet above the net, and";
				setDetails = "with a high arc";
				
				six = "L";
				b6 = "o";
				
				set2 = "S";
				bS2 = "o";
				
				two3 = "R";
				b33 = "o";
				
				playExplain();
				break;
				
			case 2: 
				firstTouch = L;
				secondTouch = S;
				thirdTouch = " Rightside-Hitter moves at second-tempo (pretty fast) pace, makes contact with the ball 1-1/2 feet above the net, and";
				setDetails = "with a high arc in between the Middle and Rightside";
				
				six = "L";
				b6 = "o";
				
				set2 = "S";
				bS2 = "o";
				
				four3 = "R";
				runB = "o";
				
				playExplain();
				break;
			}
			break;
		case 6:
			//outofsystem
			System.out.println("An Out-Of-System play is when the Setter passes the first ball, so the Libero has to set. \n Two plays can be run Out-Of-System. \tWould you like to: ");
			System.out.println("(1) Run an Out-Of-System 5");
			System.out.println("(2) Run an Out-Of-System C");
			
			int OPO = Main.input.nextInt();
			switch (OPO) {
			case 1:
				firstTouch = S;
				secondTouch = L;
				thirdTouch = " Outside-Hitter moves at third-tempo (some-what fast) pace, makes contact with the ball 2 feet above the net, and";
				setDetails = "with a superhigh arc, 5 feet away from the net";
				
				one = "S";
				b1 = "o";
				
				six2 = "L";
				b62 = "o";
				
				four3 = "O";
				b43 = "o";
				
				playExplain();
				break;
				
			case 2:
				
				firstTouch = S;
				secondTouch = L;
				thirdTouch = " Rightside-Hitter moves at third-tempo (some-what fast) pace, makes contact with the ball 2 feet above the net, and";
				setDetails = "with a superhigh arc, 5 feet away from the net";
				
				one = "S";
				b1 = "o";
				
				six2 = "L";
				b62 = "o";
				
				four3 = "R";
				b43 = "o";
				
				playExplain();
				break;
			}
			break;			
			



		}





	}
	}
	public static void playExplain() {
		System.out.println("The ball starts at the " + firstTouch + " who passes it to the " + secondTouch);
		playCourt1();
		System.out.println("Then the " + secondTouch + " sets it " + setDetails);
		playCourt2();
		System.out.println("Lastly, the " + thirdTouch + " hits it to the other team");
		playCourt3();


	}
	public static void playCourt1() {
		System.out.println("__________________");
		System.out.println("|                 |");
		System.out.println("|  1     6     5  |");
		System.out.println("|                 |");
		System.out.println("|  2     3     4  |");
		System.out.println("|                 |");
		System.out.println("|-----------------|");
		System.out.println("|  " + b4 + "     " + b3 + "  " + bS +"   " + b2 + " |");
		System.out.println("|  " + four + "     " + three + "  " + set +"   " + two + " |");
		System.out.println("|  " + b5 + "     " + b6 + "     " + b1 + "  |");
		System.out.println("|  " + five + "    " + six + "     " + one + "  |");
		System.out.println("__________________");
		
	}

	public static void playCourt2() {
		System.out.println("__________________");
		System.out.println("|                 |");
		System.out.println("|  1     6     5  |");
		System.out.println("|                 |");
		System.out.println("|  2     3     4  |");
		System.out.println("|                 |");
		System.out.println("|-----------------|");
		System.out.println("|  " + b42 + "     " + b32 + "  " + bS2 +"   " + b22 + " |");
		System.out.println("|  " + four2 + "     " + three2 + "  " + set2 +"   " + two2 + " |");
		System.out.println("|  " + b52 + "     " + b62 + "     " + b12 + "  |");
		System.out.println("|  " + five2 + "    " + six2 + "     " + one2 + "  |");
		System.out.println("__________________");
		
	}
	public static void playCourt3() {
		System.out.println("__________________");
		System.out.println("|                 |");
		System.out.println("|  1     6     5  |");
		System.out.println("|                 |");
		System.out.println("|  2     3     4  |");
		System.out.println("|                 |");
		System.out.println("|-----------------|");
		System.out.println("|  " + b43 + "  "+ run3 + " " + b33 + "  " + bS3 +" " + runB + "  " + b23 + " |");
		System.out.println("|  " + four3 + "    " + three3 + "  " + set3 +"   " + two3 + "  |");
		System.out.println("|  " + b53 + "     " + b63 + "     " + b13 + "  |");
		System.out.println("|  " + five3 + "    " + six3 + "     " + one3 + "  |");
		System.out.println("__________________");
		
	}

}
