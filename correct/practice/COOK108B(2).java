/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.lang.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int prc(int xf)
    {
        if(xf==0)
            return 0;
        long x,y;
        x=y=0;
        //p=1;
        int mv=0;

        while(x<=xf)
        {
            long temp=(long)Math.sqrt(y);
            temp++;
            y+=temp*temp;
            x=temp;
            mv++;
            
        }
        return mv-1;  
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        int[] aList=new int[t];
        
        for(int i=0;i<t;i++)
        {
            int a1=Integer.parseInt(br.readLine());
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
