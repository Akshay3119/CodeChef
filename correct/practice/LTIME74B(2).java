/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static long prc(int[] oarr)
    {
        long[] arr=new long[oarr.length+1];
        arr[0]=0;
        for(int i=1;i-1<oarr.length;i++)
            arr[i]=oarr[i-1];
        
        long[] dp=new long[arr.length];
        dp[0]=0;
        dp[1]=arr[1];
        for(int i=2;i<arr.length;i++)
        {
            dp[i]=Math.max(dp[i-1]+arr[i]*i,dp[i-2]+i*arr[i-1]+(i-1)*arr[i]);
        }
        /*for(int i=0;i<dp.length;i++)
            System.out.print(dp[i]+" ");
        System.out.println();*/
            
        return dp[dp.length-1]; 
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        int[][] aList=new int[t][];
        //String[] sList =  new String[t];
        for(int i=0;i<t;i++)
        {
            int n=Integer.parseInt(br.readLine());
            int[] a1=new int[n];

            String[] str = br.readLine().split(" ");

            for(int j=0;j<n;j++)
            { 
                a1[j]=Integer.parseInt(str[j]);
            }
            aList[i]=a1;

        }
        for(int i=0;i<t;i++) 
            
            { 
                long h=prc(aList[i]);
                bw.write(String.valueOf(h));
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
