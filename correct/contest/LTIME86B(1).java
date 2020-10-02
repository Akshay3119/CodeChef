/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static String prc(long[] arr,long k)
    {
        String str="";
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%k==0)
                str+="1";
            else
                str+="0";

        }
        return str;
        
           
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        long[][] aList=new long[t][];
        long[] kList =  new long[t];
        for(int i=0;i<t;i++)
        {
            String[] str = br.readLine().split(" ");
            int n=Integer.parseInt(str[0]);
            long k=Long.parseLong(str[1]);
            kList[i]=k;
            

            long[] a1=new long[n];
            String[] str1 = br.readLine().split(" ");
            

            for(int j=0;j<n;j++)
            {
                
                a1[j]=Long.parseLong(str1[j]);
            }
            aList[i]=a1;

        }
        for(int i=0;i<t;i++) 
           
            { 
                String h=prc(aList[i],kList[i]);
                bw.write(h);
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
