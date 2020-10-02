/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.lang.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    public static long prc(long n)
    {
        if(n==1||n==2)
            return 0;
        long sum=(n*(n+1))/2;
        if(sum %2!=0)
            return 0;
        long ans=0;
        long x= (long)Math.floor((-1+Math.sqrt(1+4*(double)sum))/2);
        ans+=n-x;
        long xsum=(x*(x+1))/2;
        if(xsum==(sum-xsum))
            ans+=(x*(x-1))/2+((n-x)*(n-x-1))/2;
        return ans;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        long[] aList=new long[t];
        //String[] sList =  new String[t];
        for(int i=0;i<t;i++)
        {
            long a1=Long.parseLong(br.readLine());
            aList[i]=a1;
        }
        for(int i=0;i<t;i++) 
           
            { 
                long h=prc(aList[i]);
                bw.write(String.valueOf(h));
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
