/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int prc(int h,int p)
    {
        while(h>0 && p>0)
        {
            h-=p;
            p=Math.floor(p/2);
        }
        if(h<=0)
            return 1;
        else
            return 0;
           
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        int[] hList=new int[t];
        int[] pList=new int[t];
        for(int i=0;i<t;i++)
        {
            String[] str = br.readLine().split(" ");
            int h=Integer.parseInt(str[0]);
            int p=Integer.parseInt(str[1]);
            hList[i]=h;
            pList[i]=p;

        }
        for(int i=0;i<t;i++) 
            
            { 
                int h=prc(hList[i],pList[i]);
                bw.write(String.valueOf(h));
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
