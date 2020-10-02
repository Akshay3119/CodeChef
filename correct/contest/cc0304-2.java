/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void covid(int[] arr)
    {
        int t=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
               for(int j=i+1;j<i+6;j++)
               {
                   if(j<arr.length)
                        if(arr[j]==1)
                            t--;
               }
            }
        }
        if(t<0)
            System.out.println("NO");
        else
            System.out.println("YES");
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t=Integer.parseInt(br.readLine());
        int[][] aList =  new int[t][100];
        int[] total=new int[t];
        for(int z=0;z<t;z++)
            total[z]=0;
        
        if(t>=1 && t<=100)
        {
            for(int i=0;i<t;i++)
            { 
                int n=Integer.parseInt(br.readLine());
                if(n>=1 && n<=100)
                {
                    String[] st = br.readLine().split(" ");
                        for(int j=0;j<n;j++)
                        {
                            int z=Integer.parseInt(st[j]);
                            if(z==0 || z==1)
                                aList[i][j]=z;
                            total[i]+=aList[i][j];     
                        }      
                }
            }

            for(int i=0;i<t;i++)
            { 
                if(total[i]!=0)
                    covid(aList[i]);
            }
        }
	}
}
