package StopWatch;

import java.awt.event.KeyEvent;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

public class StopWatchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		KeyEvent e = null;
//		Boolean StartTimer = false;
//		Boolean StopTimer = false;
		StopWatchBL SW = new StopWatchBL();
			
		System.out.println("Press 1 to start Timer");
		int StartTimer = sc.nextInt();
		if (StartTimer == 1) {
			SW.start();
		}
		System.out.println("Press 2 to stop Timer");
		int StopTimer = sc.nextInt();
		if (StopTimer==2) {
			SW.stop();
		}
		System.out.println("Total time elapsed is "+SW.getElapsedTime()+" MilliSeconds");
		SW.getElapsedSeconds(SW.getElapsedTime());
		
//		String readString = sc.nextLine();
//		System.out.println("Press Enter to get time elapsed in seconds");
//		while(readString!=null) {
//			if (readString.isEmpty()) {
//				SW.getElapsedSeconds(SW.getElapsedTime());
//				System.exit(0);
//			}
//			
//		}
	}

}
