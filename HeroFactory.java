public class HeroFactory {

	public DungeonCharacter makeHero(int selection) {
		switch(selection) {
		
			
			case 1: return new Hero("Warrior", 125, 4, .8, 35, 60, " Attacking with surplus of rocks ", .2, SpecialAttack.invisibleAttack());

			case 2: return new Hero("Sorceress", 75, 5, .7, 25, 50, " Casting a magic healing spell", .3, SpecialAttack.Healing(25, 50));

			case 3: return new Hero("Thief", 75, 6, .8, 20, 40, " Magic Theif powers activated", .5, SpecialAttack.getSuprise());

			default: System.out.println("Invalid selection, defaulting to Thief");
					return new Hero("Thief", 75, 6, .8, 20, 40, " Magic Theif powers activated ", .5, SpecialAttack.shocking());
		}//end switch
	}
	
	
} 