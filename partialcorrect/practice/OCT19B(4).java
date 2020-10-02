/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int prc(int[] arr)
    {
        Integer[] sarr=new Integer[arr.length];
        Arrays.fill(sarr,0);
        for (int i=0;i<arr.length;i++)
        {
            int c=0;
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                    break;
                if(arr[j]%arr[i]==0)
                    c++;

            }
            sarr[i]=c;
        }
        /*for(int i=0;i<sarr.length;i++)
            System.out.print(sarr[i]+" ");*/
        int max=Collections.max(Arrays.asList(sarr)); 
        return max;
        
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
            int[] a1=new int[n];
            String[] str = br.readLine().split(" ");
           
            for(int j=0;j<n;j++)
            {
                a1[j]=Integer.parseInt(str[j]);
            }
            aList[i]=a1;

        }
        for(int i=0;i<t;i++) 
            //for(int j=0;j<aList[i].length;j++)
            { 
                int h=prc(aList[i]);
                bw.write(String.valueOf(h));
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
