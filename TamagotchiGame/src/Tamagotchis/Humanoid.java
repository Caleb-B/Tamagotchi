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
 	
	 private int humanoidId = 0;	// unique id
	 private SubRace race = null;	// humanoid race
	 private Career career = null;	// job
	 private double income = 0;		// daily income
	 
 	// ********** constructors ***********
	 
	 /*****************************************************
	  * Purpose: create person object
	  * Interface: IN:	name n: string
	  * 				age a: int
	  * 					*
	  * 				race r: SubRace
	  * 				career c: Career
	  * 				income i: double
	  * Returns: none
	  * *****************************************************/
	 public Humanoid(String n, int a, SubRace r, Career c, double i) {
		 super(n, a);
		 
		 // 
		 humanoidId = nextID++;		// set and increment id for humanoid
		 race = r;
		 career = c;
		 income = i;
	 } // end constructor
	 
 	// ********** accessors **********
	 
	 /*****************************************************
	  * Purpose: get id
	  * Interface: IN:	none
	  * Returns: humanoidId: int
	  * *****************************************************/
	 public int getId() {
		 return this.humanoidId;
	 } // end getId

	 /*****************************************************
	  * Purpose: get race
	  * Interface: IN:	none
	  * Returns: race: SubRace
	  * *****************************************************/
	 public SubRace getRace() {
		 return race;
	 } // end getRace

	 /*****************************************************
	  * Purpose: get career
	  * Interface: IN:	none
	  * Returns: career, Career
	  * *****************************************************/
	 public Career getCareer() {
		 return career;
	 } // end getCareer

	 /*****************************************************
	  * Purpose: get income
	  * Interface: IN:	none
	  * Returns: income: double
	  * *****************************************************/
	 public double getIncome() {
		 return income;
	 } // end getIncome
	 
	// ********** mutators **********

	 /*****************************************************
	  * Purpose: set race
	  * Interface: IN:	race r: SubRace
	  * Returns: none
	  * *****************************************************/
	 public void setRace(SubRace r) {
		 this.race = r;
	 } // end setRace

	 /*****************************************************
	  * Purpose: set career
	  * Interface: IN:	career c: Career
	  * Returns: none
	  * *****************************************************/
	 public void setCareer(Career c) {
		 this.career = c;
	 } // end setCareer

	 /*****************************************************
	  * Purpose: set income
	  * Interface: IN:	income i: double
	  * Returns: none
	  * *****************************************************/
	 public void setIncome(double i) {
		 this.income = i;
	 } // end setIncome
 
 }  // end class