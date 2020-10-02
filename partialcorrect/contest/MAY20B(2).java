/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
   public static int isolation(String S,int ic)
    {
            char[] chr=new char[S.length()];
            for(int i=0;i<S.length();i++)
                chr[i]=S.charAt(i);
        
            ArrayList<ArrayList<Character>> carr=new ArrayList<ArrayList<Character>>();
            int c=0;
             
            for(int i=0;i<chr.length;i++)
            {
                int x=0;
                for(int k=0;k<ic;k++)
                {
                    if(k>=carr.size()-1)
                    {
                        ArrayList<Character> tarr=new ArrayList<Character>();
                        carr.add(tarr);
                    } 
                    if(!(carr.get(k).contains(chr[i])))
                    {
                        carr.get(k).add(chr[i]);
                        x=1;
                        break ;
                    }  
                }
                if(x==0)
                    c++; 
            }
            return c;
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        int[][] aList=new int[t][];
        String[] sList =  new String[t];

            for(int i=0;i<t;i++)
            {
                String[] str = br.readLine().split(" ");
                int n=Integer.parseInt(str[0]);
                int q=Integer.parseInt(str[1]);
                int[] a1=new int[q];
                
                    String st = br.readLine();
                    sList[i]=st;
                    
                    for(int j=0;j<q;j++)
                    {
                        String m=br.readLine();
                        int z=Integer.parseInt(m);
                        a1[j]=z;
                    }
                    aList[i]=a1;
                
            }
            for(int i=0;i<aList.length;i++) 
                for(int j=0;j<aList[i].length;j++)
                { 
                    int h=isolation(sList[i],aList[i][j]);
                    bw.write(String.valueOf(h));
                    bw.newLine();
                }
            br.close();
            bw.close();

        
	}
}
