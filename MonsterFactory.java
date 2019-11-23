public class MonsterFactory {

	public DungeonCharacter makeMonster(int selection) {
		switch(selection) {
		
			
			case 1: return new Hero("Gremlin", 70, 5, .8, .4, 15, 30, 20, 50, SpecialAttack.invisibleAttack());

			case 2: return new Hero("Ogre", 200, 2, .6, .1, 30, 50, 30, 100, SpecialAttack.healing(25, 50));

			case 3: return new Hero("Skeleton", 100, 3, .8, .3, 30, 100, 30, 50, SpecialAttack.spellAttack());
			
			default: System.out.println("Invalid selection, defulting to Skeleton");
					return new Hero("Skeleton", 100, 3, .8, .3, 30, 100, 30, 50, SpecialAttack.getSuprise());
		}//end switch
	}
	
	public Monster creatingMonster()
	{
		int choice;

		choice = (int)(Math.random() * 5) + 1;

		return (Monster)makeMonster(choice);
	}//end generateMonster method
}