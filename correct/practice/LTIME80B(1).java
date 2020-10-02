/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static long prc(int a,int b,int c,int[] floor)
    {
        Arrays.sort(floor);
        int mindiff=Integer.MAX_VALUE;
        int t=floor[floor.length-1];
        for(int i=0;i<floor.length;i++)
        {
            if(mindiff>(Math.abs(b-floor[i])+Math.abs(a-floor[i])))
            {
                mindiff=Math.abs(b-floor[i])+Math.abs(a-floor[i]);
                t=floor[i];
            }
        }
        long time=(long)Math.abs(t-b)+(long)c+(long)Math.abs(t-a);
        return time;    
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        int[][] floorList=new int[t][];
        int[] aList=new int[t];
        int[] bList=new int[t];
        int[] cList=new int[t];
        for(int i=0;i<t;i++)
        {
            String[] str = br.readLine().split(" ");
            int n=Integer.parseInt(str[0]);
            int a=Integer.parseInt(str[1]);
            int b=Integer.parseInt(str[2]);
            int c=Integer.parseInt(str[3]);
            aList[i]=a;
            bList[i]=b;
            cList[i]=c;

            int[] a1=new int[n];
            String[] str2 = br.readLine().split(" ");
            for(int j=0;j<n;j++)
            {
                a1[j]=Integer.parseInt(str2[j]);
            }
            floorList[i]=a1;

        }
        for(int i=0;i<floorList.length;i++) 
            
            { 
                long h=prc(aList[i],bList[i],cList[i],floorList[i]);
                bw.write(String.valueOf(h));
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
