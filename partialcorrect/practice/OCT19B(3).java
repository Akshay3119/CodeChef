/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void prc(int[] arr,long k)
    {
        long n=arr.length;
        for(long i=0;i<k;i++)
        {
            int a=arr[(int)(i%n)];
            int b=arr[(int)(n-(i%n)-1)];
            arr[(int)(i%n)]=a^b;
        }
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");  
        System.out.println();
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        int[][] aList=new int[t][];
        long[] kList =  new long[t];
        for(int i=0;i<t;i++)
        {
            String[] str = br.readLine().split(" ");
            int n=Integer.parseInt(str[0]);
            long k=Long.parseLong(str[1]);
            kList[i]=k;

            int[] a1=new int[n];
            String[] str1 = br.readLine().split(" ");

            for(int j=0;j<n;j++)
            {
                a1[j]=Integer.parseInt(str1[j]);
            }
            aList[i]=a1;

        }
        for(int i=0;i<t;i++) 
            
            { 
                prc(aList[i],kList[i]);
                //bw.write("/n");
                //bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
