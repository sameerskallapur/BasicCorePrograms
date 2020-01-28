package com.bl.Junit.VendingMachine;

public class VendingMachineBL {

	 public static void countCurrency(int amount) {
	    
	int[] notes = new int[]{ 1000, 500, 100, 50, 10, 5, 2, 1 }; 
    int[] noteCounter = new int[notes.length]; 
   
    // count notes using Greedy approach 
    for (int i = 0; i < notes.length; i++) { 
        if (amount >= notes[i]) { 
            noteCounter[i] = amount / notes[i]; 
            amount = amount - noteCounter[i] * notes[i]; 
        } 
    } 
   
    // Print notes 
    System.out.println("Currency Count ->"); 
    for (int i = 0; i < notes.length; i++) { 
        if (noteCounter[i] != 0) { 
            System.out.println(notes[i] + " : "
                + noteCounter[i]); 
        }
    }
}
}

