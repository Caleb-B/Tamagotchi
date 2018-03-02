package Tamagotchis;

import Tamagotchis.Humanoid.Career;
import Tamagotchis.Humanoid.SubRace;
import Tamagotchis.Tamagotchi.Stage;

/* **********************************************************
 * Programmer:	Caleb Beynon
 * Class:		CS30S
 * 
 * Assignment:	4: 2
 *
 * Description:	Fairy sub-class of humanoid
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class Fairy extends Humanoid
 {	// begin class
 	
 	// *********** class variable **********
 	
 	
 	// ********** instance variable **********
 	
	 private int luck = 85;	// fairy luck meter
	 
 	// ********** constructors ***********
 	
	 /*****************************************************
	  * Purpose: create person object
	  * Interface: IN:	name n: string
	  * 				age a: int
	  * 				lifeStage l: Stage
	  * 				minRange r1: int
	  * 				maxRange r2: int
	  * 				race r: SubRace
	  * 				career c: Career
	  * 				race s: SubRace
	  * 				income i: double
	  * 					*
	  * Returns: none
	  * *****************************************************/
	 public Fairy(String n, int a, Stage l, int r1, int r2, Career c, SubRace s, double i) {
		 super(n, a, l, r1, r2, c, s, i);
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
		 else if (this.getLuck() <= n) {
			 return true;
		 }
		 else{
			 return false;
		 }
	 } // end getMeterz
	 
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