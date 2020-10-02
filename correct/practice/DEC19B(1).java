/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static long prc(int[] arr)
    {
        long sum=0;
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<arr.length;i+=2)
        {
            if(!(hmap.containsKey(arr[i])) && arr[i]<9)
                hmap.put(arr[i],arr[i+1]);
            if(hmap.containsKey(arr[i]) && hmap.get(arr[i])<arr[i+1])
                hmap.replace(arr[i], arr[i+1]);      
        }
        for(int k:hmap.values())
            sum+=k;
        return k;    
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
            int[] a1=new int[2*n];
            for(int j=0;j<2*n;j+=2)
            {  
                String[] tstr=br.readLine().split(" ");
                a1[j]=Integer.parseInt(tstr[0]);
                a1[j+1]=Integer.parseInt(tstr[1]);   
            }
            aList[i]=a1;
        }
        for(int i=0;i<aList.length;i++) 
            { 
                long h=prc(aList[i]);
                bw.write(String.valueOf(h));
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
