/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.math.BigInteger;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static BigInteger ncr(int n, int r) 
    { 
       BigInteger a=fact(n).divide( fact(r).multiply(fact(n - r)));
       return a;
    }
    static BigInteger fact(int n) 
    {
	    BigInteger fa=new BigInteger("1") ;    
         for(int i=n;i>1;i--)
            fa=fa.multiply(BigInteger.valueOf(i));
	     return fa;
	}
    public static void prc(int[] arr,int k)
    {
        Arrays.sort(arr);
        int i=k-1;
        int internalcount=1;
        while(i>0)
        {
             if(arr[i]==arr[i-1])
             {   internalcount++;
                 i--;
             }
             else
                break;    
        }
         // internal internalcount calculated
         i=k-1;
         int externalcount=0;
         while(i<arr.length-1)
         {
             if(arr[i]==arr[i+1])
             {   externalcount++;
                 i++;
             }
             else
                break;    
         }
         int total=externalcount+internalcount;
         if(externalcount==0)
            System.out.println("1");
         else
            System.out.println(ncr(total,internalcount));    
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        //BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        int[][] aList=new int[t][];
        int[] kList =  new int[t];
        for(int i=0;i<t;i++)
        {
            String[] str = br.readLine().split(" ");
            int n=Integer.parseInt(str[0]);
            int k=Integer.parseInt(str[1]);
            kList[i]=k;

            int[] a1=new int[n];
            String[] str1 = br.readLine().split(" ");
            

            for(int j=0;j<n;j++)
                a1[j]=Integer.parseInt(str1[j]);

            aList[i]=a1;

        }
        for(int i=0;i<t;i++) 
            prc(aList[i],kList[i]);
        br.close();
        //bw.close();  
	}
}
