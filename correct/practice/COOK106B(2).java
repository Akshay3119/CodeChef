/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.lang.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int[] prc(int[] arr)
    {
        int l=arr.length;
        int ansarr[] =new int[l];
        if(l==4)
        {
            int d1=arr[1]-arr[0];
            int d2=arr[2]-arr[1];
            int d3=arr[3]-arr[2];

            if(d1 != d2 && d2 != d3)
            {
                ansarr[0]=arr[0];
                int fd=(arr[3]-arr[0])/3;
                for(int i=1;i<4;i++)
                    ansarr[i]=ansarr[i-1]+fd;
                return ansarr;
            }
        }
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        for(int i=1;i<l;i++)
        {
            int val=arr[i]-arr[i-1];
            if(tm.containsKey(val))
            {
                int tmp=tm.get(val);
                tm.replace(val, tmp+1);
            }
            else
                tm.put(val,1);
        }
        int maxkey=-1;
        int maxval=-1;
        for(Map.Entry<Integer,Integer> mp:tm.entrySet())
        {
            //System.out.println("k: "+mp.getKey()+" v:"+mp.getValue());
            if(mp.getValue()>maxval)
            {
                maxval=mp.getValue();
                maxkey=mp.getKey();
            }
        }
        
        int diff=maxkey;
        int felm=arr[0];
        if(arr[1]-arr[0] != diff)
        {
            if(arr[2]-arr[1]==diff)
                felm=arr[1]-diff;
            else
                felm=arr[0];
        }
        ansarr[0]=felm;
        for(int i=1;i<l;i++)
            ansarr[i]=ansarr[i-1]+diff;

        return ansarr;      
        
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
                a1[j]=Integer.parseInt(str[j]);
            aList[i]=a1;

        }
        for(int i=0;i<t;i++)  
            { 
                int[] h=prc(aList[i]);
                for(int j=0;j<h.length;j++)
                {
                    bw.write(String.valueOf(h[j]));
                    bw.write(" ");
                }
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
