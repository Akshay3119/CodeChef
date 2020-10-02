/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static String prc(int[] arr,int p,int q)
    {
        int n=arr.length+1;
        if(Math.abs(p-q)==1)
            return Integer.toString(arr[Math.min(p,q)-1]);
        if(Math.abs(p-q)%2!=0)
        {
            long sum=0;
            int t1=Math.min(p,q);
            int t2=Math.max(p,q);
            p=t1;
            q=t2;
            for(int i=p-1;i<q-1;i++)
                sum+=arr[i];
            
            for(int i=p;i<q-1;i+=2)
                sum-=2*arr[i];
            return Long.toString(sum);

        }
        else
            return "UNKNOWN";
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        int[][] a1List=new int[t][];
        int[][] a2List=new int[t][];
        
        for(int i=0;i<t;i++)
        {
            String[] str = br.readLine().split(" ");
            int n=Integer.parseInt(str[0]);
            int q=Integer.parseInt(str[1]);

            String[] str1 = br.readLine().split(" ");
            int[] a1=new int[n-1];
            for(int j=0;j<n-1;j++)
            {
                a1[j]=Integer.parseInt(str1[j]);
            }
            a1List[i]=a1;

            int[] a2=new int[2*q];
            for(int k=0;k<2*q;k+=2)
            {
                String[] str2 = br.readLine().split(" ");
                a2[k]=Integer.parseInt(str2[0]);
                a2[k+1]=Integer.parseInt(str2[1]);

            }
            a2List[i]=a2;
            
        }
        for(int i=0;i<t;i++) 
            for(int j=0;j<a2List[i].length;j+=2)
            { 
                String h=prc(a1List[i],a2List[i][j],a2List[i][j+1]);
                bw.write(h);
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
