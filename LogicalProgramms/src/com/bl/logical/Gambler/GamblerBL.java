package com.bl.logical.Gambler;

public class GamblerBL {

	public static void GamblerResults(int stake, int goal, int trials) {

        int bets = 0;        
        int wins = 0; 
		
    for (int t = 0; t < trials; t++) {

        
        int cash = stake;
        while (cash > 0 && cash < goal) {
            bets++;
            if (Math.random() < 0.5) cash++;     
            else                     cash--;     
        }
        if (cash == goal) {
        	wins++;             
        }
    }

    
    System.out.println(wins + " wins of " + trials);
    System.out.println("Percent of games won = " + 100.0 * wins / trials);
    System.out.println("Avg # bets           = " + 1.0 * bets / trials);
}


    }

