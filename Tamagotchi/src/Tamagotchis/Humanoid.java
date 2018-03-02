package Tamagotchis;

/* **********************************************************
 * Programmer:	Caleb Beynon
 * Class:		CS30S
 * 
 * Assignment:	4: 2
 *
 * Description:	Humanoid sub-class of tamagotchi
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class Humanoid extends Tamagotchi
 {  // begin class
	 
	 public enum Career{
		 Miner, Merchant, Alchemist
	 }
	 
	 public enum SubRace{
		 Fairy, Dwarf
	 }
	 
 	// *********** class variable **********
 	
	 private static int nextID = 1000;
	 
 	// ********** instance variable **********
 	
	 private int humanoidId = 0;	// unique id
	 private Career career = null;	// job
	 private SubRace race = null;	// sub race
	 private double income = 0;		// daily income
	 
	 private int happiness = 75;	// happiness meter
	 
 	// ********** constructors ***********
	 
	 /*****************************************************
	  * Purpose: create person object
	  * Interface: IN:	name n: string
	  * 				age a: int
	  * 				lifeStage l: Stage
	  * 				minRange r1: int
	  * 				maxRange r2: int
	  * 					*
	  * 				race r: SubRace
	  * 				career c: Career
	  * 				race s: SubRace
	  * 				income i: double
	  * Returns: none
	  * *****************************************************/
	 public Humanoid(String n, int a, Stage l, int r1, int r2, Career c, SubRace s, double i) {
		 super(n, a, l, r1, r2);
		 
		 // 
		 humanoidId = nextID++;		// set and increment id for humanoid
		 career = c;
		 race = s;
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
	  * Purpose: get career
	  * Interface: IN:	none
	  * Returns: career: Career
	  * *****************************************************/
	 public Career getCareer() {
		 return career;
	 } // end getCareer

	 /*****************************************************
	  * Purpose: get race
	  * Interface: IN:	none
	  * Returns: race: SubRace
	  * *****************************************************/
	 public SubRace getRace() {
		 return race;
	 } // end getRace
	 
	 /*****************************************************
	  * Purpose: get income
	  * Interface: IN:	none
	  * Returns: income: double
	  * *****************************************************/
	 public double getIncome() {
		 return income;
	 } // end getIncome
	 
	 /*****************************************************
	  * Purpose: get happiness
	  * Interface: IN:	none
	  * Returns: happiness: int
	  * *****************************************************/
	 public double getHappy() {
		 return happiness;
	 } // end getHappy
	 
	 /*****************************************************
	  * Purpose: check to see if a meter is equal to n
	  * Interface: IN:	n: int
	  * Returns: boolean
	  * *****************************************************/
	 public boolean checkMeterz(int n) {
		 if (this.getHunger() <= n) {
			 return true;
		 }
		 else if (this.getHappy() <= n) {
			 return true;
		 }
		 else{
			 return false;
		 }
	 } // end getMeterz
	 
	// ********** mutators **********

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
	 
	 /*****************************************************
	  * Purpose: increment cleanliness
	  * Interface: IN:	happy incrementer: h
	  * Returns: none
	  * *****************************************************/
	 public void incHappy(int h) {
		 this.happiness += h;
	 } // end incHappy
	 
	 /*****************************************************
	  * Purpose: increment all meters
	  * Interface: IN:	incrementer i: int
	  * Returns: none
	  * *****************************************************/
	 public void incMeters(int i) {
		 this.incHunger(i);	// increment hunger
		 this.incHappy(i);	// increment happiness
	 } // end incMeters
 
 }  // end class
