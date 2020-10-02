/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
   
    public static long powcal(long num)
    {
        //long dig=caldig(num);
        if(num<=9)
            return 1;
        long counter=num/9;
        if(num%9==0)
            return counter;
        else
            return counter+1;
    }

    public static void prc(long a,long b)
    {
        long dig1=powcal(a);
        long dig2=powcal(b);
        if(dig1<dig2)
            System.out.println(0+" "+dig1);
        else
            System.out.println(1+" "+dig2);      
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t=Integer.parseInt(br.readLine());
        long[] aList =  new long[t];
        long[] bList =  new long[t];
        for(int i=0;i<t;i++)
        {
            String[] str = br.readLine().split(" ");
            long a=Long.parseLong(str[0]);
            long b=Long.parseLong(str[1]);
            aList[i]=a;
            bList[i]=b;

        }
        for(int i=0;i<t;i++) 
                prc(aList[i],bList[i]);
                
        br.close();
	}
}
