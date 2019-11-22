
public class Battle {

	private static int numTurns;
	
	public static void setTurns(int num)
	{
		numTurns = num;
	}
	
	public static int getNumTurns()
	{
		return numTurns;
	}
	
	public static void battle(DungeonCharacter theHero, DungeonCharacter theMonster)
	{
		char pause = 'p';
		System.out.println(theHero.getName() + " battles " +
							theMonster.getName());
		System.out.println("---------------------------------------------");

		//do battle
		while (theHero.isAlive() && theMonster.isAlive() && pause != 'q')
		{
		    //hero goes first
			Battle.battleChoices(theHero, theMonster);

			//monster's turn (provided it's still alive!)
			if (theMonster.isAlive())
			    theMonster.attack(theHero);

			//let the player bail out if desired
			System.out.print("\n-->q to quit, anything else to continue: ");
			pause = Keyboard.readChar();

		}//end battle loop

		if (!theMonster.isAlive())
		    System.out.println(theHero.getName() + " was victorious!");
		else if (!theHero.isAlive())
			System.out.println(theHero.getName() + " was defeated :-(");
		else//both are alive so user quit the game
			System.out.println("Quitters never win ;-)");

	}//end battle method
	
	private static int numTurns(DungeonCharacter hero, DungeonCharacter monster)
	{
		setTurns(hero.getAttackSpeed() / monster.getAttackSpeed());
		
		if(numTurns == 0)
			numTurns++;
		System.out.println("Number of turns this round is: " + numTurns);
		
		return numTurns;
	}
	
    public static void battleChoices(DungeonCharacter hero, DungeonCharacter opponent)
	{
		//int choice;

		numTurns = numTurns(hero, opponent);

		do
		{
			choices(hero, opponent);

			numTurns--;
			if (numTurns > 0)
			    System.out.println("Number of turns remaining is: " + numTurns);

		} while(numTurns > 0);

    }//end battleChoices method
    
    private static void choices(DungeonCharacter hero, DungeonCharacter opponent)
    {
    	int choice;
    	if(hero.getType().equals("Warrior"))
    	{
    		Warrior theHero = (Warrior)hero;
		    System.out.println("1. Attack Opponent");
		    System.out.println("2. Crushing Blow on Opponent");
		    System.out.print("Choose an option: ");
		    choice = Keyboard.readInt();

		    
		    switch (choice)
		    {
			    case 1: theHero.attack(opponent);
			        break;
			    case 2: theHero.crushingBlow(opponent);
			        break;
			    default:
			        System.out.println("invalid choice!");
		    }//end switch
    	}
    	else if(hero.getType().equals("Sorceress"))
    	{
    		Sorceress theHero = (Sorceress)hero;
		    System.out.println("1. Attack Opponent");
		    System.out.println("2. Increase Hit Points");
		    System.out.print("Choose an option: ");
		    choice = Keyboard.readInt();

		    switch (choice)
		    {
			    case 1: theHero.attack(opponent);
			        break;
			    case 2: theHero.increaseHitPoints();
			        break;
			    default:
			        System.out.println("invalid choice!");
		    }//end switch
    	}
    	else if(hero.getType().equals("Thief"))
    	{
    		Thief theHero = (Thief)hero;
		    System.out.println("1. Attack Opponent");
		    System.out.println("2. Surprise Attack");
		    System.out.print("Choose an option: ");
		    choice = Keyboard.readInt();

		    switch (choice)
		    {
			    case 1: theHero.attack(opponent);
			        break;
			    case 2: theHero.surpriseAttack(opponent);
			        break;
			    default:
			        System.out.println("invalid choice!");
		    }//end switch
    	}
    }
}
