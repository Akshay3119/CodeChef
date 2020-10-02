/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static String prc(int[] arr)
    {
        String str1="";
        for(int i=0;i<arr.length;i++)
        {
            str1+=Integer.toString(arr[i]);
            int j=i+1;
            int t=1;
            //System.out.println("OLD "+"i= "+i+" j= "+j+" t= "+t);
            while(j<arr.length && arr[j]==arr[i]+t)
            {
                j++;
                t++;
            }
            //System.out.println("NEW "+"i= "+i+" j= "+j+" t= "+t);
            j--;
            if(j>=i+2)
            {
                str1+="...";
                str1+=Integer.toString(arr[j]);
                if(j!=arr.length-1)
                    str1+=",";
                i=j;
                continue;
            }
            else
            {
                if(i!=arr.length-1)
                    str1+=",";
            }
            
        }
        return str1; 
           
        
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
        for(int i=0;i<aList.length;i++) 
            
            { 
                String h=prc(aList[i]);
                bw.write(h);
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
