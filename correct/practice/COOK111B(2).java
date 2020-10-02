/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    public static String prc(long n)
    {
        long org=n;
        long a,b;
        a=b=0;
        while(n%10==0)
        {
                n/=10;
                a++;
        }
        while(n%2==0)
        {
                n/=2;
                b++;
        }
        if(a>=b && Math.pow(10, a) * Math.pow(2, b)==org )
            return "Yes";
        else
            return "No";

    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        //[][] aList=new int[t][];
        long[] nList =  new long[t];
        for(int i=0;i<t;i++)
        {
            long n=Long.parseLong(br.readLine());
            nList[i]=n;

        }
        for(int i=0;i<t;i++) 
            
            { 
                String h=prc(nList[i]);
                bw.write(h);
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
