/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
 class Codechef
{
    public static long prc(int [] arr)
    {
        long sum=0;
        int curr=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            int nstr=arr[i]-curr;
            if(nstr>0)
                nstr=nstr-1;
            if(nstr<0)
                nstr=Math.abs(nstr)-1;
            //System.out.println(i+" "+arr[i]+" "+curr+" "+nstr);
            curr=arr[i];
            sum+=nstr;
        }
        return sum;
        
           
        
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
            String[] str = br.readLine().split(" ");
            

            int[] a1=new int[n];
            

            for(int j=0;j<n;j++)
            {
                a1[j]=Integer.parseInt(str[j]);
            }
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
