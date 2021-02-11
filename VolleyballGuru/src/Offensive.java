import liaFinal.Player;

public class Offensive extends Player
	{
protected String purpose = "gain points";
protected String categoryName = "offensive players ";
protected String position = "Outsides, Middles, Rightsides, Setters, and Blockers";

@Override
protected void getPurpose()
{
System.out.print(intro + categoryName);

System.out.println(", our purpose is to " + purpose + " and to " + super.purpose);
}
@Override
protected void getPosition()
{
System.out.println("Possible positions are: " + position + " and we work with all the " + super.position );
}


protected void Attacks() {
System.out.println("TAKE THAT!");
}
}
