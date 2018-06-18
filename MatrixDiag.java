import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MatrixDiag {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] a) {

     int sum=0;
		int sum1=0;
		int l=a[0].length;
		System.out.println(l);
		for (int i=0;i<l;i++)
		{
			for (int j=0;j<l;j++)
			{
				if(i==j)
				{
					sum=sum+a[i][j];
				}
				if(j==((l-1)-i))
				{
					sum1=sum1+a[i][j];
				}
			}
		}
		return (Math.abs(sum-sum1));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] aRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int aItem = Integer.parseInt(aRowItems[j]);
                a[i][j] = aItem;
            }
        }

        int result = diagonalDifference(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}