/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
 class Codechef
{
    public static long BinaryConcatenation(int X,int Y)
    {
        String binX=Integer.toBinaryString(X);
        String binY=Integer.toBinaryString(Y);
        String binXplusY = (binX + binY);
        String binYplusX = (binY + binX);
        long XplusY=Long.parseLong(binXplusY,2);
        long YplusX=Long.parseLong(binYplusX,2);
        return XplusY-YplusX;
    }
    public static long prc(int[] arr)
    {
        long max=0;
        if(arr.length==1)
            return 0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                long tans=BinaryConcatenation(arr[i], arr[j]);
                if(tans>max)
                    max=tans;
            }
        }
        return max;    
        
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
