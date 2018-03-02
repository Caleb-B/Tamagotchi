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
 
 
 public class Beast extends Tamagotchi
 {  // begin class
 	
	 public enum Type{
		 Dog, Cat, Bird
	 }
	 
 	// *********** class variable **********
 	
	 private static int nextID = 100;
 	
 	// ********** instance variable **********
	 
	 private int beastId = 0;	// unique id
	 private Type type = null;	// type of animal tamagotchi
	 
	 private int cleanliness = 100;	// cleanliness meter
 	
 	// ********** constructors ***********
 	
	 /*****************************************************
	  * Purpose: create person object
	  * Interface: IN:	name n: string
	  * 				age a: int
	  * 					*
	  * 				type t: Type
	  * Returns: none
	  * *****************************************************/
	 public Beast(String n, int a, Stage l, Type t) {
		 super(n, a, l);
		 
		 // 
		 beastId = nextID++;	// set and increment id for beast
		 type = t;
	 } // end constructor
	 
 	// ********** accessors **********

	/*****************************************************
	  * Purpose: get beastId
	  * Interface: IN:	none
	  * Returns: beastId: int
	  * *****************************************************/
	public int getBeastId() {
		return beastId;
	} // end getBeastId

	/*****************************************************
	  * Purpose: get cleanliness
	  * Interface: IN:	none
	  * Returns: cleanliness: int
	  * *****************************************************/
	public int getClean() {
		return cleanliness;
	} // end getClean

	/*****************************************************
	  * Purpose: get type
	  * Interface: IN:	none
	  * Returns: type: Type
	  * *****************************************************/
	public Type getType() {
		return type;
	} // end getType
	
 	// ********** mutators **********

	/*****************************************************
	  * Purpose: set type
	  * Interface: IN:	type t: Type
	  * Returns: none
	  * *****************************************************/
	public void setType(Type type) {
		this.type = type;
	} // end setType

	/*****************************************************
	  * Purpose: increment cleanliness
	  * Interface: IN:	clean incrementer c: int
	  * Returns: none
	  * *****************************************************/
	 public void incClean(int c) {
		 this.cleanliness += c;
	 } // end incClean
	 
	 /*****************************************************
	  * Purpose: increment all meters
	  * Interface: IN:	incrementer i: int
	  * Returns: none
	  * *****************************************************/
	 public void incMeters(int i) {
		 this.incHunger(i);	// increment hunger
		 this.incClean(i);	// increment Cleanliness
	 } // end incMeters
	 
 }  // end class