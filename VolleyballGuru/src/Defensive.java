

public class Defensive extends Player {
 	protected boolean gainPoints;
  protected boolean runPlays;
  protected String categoryName = " defensive players "; 


	protected String purpose = " Prevent opponent from gaining points";
  protected String position = "Libero, Defensive Specialist";



	





	@Override
	protected void getPurpose() {
		System.out.print(intro + categoryName);

		System.out.println(", our purpose is to " + purpose);
		System.out.println("We are also supposed to " + super.purpose);
	}




	@Override
	protected void getPosition() {
		System.out.println("Possible positions are: " + position);
		System.out.println("We work with all the " + super.position);
		}
}
