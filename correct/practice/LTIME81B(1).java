/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    /*public static char[] reml(char[] carr)
    {
        char[]
    }*/
    public static int prc(char[] carr,int k)
    {
        List<Character> tlist=new ArrayList<>();
        for(int i=0;i<carr.length;i++)
            tlist.add(carr[i]);
        while(k>0)
        {
            if(tlist.get(tlist.size()-1)=='H')
            {
                for(int i=0;i<tlist.size()-1;i++)
                {
                    if(tlist.get(i)=='H')
                        tlist.set(i,'T');
                    else
                        tlist.set(i,'H');
                }
            }
            tlist.remove(tlist.size()-1);
            k--;
        }
        int c=0;
        for(int i=0;i<tlist.size();i++)
        {
            if(tlist.get(i)=='H')
                c++;
        }
        return c;   
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        char[][] cList=new char[t][];
        int[] kList =  new int[t];
        for(int i=0;i<t;i++)
        {
            String[] str = br.readLine().split(" ");
            int n=Integer.parseInt(str[0]);
            int k=Integer.parseInt(str[1]);
            kList[i]=k;

            String[] str2 = br.readLine().split(" ");
            char[] inarr=new char[n];

            for(int j=0;j<n;j++)
            {
                char[j]=str2[j].charAt(0); 
            }
            cList[i]=inarr;
        }
        for(int i=0;i<cList.length;i++) 
            { 
                int h=prc(cList[i],kList[i]);
                bw.write(String.valueOf(h));
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
