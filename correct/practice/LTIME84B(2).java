/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static long prc(int[] arr1,int[] arr2)
    {
        long x1,x2,wd;
        x1=x2=wd=0;
        if(arr1[0]==arr2[0])
            wd+=arr1[0];
        for(int i=0;i<arr1.length-1;i++)
        {
            x1+=arr1[i];
            x2+=arr2[i];
            if(x1==x2 && arr1[i+1]==arr2[i+1])
            {
                wd+=arr1[i+1];
            }
        }
        return wd;
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        int[][] aList1=new int[t][];
        int[][] aList2=new int[t][];
        String[] sList =  new String[t];
        for(int i=0;i<t;i++)
        {
            
            int n=Integer.parseInt(br.readLine());
            String[] str1 = br.readLine().split(" ");
            int[] a1=new int[n];
            for(int j=0;j<n;j++)
            {
                a1[j]=Integer.parseInt(str1[j]);
            }
            aList1[i]=a1;

            String[] str2 = br.readLine().split(" ");
            int[] a2=new int[n];
            for(int j=0;j<n;j++)
            {
                a2[j]=Integer.parseInt(str2[j]);
            }
            aList2[i]=a2;
            
        }
        for(int i=0;i<t;i++) 
            
            { 
                long h=prc(aList1[i],aList2[i]);
                bw.write(String.valueOf(h));
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
