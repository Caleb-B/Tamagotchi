package Client;

// **********************************************************************
// Programmer:	Caleb Beynon
// Class:		CS30S
//
// Assignment:	aX qy
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
        tList = new Tamagotchi[10];           	// array of tamagotchis
        int n = 0;                          	// tamagotchi object counter
        
    // create instances of objects for i/o and formatting
    
    	//ConsoleReader console = new ConsoleReader(System.in);
    	//DecimalFormat df1 = new DecimalFormat("$##.00");
		
	// ***** create objects *****
		
		ProgramInfo Printer = new ProgramInfo();	// create new printer object
		
		tList[0] = new Fairy("Fred", 0, Stage.Baby, Career.Merchant, SubRace.Fairy, 40.25);
		
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
	
		Printer.printBanner("4:", "2");	// print banner
		
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