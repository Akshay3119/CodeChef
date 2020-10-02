/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static String prc(int arr[])
    {
        int p=arr[5];
        int sum=0;
        int limit=24*5;
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]*=p;
            sum+=arr[i];
        }
        if(sum>limit)
            return "Yes";
        else
            return "No";
             
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        int[][] aList=new int[t][];
        String[] sList =  new String[t];
        for(int i=0;i<t;i++)
        {
            String[] str = br.readLine().split(" ");
            int[] a1=new int[6];
           
            for(int j=0;j<6;j++)
            {
                a1[j]=Integer.parseInt(str[j]);  
            }
            aList[i]=a1;

        }
        for(int i=0;i<aList.length;i++) 
            
            { 
                String h=prc(aList[i]);
                bw.write(h);
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
