package WindChill;

import java.util.*;

public class WindChillBL
{


	public static void WindChill(int t, int v) throws WindChillException
	{

		if(t<50&&(v>3||v<120  )) 
		{
			
			double w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
	    
	    System.out.print(w);
		}
		if (t>50) {
			throw new WindChillException("Temperature more than 50F can not be accepted");
		}
		if (v<3||v>120) {
			throw new WindChillException("wind Speed more than 120mph or less than 3mph can not be accepted");
		}
    
	}
}
