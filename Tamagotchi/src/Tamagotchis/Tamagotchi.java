package Tamagotchis;

/* **********************************************************
 * Programmer:	Caleb Beynon
 * Class:		CS30S
 * 
 * Assignment:	4: 2
 *
 * Description:	describe the class you are creating
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class Tamagotchi
 {  // begin class
	 
	 public enum Stage{
		 Baby, Toddler, Teenager,
		 Adult, Senior, Death
	 }
	 
	// ********** instance variable **********
	 
	 private String name = "";			// name of tamagotchi
	 private int age = 0;				// age of tamagotchi
	 private Stage lifeStage = null;	// current stage of tamagotchi's life
	 
	 private int[] clock = new int[2];	// current time since creation of tamagotchi

	 private int[] sRange = new int[2];	// range  of needs schedule
	 
	 private int hunger = 100;		// hunger meter
 	
 	// ********** constructors ***********
	 
	 /*****************************************************
	  * Purpose: create person object
	  * Interface: IN:	name n: string
	  * 				age a: int
	  * 				lifeStage l: Stage
	  * 				minRange r1: int
	  * 				maxRange r2: int
	  * Returns: none
	  * *****************************************************/
	 public Tamagotchi(String n, int a, Stage l, int r1, int r2) {
		 name = n;
		 age = a;
		 lifeStage = l;
		 sRange[0] = r1;
		 sRange[1] = r2;
	 } // end constructor
 	
 	// ********** accessors **********
	 
	 /*****************************************************
	  * Purpose: get name
	  * Interface: IN:	none
	  * Returns: name: string
	  * *****************************************************/
	 public String getName() {
		 return this.name;
	 } // end getName
	 
	 /*****************************************************
	  * Purpose: get age
	  * Interface: IN:	none
	  * Returns: age: int
	  * *****************************************************/
	 public int getAge() {
		 return this.age;
	 } // end getAge
	 
	 /*****************************************************
	  * Purpose: get hunger
	  * Interface: IN:	none
	  * Returns: hunger: int
	  * *****************************************************/
	public int getHunger() {
		return hunger;
	} // end getHunger
	
	/*****************************************************
	  * Purpose: get schedule range
	  * Interface: IN:	none
	  * Returns: sRange: int[]
	  * *****************************************************/
	public int[] getRange() {
		return sRange;
	} // end getRange
	
	/*****************************************************
	  * Purpose: check to see if a meter is equal to n
	  * Interface: IN:	n: int
	  * Returns: boolean
	  * *****************************************************/
	public boolean checkMeterz(int n) {
		if (this.getHunger() <= n) {
			return true;
		}
		else{
			return false;
		}
	} // end getMeterz
 	
 	// ********** mutators **********
	 
	 /*****************************************************
	  * Purpose: set name
	  * Interface: IN:	name n: string
	  * Returns: none
	  * *****************************************************/
	 public void setName(String n) {
		 this.name = n;
	 } // end setName
	 
	 /*****************************************************
	  * Purpose: set age
	  * Interface: IN:	age a: int
	  * Returns: none
	  * *****************************************************/
	 public void setAge(int a) {
		 this.age = a;
	 } // end setAge
	 
	 /*****************************************************
	  * Purpose: set life stage
	  * Interface: IN:	stage s: Stage
	  * Returns: none
	  * *****************************************************/
	 public void setStage(Stage s) {
		 this.lifeStage = s;
	 } // end setStage
	 
	 /*****************************************************
	  * Purpose: set schedule range
	  * Interface: IN:	minRange r1: int
	  * 				maxRange r2: int
	  * Returns: none
	  * *****************************************************/
	 public void setRange(int r1, int r2) {
		 sRange[0] = r1;
		 sRange[1] = r2;
	 } // end setRange
	 
	 /*****************************************************
	  * Purpose: increment hunger
	  * Interface: IN:	hunger incrementer: h
	  * Returns: none
	  * *****************************************************/
	 public void incHunger(int h) {
		 this.hunger += h;
	 } // end incHunger
	 
	 /*****************************************************
	  * Purpose: increment all meters
	  * Interface: IN:	incrementer i: int
	  * Returns: none
	  * *****************************************************/
	 public void incMeters(int i) {
		 this.incHunger(i);	// increment hunger
	 } // end incMeters
 
 }  // end class