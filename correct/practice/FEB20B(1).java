/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.lang.Math;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static long prc(int[] arr1,int[] arr2)
    {
        long sum=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++)
        {
            sum+=Math.min(arr1[i],arr2[i]);
        }
        return sum;
           
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        int[][] aList=new int[t][];
        int[][] bList=new int[t][];
        
        for(int i=0;i<t;i++)
        {
           
            int n=Integer.parseInt(br.readLine());
            
            int[] a1=new int[n];
            String[] m1=br.readLine().split(" ");
            for(int j=0;j<n;j++)
            {
                a1[j]=Integer.parseInt(m1[j]);
            }
            aList[i]=a1;

            int[] b1=new int[n];
            String[] m2=br.readLine().split(" ");
            for(int j=0;j<n;j++)
            {
                b1[j]=Integer.parseInt(m2[j]);
            }
            bList[i]=b1;

        }
        for(int i=0;i<aList.length;i++) 
            
            { 
                long h=prc(aList[i],bList[i]);
                bw.write(String.valueOf(h));
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
