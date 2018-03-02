package Client;

import javax.swing.JOptionPane;

import Tamagotchis.*;
import Tamagotchis.Tamagotchi.*;

/* **********************************************************
 * Programmer:	Caleb Beynon
 * Class:		CS30S
 * 
 * Assignment:	4: 2
 *
 * Description:	manages tamagotchi object
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class MultiThreader extends Thread
 {  // begin class
 	
	 private Tamagotchi tama = null;	// Tamagotchi object
	 
	 private int meter = 100;	// default meter value
	 
	 private int rand = 0;
	 
	 public MultiThreader(Tamagotchi t) {
		 tama = t;
		 rand = (int) (Math.random() * (tama.getRange()[1] - tama.getRange()[0])) + tama.getRange()[0];
		 //System.out.println(rand);
	 } // end constructor
	 
	 public void run() {
		 System.out.println("Tamagotchi " + tama.getName() + " is born...");
		 while (meter != 0) {

			 try {
				Thread.sleep((long)rand * 10);
			 } catch (InterruptedException e) {
				System.out.println("error");
			 }
			 
			 tama.incMeters(-5);
			 
			 if (tama.checkMeterz(25) == true) {	// check tamagotchi's needs
				 if (JOptionPane.showConfirmDialog(null, "" + tama.getName() + " is Hungry", "Feed " + tama.getName(), 0) == 0) {
					 tama.incMeters(50);
				 }
			 }
			 
			 if (tama.checkMeterz(0) == true) {	// check to see if tamagotchi is dead
				 meter = 0;
			 }
		 }
		 
		 tama.setStage(Stage.Death);	// set tamagotchi to dead
		 System.out.println("Tamagotchi is dead");
		 
	 }  // end run
 
 }  // end class