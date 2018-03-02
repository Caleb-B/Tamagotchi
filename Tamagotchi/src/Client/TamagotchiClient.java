package Client;

// **********************************************************************
// Programmer:	Caleb Beynon
// Class:		CS30S
//
// Assignment:	4: 2
//
// Description:	a brief description of the program goes here
//
//
//	Input:		describe any input from keyboard or file
//
//  Output:		describe the result of your program
// ***********************************************************************

import javax.swing.*;

import Tamagotchis.*;
import Tamagotchis.Beast.*;
import Tamagotchis.Humanoid.*;
import Tamagotchis.Tamagotchi.*;

import java.text.DecimalFormat;

public class TamagotchiClient
{  // begin class
	public static void main(String args[])
	{  // begin main
	// ***** declaration of constants *****
	
	// ***** declaration of variables *****
		
    	String strin;				// string data input from keyboard
    	String strout;				// processed info string to be output
    	String bannerOut;			// string to print banner to message dialogs
    	
    	String prompt;				// prompt for use in input dialogs
    	
    	String delim = "[ :]+";		// delimiter string for splitting input string
    	String tabSpace = "      ";	// six spaces
    	
    	Tamagotchi[] tList = null;
        tList = new Tamagotchi[4];           	// array of tamagotchis
        int n = 0;                          	// tamagotchi object counter
        MultiThreader[] mList = null;
        mList = new MultiThreader[4];
        
    // create instances of objects for i/o and formatting
    
    	//ConsoleReader console = new ConsoleReader(System.in);
    	//DecimalFormat df1 = new DecimalFormat("$##.00");
		
     // ***** Print Banner *****
        
		ProgramInfo Printer = new ProgramInfo();	// create new printer object
    	
    	Printer.printBanner("4:", "2");	// print banner
    		
	// ***** create objects *****
		
		Tamagotchi fairy1 = new Fairy("Felicity", 0, Stage.Baby, 5, 20, Career.Merchant, SubRace.Fairy, 40.25);
		tList[0] = fairy1;
		
		Tamagotchi humanoid1 = new Humanoid("Greg", 0, Stage.Baby, 22, 40, Career.Miner, SubRace.Dwarf, 25.3);
		tList[1] = humanoid1;
		
		Tamagotchi tama1 = new Tamagotchi("Fin", 0, Stage.Baby, 15, 36);
		tList[2] = tama1;
		
		Tamagotchi beast1 = new Beast("Barkley", 0, Stage.Baby, 3, 15, Type.Dog);
		tList[3] = beast1;
		
		//MultiThreader m1 = new MultiThreader(tList[2]);
		//m1.run();
		
		for (int i = 0; i < 4; i++) {
			mList[i] = new MultiThreader(tList[i]);
			mList[i].run();
		}
		
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** get input *****
	
		// all input is gathered in this section
		// remember to put ConsoleReader.class into the
		// same folder.
	
	// ***** processing *****
	
		
	// ***** output *****
	
		// all formatted ouput is printed in this section

	// ***** closing message *****
	
		Printer.printClosing();
	
	}  // end main	
}  // end class