package Gambler;
import java.util.*;

public class GamblerMain {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Stake of Gamble");
        int stake  = sc.nextInt();
        System.out.println("Enter the Goal to be reached");
        int goal   = sc.nextInt();
        System.out.println("Enter the Number of Trials taken");
        int trials = sc.nextInt();
 
        GamblerBL Gmb = new GamblerBL();
        Gmb.GamblerResults(stake,goal,trials);
        
    }
}

