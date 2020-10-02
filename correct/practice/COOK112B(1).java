/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static String prc(int[] arr,int k)
    {
        int pt=0;
        int t=0;
        int d=0;
        for(int i=0;i<arr.length;i++)
        {
            pt+=arr[i];
            if(pt<k)
            {
                t=1;
                d=i+1;
                break;
            }
            else
                pt-=k;
        }
        if(t==1)
            return "NO "+Integer.toString(d);
        else
            return "YES";     
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        int[][] aList=new int[t][];
        int[] kList =  new int[t];
        for(int i=0;i<t;i++)
        {
            String[] str0 = br.readLine().split(" ");
            int n=Integer.parseInt(str0[0]);
            int k=Integer.parseInt(str0[1]);
            kList[i]=k;

            int[] a1=new int[n];
            String[] str = br.readLine().split(" ");

            for(int j=0;j<n;j++)
            {
                a1[j]=Integer.parseInt(str[j]);
            }
            aList[i]=a1;

        }
        for(int i=0;i<aList.length;i++) 
           
            { 
                String h=prc(aList[i],kList[i]);
                bw.write(h);
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
