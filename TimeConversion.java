package hckrrank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        
// considering input hh:min:secAM/PM format
        
        String hh[]=s.split(":");
		String ampm=hh[2].substring(2, 4);
		String hrs=hh[0];
		int inthrs=Integer.parseInt(hrs);
		String min=hh[1];
		String sec=hh[2].substring(0, 2);
		String hr=null;
    
		if(ampm.equals("PM"))
		{
			if (inthrs<12)
			{
				inthrs=inthrs+12;
                hr=Integer.toString(inthrs);
			}
		}
		if(ampm.equals("AM"))
		{
			if(inthrs==12)
			{
				inthrs=inthrs-12;
                hr=Integer.toString(inthrs);
                hr="0"+hr;
			}
		}
		if(hr==null)
        {
            hr=hrs;
        }
		
        String returnVal= hr+":"+min+":"+sec;
		return returnVal;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
