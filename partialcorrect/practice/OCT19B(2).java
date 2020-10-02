/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int prc(int[] arr,int n,int m)
    {
        int[][] narr=new int[n][m];
        for(int i=0;i<n;i++)
            Arrays.fill(narr[i],0);
        for(int i=0;i<arr.length;i+=2)
        {
            int x=arr[i]-1;
            int y=arr[i+1]-1;
            for(int j=0;j<m;j++)
                narr[x][j]++;
            for(int j=0;j<n;j++)
                narr[j][y]++;
            narr[x][y]--;
        }
        int c=0;
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                if(narr[i][j]%2!=0)
                    c++;
    return c;
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        int[][] aList=new int[t][];
        int[] nList=new int[t];
        int[] mList=new int[t];
        //String[] sList =  new String[t];
        for(int i=0;i<t;i++)
        {
            String[] str = br.readLine().split(" ");
            int n=Integer.parseInt(str[0]);
            int m=Integer.parseInt(str[1]);
            int q=Integer.parseInt(str[2]);
            nList[i]=n;
            mList[i]=m;

           

            int[] a1=new int[2*q];
            

            for(int j=0;j<2*q;j+=2)
            {
                String[] str1 = br.readLine().split(" ");
                a1[j]=Integer.parseInt(str1[0]);
                a1[j+1]=Integer.parseInt(str1[1]);
            }
            aList[i]=a1;

        }
        for(int i=0;i<t;i++) 
            { 
                int h=prc(aList[i],nList[i],mList[i]);
                bw.write(String.valueOf(h));
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
