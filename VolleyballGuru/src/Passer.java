
public class Passer extends Defensive{


protected  String pass;
protected boolean dive;

private String purpose = "stop the ball from hitting the floor";
protected String categoryName = "passers "; 
private String position = "Libero and Defensive Specialist";

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


}
