/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.lang.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static String prc(String S,int k)
    {
        int l=S.length();
        int zcnt,ocnt;
        zcnt=ocnt=0;
        StringBuffer str=new StringBuffer(S);
        for(int i=0;i<l;i++)
        {
            if(str.charAt(i)=='0')
                zcnt++;
            else
                ocnt++;
        }
        int kseg=l/k;
        
        if(!(zcnt%kseg==0 && ocnt%kseg==0))
            return "IMPOSSIBLE";

        int zseg=zcnt/kseg;
        int oseg=ocnt/kseg;
        //System.out.println("zseg: "+zseg);

        StringBuffer t1=new StringBuffer();
        while(zseg-->0)
            t1.append('0');
        while(oseg-->0)
            t1.append('1');
        
            
        //System.out.println("t1: "+t1.toString());
        
        StringBuffer cpy=new StringBuffer(t1);
        t1.reverse();
        
        //System.out.println("t2: "+t2.toString());
        
        
        StringBuffer ans=new StringBuffer();
        for(int i=0;i<kseg;i++)
        {
            if(i%2==0)
                ans.append(cpy);
            else
                ans.append(t1);
        }
        
        return ans.toString();
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        int[] kList=new int[t];
        String[] sList =  new String[t];
        for(int i=0;i<t;i++)
        {
            String[] str = br.readLine().split(" ");
            int n=Integer.parseInt(str[0]);
            int k=Integer.parseInt(str[1]);
            kList[i]=k;

            //int[] a1=new int[q];
            String st = br.readLine();
            sList[i]=st;

        }
        for(int i=0;i<t;i++) 
            
            { 
                String h=prc(sList[i],kList[i]);
                bw.write(h);
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
