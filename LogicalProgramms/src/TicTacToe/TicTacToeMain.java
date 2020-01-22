package TicTacToe;
import java.util.*;
import java.io.*;

public class TicTacToeMain {



	    public static void main(String[] args) {
		// Data objects
	    // 1 = user, 2 = computer
	    // We will represent the board as nine cells 
	    // 0 = empty, 1 = user, 2 = computer
	    	int[][] board = new int[3][3];
	    	// Print Instructions
	        System.out.println("This is a tic-tac-toe game");
	    	System.out.println("You are playing against the computer!");
	    	System.out.println("Enter 0-8 to indicate your move");
	    	TicTacToeBL Tic = new TicTacToeBL();
	    	TicTacToeBL.GameOn(board);
	    	
	    	
		}
	}