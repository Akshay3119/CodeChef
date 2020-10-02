/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
  class Codechef
{
    public static int prc(int s,int n)
    {
        int coins=0;
        if(s<=n)
        {
            if(s%2==0 || s==1)
                coins=1;
            else
                coins=2;
            return coins;
        }
        else
        {
            int t=s/n;
            coins+=t;
            s=s%n;
            if(s==1)
            {
                coins++;
                return coins;
            }
            if(s>0 && s%2==0)
                coins++;
            if(s>0 && s%2!=0)
                coins+=2;
            return coins;
        }  
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        int[] nList =  new int[t];
        int[] sList =  new int[t];
        for(int i=0;i<t;i++)
        {
            String[] str = br.readLine().split(" ");
            int n=Integer.parseInt(str[1]);
            int s=Integer.parseInt(str[0]);

           
            nList[i]=n;
            sList[i]=s;

        }
        for(int i=0;i<sList.length;i++) 
            
            { 
                int h=prc(sList[i],nList[i]);
                bw.write(String.valueOf(h));
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
