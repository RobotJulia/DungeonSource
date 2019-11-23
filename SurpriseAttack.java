
public class SurpriseAttack implements SpecialAttack{
	
	public void specialAttack(DungeonCharacter hero, DungeonCharacter opponent)
	{
		System.out.println("Surprise attack was successful!\n" +
				hero.name + " gets an additional turn.");
		Battle.setTurns(Battle.getNumTurns() + 1);//numTurns++;
		hero.attack(opponent);
	}

}
