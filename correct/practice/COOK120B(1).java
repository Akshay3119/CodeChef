/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;



/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static String prc(String S)
    {
        StringBuffer sb=new StringBuffer();
        sb.append(S);
        int[] farr=new int[26];
        Arrays.fill(farr,0);
        for(int i=0;i<sb.length();i++)
        {
            farr[sb.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++)
        {
            if(farr[i]%2!=0)
                return "NO";
        }
        return "YES";   
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        //int[][] aList=new int[t][];
        String[] sList =  new String[t];
        for(int i=0;i<t;i++)
        {
            int n=Integer.parseInt(br.readLine());
            String str=br.readLine();
            sList[i]=str;
        }
        for(int i=0;i<t;i++) 
            
            { 
                String h=prc(sList[i]);
                bw.write(h);
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
