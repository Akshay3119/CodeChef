/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.lang.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int prc(int[] arr)
    {
        int n=arr.length;
        int[] afarr=new int[10000];
        for(int i:arr)
            afarr[i]++;
        TreeMap<Integer,Integer> hm=new TreeMap<>();
        for(int i=0;i<afarr.length;i++)
            {
                if(hm.containsKey(afarr[i]))
                {
                    int temp=hm.get(afarr[i]);
                    hm.replace(afarr[i], temp+1);
                }
                else
                {
                    if(afarr[i]>0)
                        hm.put(afarr[i], 1);
                }
            }

        int maxval=0;
        int key=0;
        for(Map.Entry<Integer,Integer> ent : hm.entrySet())
        {
            if(ent.getValue()>maxval)
            {
                maxval=ent.getValue();
                key=ent.getKey();
            }
        }
        return key;
        
        
           
        
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
                int h=prc(aList[i]);
                bw.write(String.valueOf(h));
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
