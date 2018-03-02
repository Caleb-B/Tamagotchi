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
	 
	 private int hunger = 100;		// hunger meter
 	
 	// ********** constructors ***********
	 
	 /*****************************************************
	  * Purpose: create person object
	  * Interface: IN:	name n: string
	  * 				age a: int
	  * 				lifeStage l: Stage
	  * Returns: none
	  * *****************************************************/
	 public Tamagotchi(String n, int a, Stage l) {
		 name = n;
		 age = a;
		 lifeStage = l;
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
 	
 	// ********** mutators **********
	 
	 /*****************************************************
	  * Purpose: set name
	  * Interface: IN:	name: string
	  * Returns: none
	  * *****************************************************/
	 public void setName(String n) {
		 this.name = n;
	 } // end setName
	 
	 /*****************************************************
	  * Purpose: set age
	  * Interface: IN:	age: int
	  * Returns: none
	  * *****************************************************/
	 public void setAge(int a) {
		 this.age = a;
	 } // end setAge
	 
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