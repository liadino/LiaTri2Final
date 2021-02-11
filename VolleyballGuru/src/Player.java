public abstract class Player
	{
protected String intro = "As ";
protected String purpose = "to win the game";
protected String position = "Volleyball Players";

protected abstract void getPurpose();
protected abstract void getPosition();





public void playVolleyball()
{			 		
System.out.print(intro + position);
System.out.println(", we love volleyball!");
}         
}

