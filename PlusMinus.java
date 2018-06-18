import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	int n=arr.length;
		int pos=0;
		int neg=0;
		int zero=0;
		
		for (int i=0;i<n;i++)
		{
			if (arr[i]>0)
			{
				pos=pos+1;
			}
			else if (arr[i]<0)
			{
				neg=neg+1;
			}
			else
			{
				zero=zero+1;
			}
		}
		
		if ((pos>0) || (pos==0))
		{
			System.out.printf("%.6f\n",(double)pos/(double)n);
		}
		if ((neg>0) || (neg==0))
		{
			System.out.printf("%.6f\n",(double)neg/(double)n);
		}
		if ((zero>0) || (zero==0))
		{
			System.out.printf("%.6f\n",(double)zero/(double)n);
		}
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
