import java.util.Scanner;

public class Main {
	public static int role;
	public static Scanner input = new Scanner(System.in);
	public static  Player  x;



	public static void main(String[] args) {

		welcome();

	}
	private static void welcome() {
		System.out.println("Hi! Welcome to the Volleyball Starter Assistant!");
		System.out.println("Are you (1) a beginner player or (2) a beginner coach?");
		 role = input.nextInt();
		 inputGallery.basicQs();
	}

}
