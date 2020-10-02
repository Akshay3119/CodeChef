/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
   public static int[] prc(int[] arr,int p)
    {
        //int[] barr=new int[arr.length];
        //StringBuilder[] barr=new StringBuilder[arr.length];
        char[][] barr=new char[arr.length][];
        /*for(int i=0;i<barr.length;i++)
            barr[i] = new StringBuilder("");*/
        int[] onesarr=new int[barr.length];
        int odd,even;
        odd=even=0;
        for(int i=0;i<arr.length;i++)
            {
                barr[i]=(Integer.toBinaryString(p^arr[i])).toCharArray();
            }

        /*for(int i=0;i<barr.length;i++)
            System.out.print(barr[i]+" ");
        System.out.println();*/
        /*for(int i=0;i<barr.length;i++)
        {
            char[] tmp=new char[barr[i].length()];
            barr[i].getChars(0, barr[i].length(), tmp, 0);
            int t=0;
            for(int j=0;j<tmp.length;j++)
            {
                if(tmp[j]=='1')
                    t++;
            }
            onesarr[i]=t;
        }*/
        for(int i=0;i<barr.length;i++)
        {
            int t=0;
            for(int j=0;j<barr[i].length;j++)
            {
                if(barr[i][j]=='1')
                    t++;
            }
            onesarr[i]=t;
        }
        /*for(int i=0;i<onesarr.length;i++)
            System.out.print(onesarr[i]+" ");
        System.out.println();*/
        for(int i=0;i<onesarr.length;i++)
        {
            if(onesarr[i]%2==0)
                even++;
            else
                odd++;
        }
        int[] ansarr=new int[2];
        ansarr[0]=even;
        ansarr[1]=odd;
        return ansarr;  
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        int[][] aList=new int[t][];
        int[][] bList=new int[t][];
        

            for(int i=0;i<t;i++)
            {
                String[] str = br.readLine().split(" ");
                int n=Integer.parseInt(str[0]);
                int q=Integer.parseInt(str[1]);
                int[] a1=new int[n];
                String[] st = br.readLine().split(" ");
                for(int j=0;j<n;j++)
                    a1[j]=Integer.parseInt(st[j]);
                aList[i]=a1;
                int[] b1=new int[q];
                for(int j=0;j<q;j++)
                {
                    String m=br.readLine();
                    b1[j]=Integer.parseInt(m);
                } 
                bList[i]=b1; 
            }
            for(int i=0;i<t;i++) 
                for(int j=0;j<bList[i].length;j++)
                { 
                    int[] h=prc(aList[i],bList[i][j]);
                    bw.write(String.valueOf(h[0]));
                    bw.write(" ");
                    bw.write(String.valueOf(h[1]));
                    bw.newLine();
                }
            br.close();
            bw.close();

        
	}
}
