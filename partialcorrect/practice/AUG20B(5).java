/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    public static int prc(int[] arr)
    {
        int tables=1;
        int[] farr=new int[101];
        Arrays.fill(farr,0);
        for(int i=0;i<arr.length;i++)
        {
            if(farr[arr[i]==1])
            {
                tables++;
                Arrays.fill(farr,0);
                farr[arr[i]]++;
            }
            else
                farr[arr[i]]++;
        }

        return tables;
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
            String[] str = br.readLine().split(" ");
            int n=Integer.parseInt(str[0]);
            int k=Integer.parseInt(str[1]);

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
                int h=prc(aList[i]);
                bw.write(String.valueOf(h));
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
