/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.lang.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static long prc(int n1)
    {
        long n=n1;
        TreeSet<Long> ts=new TreeSet<>();  
        ts.add(new Long(1));
        for(long i=1;i<n;i++)
            ts.add(i+1);
        for(;;)
        {
            if(ts.size()==1)
                break;
            long x=ts.first();
            long y=ts.last();
            ts.remove(x);
            ts.remove(y);
            ts.add((x+y+x*y)%1000000007);
        }
        return ts.first();
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        int[] aList=new int[t];
        //String[] sList =  new String[t];
        for(int i=0;i<t;i++)
        {
            int n=Integer.parseInt(br.readLine());
            aList[i]=n;

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
