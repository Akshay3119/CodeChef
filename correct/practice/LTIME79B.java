/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static String prc(String S)
    {
        int oldl=S.length();
        int ans=0;
        int j=0;
        while(j<S.length()) 
        {
            int i , l = 0;
            for (i = j; i < S.length() && S.charAt(j) == S.charAt(i); i++)
                ++l;
            while(l > 0)
            {
                ans++;
                l /= 10;
            }//counting digits in the digits of no of times the letter repeated
            ans++;//that digit
            j = i;
        }
       //if((S.charAt(S.length()-1))>96)
         //   S+="1";
        //System.out.println("loop exited");
        //System.out.println(Str);
        if(ans<oldl)
            return "YES";
        else
            return "NO";   
        
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
           
            String st = br.readLine();
            sList[i]=st;

        }
        for(int i=0;i<sList.length;i++) 
            
            { 
                String h=prc(sList[i]);
                bw.write(h);
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
