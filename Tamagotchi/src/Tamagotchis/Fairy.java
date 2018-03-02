package Tamagotchis;

import Tamagotchis.Humanoid.Career;
import Tamagotchis.Humanoid.SubRace;
import Tamagotchis.Tamagotchi.Stage;

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
 
 
 public class Fairy extends Humanoid
 {	// begin class
 	
 	// *********** class variable **********
 	
 	
 	// ********** instance variable **********
 	
	 private int luck = 100;	// fairy luck meter
	 
 	// ********** constructors ***********
 	
	 /*****************************************************
	  * Purpose: create person object
	  * Interface: IN:	name n: string
	  * 				age a: int
	  * 				lifeStage l: Stage
	  * 				race r: SubRace
	  * 				career c: Career
	  * 				race s: SubRace
	  * 				income i: double
	  * 					*
	  * Returns: none
	  * *****************************************************/
	 public Fairy(String n, int a, Stage l, Career c, SubRace s, double i) {
		 super(n, a, l, c, s, i);
	 } // end constructor
	 
 	// ********** accessors **********
 	
	 /*****************************************************
	  * Purpose: get luck
	  * Interface: IN:	none
	  * Returns: luck: int
	  * *****************************************************/
	 public int getLuck() {
		 return luck;
	 } // end getLuck
	 
 	// ********** mutators **********
 
	 /*****************************************************
	  * Purpose: increment luck
	  * Interface: IN:	luck incrementer u: int
	  * Returns: none
	  * *****************************************************/
	 public void incLuck(int u) {
		 this.luck += u;
	 } // end incLuck
	 
	 /*****************************************************
	  * Purpose: increment all meters
	  * Interface: IN:	incrementer i: int
	  * Returns: none
	  * *****************************************************/
	 public void incMeters(int i) {
		 this.incHunger(i);	// increment hunger
		 this.incHappy(i);	// increment happiness
		 this.incLuck(i);	// increment luck
	 } // end incMeters
	 
 }  // end class