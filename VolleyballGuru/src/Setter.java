

public class Setter extends Offensive {
  protected boolean setHitters;
  protected boolean decidePlays;
  protected String categoryName = "setters "; 


	private String purpose = " Decidse and execute the best plays for a situation";
  private String position = "Setter";



	





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

