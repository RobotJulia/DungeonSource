
public class FireBall implements SpecialAttack{

	
	public void specialAttack(DungeonCharacter hero, DungeonCharacter opponent)
	{
		System.out.println(hero.getName() + " casts a spell of fireball at " +
				opponent.getName() + ":");
	}
}
