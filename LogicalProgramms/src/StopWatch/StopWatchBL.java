package StopWatch;

public class StopWatchBL {
		public long startTimer=0;
		public long stopTimer=0;
		public long elapsed;
		
	
		public void start()
		{
			startTimer=System.currentTimeMillis();
			System.out.println("Start Time is: "+startTimer);
		}
		

		public void stop()
		{
			stopTimer=System.currentTimeMillis();
			System.out.println("Stop Time is: "+stopTimer);
		}
		
		public long getElapsedTime()
		{
			elapsed=stopTimer-startTimer;
			return elapsed;
		}
		
		public void getElapsedSeconds(long elapsed) 
		{
			long elapsedsec= elapsed/1000;
			System.out.println("Time elapsed in seconds is: "+elapsedsec);
			
//			return elapsedsec;
			
		}


}
