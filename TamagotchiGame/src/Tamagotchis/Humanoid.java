package Tamagotchis;

/* **********************************************************
 * Programmer:	Caleb Beynon
 * Class:		CS30S
 * 
 * Assignment:	aX  qY
 *
 * Description:	describe the class you are creating
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class Humanoid extends Tamagotchi
 {  // begin class
 	
	 public enum SubRace{
		 Elf, Dwarf, Mermaid
	 }
	 
	 public enum Career{
		 Miner, Merchant, Alchemist
	 }
	 
 	// *********** class variable **********
 	
	 private static int nextID = 1000;
	 
 	// ********** instance variable **********
 	
	 private int humanoidId = 0;
	 private SubRace race = null;
	 private Career career = null;
	 private int income = 0;		// daily income
	 
 	// ********** constructors ***********
	 
	 /*****************************************************
	  * Purpose: create person object
	  * Interface: IN:	name n: string
	  * 				age a: int
	  * 					*
	  * 				race r: SubRace
	  * 				career c: Career
	  * 				income i: int
	  * Returns: none
	  * *****************************************************/
	 public Humanoid(String n, int a, SubRace r, Career c, int i) {
		 super(n, a);
		 
		 // 
		 humanoidId = nextID++;		// set and increment id for humanoid
		 race = r;
		 career = c;
		 income = i;
	 } // end constructor
	 
 	// ********** accessors **********
 	
 	// ********** mutators **********
 
 }  // end class