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
	 
	// ********** instance variable **********
	 
	 private String name = "";		// name of tamagotchi
	 private int age = 0;			// age of tamagotchi
 	
 	// ********** constructors ***********
	 
	 /*****************************************************
	  * Purpose: create person object
	  * Interface: IN:	name n: string
	  * 				age a: int
	  * Returns: none
	  * *****************************************************/
	 public Tamagotchi(String n, int a) {
		 name = n;
		 age = a;
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
 
 }  // end class