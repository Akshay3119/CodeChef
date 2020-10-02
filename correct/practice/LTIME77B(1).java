/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void prc(int[] arr)
    {
        int n=arr.length;
        int partst=n/4;
        Arrays.sort(arr);
        int x,y,z;
        if(arr[partst-1]==arr[partst] || arr[2*partst-1]==arr[2*partst] || arr[3*partst-1]==arr[3*partst])
        {
            System.out.println(-1);
            return;
        }
        
        x=arr[partst];
        y=arr[2*partst];
        z=arr[3*partst];
        System.out.println(x+" "+y+" "+z);     
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
            String[] str = br.readLine().split(" ");
            int[] a1=new int[n];
            for(int j=0;j<n;j++)
            {
                a1[j]=Integer.parseInt(str[j]);
            }
            aList[i]=a1;

        }
        for(int i=0;i<t;i++) 
           
            { 
                prc(aList[i]);
                //bw.write(String.valueOf(h));
                //bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
