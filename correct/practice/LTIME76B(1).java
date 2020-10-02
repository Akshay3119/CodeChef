/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static String prc(int n,int[] arr)
    {
        Integer[] carr=new Integer[n];
        Arrays.fill(carr,0);
        
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            int min=Collections.min(Arrays.asList(carr));
            if(max<carr[arr[i]-1])
                max=carr[arr[i]-1];
            //System.out.println(min+" "+max);
            if(max==carr[arr[i]-1] &&(max-min)==1)
                return "NO";
            carr[arr[i]-1]++;
        
        }
        return "YES";    
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        int[][] aList=new int[t][];
        int[] nList =  new int[t];
        for(int i=0;i<t;i++)
        {
            String[] str = br.readLine().split(" ");
            int n=Integer.parseInt(str[0]);
            int m=Integer.parseInt(str[1]);
            nList[i]=n;

            int[] a1=new int[m];
            
            String[] str1 = br.readLine().split(" ");
            for(int j=0;j<m;j++)
            {   
                a1[j]=Integer.parseInt(str1[j]);
            }
            aList[i]=a1;

        }
        for(int i=0;i<t;i++) 
            
            { 
                String h=prc(nList[i],aList[i]);
                bw.write(h);
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
