/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int prc(int[] arr)
    {
        int l=arr.length/2;
        int aWin,bWin,aRem,bRem;
        aWin=bWin=0;
        aRem=bRem=l;
        int t=2*l;
        for(int i=1;i<=2*l;i++)
        {
            if(i%2!=0)
            {
                if(arr[i-1]==1)
                    aWin++;
                aRem--;
            }
            if(i%2==0)
            {
                if(arr[i-1]==1)
                    bWin++;
                bRem--;
            }
            if(aWin>bWin+bRem || bWin>aWin+aRem)
            {
                t=i;
                break;
            }
        }
        return t;   
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

            int[] a1=new int[2*n];
            
            String[] st1=br.readLine().split("");

            for(int j=0;j<2*n;j++)
                a1[j]=Integer.parseInt(st1[j]);
            aList[i]=a1;

        }
        for(int i=0;i<aList.length;i++) 
            { 
                int h=prc(aList[i]);
                bw.write(String.valueOf(h));
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
