/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.lang.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static String prc(int[] arr,int n)
    {
        int allcel=0;
        for(int i=1;i<n-1;i++)
        {
            if(arr[i]==0)
            {
                allcel=1;
                break;
            }
        }
        if(allcel==0)
            return "No";
        int mxz=0;
        for(int i=1;i<n-1;i++)
        {
            int temp=0;
            while(n-1>i && arr[i]==1)
                i++;
            while(n-1>i && arr[i]==0)
            {
                temp++;
                i++;
            }
            if(temp>mxz)
                mxz=temp;
            i--;
        }
        int secl=0;
        for(int i=1;i<n-1;i++)
        {
            int temp=0;
            while(n-1>i && arr[i]==1)
                i++;
            while(n-1>i && arr[i]==0)
            {
                temp++;
                i++;
            }
            if(temp>secl && temp!=mxz)
                secl=temp;
            i--;
        }
        //System.out.println(mxz+" "+secl);
        if(secl==0)
        {
            if(mxz%2!=0)
                return "Yes";
        }
        if(mxz%2!=0 && (mxz+1)/2 > secl)
            return "Yes";
        return "No";

        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        int[][] aList=new int[t][];
        //String[] sList =  new String[t];
        int[] nList=new int[t];
        for(int i=0;i<t;i++)
        {
           
            int n=Integer.parseInt(br.readLine());
            nList[i]=n;
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
                String h=prc(aList[i],nList[i]);
                bw.write(h);
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
