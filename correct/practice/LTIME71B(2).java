/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.lang.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int n=Integer.parseInt(br.readLine());
            String[] str1 = br.readLine().split(" ");
            int[] aarr=new int[n];
            for(int i=0;i<n;i++)
                aarr[i]=Integer.parseInt(str1[i]);
            String[] str2 = br.readLine().split(" ");
            int[] barr=new int[n];
            for(int i=0;i<n;i++)
                barr[i]=Integer.parseInt(str2[i]);
            
            int[] adp=new int[n];
            int[] bdp=new int[n];
            adp[0]=aarr[0]; bdp[0]=barr[0];
            for(int i=1;i<n;i++)
            {
                adp[i]=adp[i-1]+aarr[i];
                bdp[i]=bdp[i-1]+barr[i];
            }
            Integer[] tarr=new Integer[n+1];
            tarr[0]=bdp[n-1];
            for(int i=1;i<n+1;i++)
                tarr[i]=adp[i-1]+(bdp[n-1]-bdp[i-1]);
            
            int ans=Collections.max(Arrays.asList(tarr));
            bw.write(String.valueOf(ans));
            bw.newLine();

        }
        
        br.close();
        bw.close();  
	}
}
