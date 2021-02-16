
public class Hitter extends Offensive
	{
protected  String spike;
protected boolean approach;

private String purpose = "get kills";
protected String categoryName = "hitters "; 
private String position = "Outsides, Middles, and Rightsides";

@Override
protected void getPurpose(){
System.out.print(intro + categoryName);

System.out.println(", our purpose is to " + purpose);
System.out.println("We are also supposed to " + super.purpose);
}
@Override
protected void getPosition(){
System.out.println("Possible positions are: " + position);
System.out.println("We work with all the " + super.position);
}

protected void getKill() {
System.out.println("Way to go!");
}
}


