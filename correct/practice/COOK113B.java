/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int prc(int[] orgarr)
    {
        Integer[] freqarr=new Integer[101];
        Arrays.fill(freqarr,0);
        for(int c:orgarr)
            freqarr[c]++;
        int maxfreq=Collections.max(Arrays.asList(freqarr));
        /*int maxfreqel=freqarr[maxindex];
        int m=0;
        for(int i=1;i<orgarr.length;i++)
        {
            if(orgarr[i]!=maxfreqel && (orgarr[i-1]==maxfreqel || orgarr[i+1]==maxfreqel))
            {
                if(orgarr[i-1]==maxfreqel)
                    orgarr[i]=orgarr[i-1];
                else
                    orgarr[i]=orgarr[i+1];
                m++;
            }
        }*/
        return (orgarr.length-maxfreq);

        
           
        
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
                int h=prc(aList[i]);
                bw.write(String.valueOf(h));
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
