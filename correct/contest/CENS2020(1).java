/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.lang.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int prc(int[] arr)
    {
        int pr=0;
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int band=arr[i]&arr[j];
                if(band==arr[i])
                    pr++;
            }
        }
        return pr;
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
                int h=prc(aList[i]);
                bw.write(String.valueOf(h));
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
