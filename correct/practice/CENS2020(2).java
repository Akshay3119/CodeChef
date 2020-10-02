/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.lang.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        //int[][] aList=new int[t][];
        //String[] sList =  new String[t];
        while(t-->0)
        {
            String st=br.readLine();
            char[] ch=st.toCharArray();
            //StringBuilder str1=new StringBuilder(st);


            String[] str = br.readLine().split(" ");
            int x1=Integer.parseInt(str[0]);
            int y1=Integer.parseInt(str[1]);

            int q=Integer.parseInt(br.readLine());
            //int[] arr=new int[2*q]

           //StringBuilder sb1=new StringBuilder();
           //StringBuilder sb2=new StringBuilder();
           int[] farr=new int[4];
                Arrays.fill(farr,0);
                for(int u=0;u<ch.length;u++)
                {
                    if(ch[u]=='L')
                        farr[0]++;
                    if(ch[u]=='R')
                        farr[1]++;
                    if(ch[u]=='U')
                        farr[2]++;
                    if(ch[u]=='D')
                        farr[3]++;
                }
            a1:for(int j=0;j<q;j++)
            {
                String[] str2 = br.readLine().split(" ");
                int xn=Integer.parseInt(str2[0]);
                int yn=Integer.parseInt(str2[1]);
                
                
                if(xn>=x1 && yn>=y1)
                {
                    int xdiff=xn-x1;
                    int ydiff=yn-y1;
                    
                    if(farr[2]>=ydiff && farr[1]>=xdiff)
                    {
                        int at=xdiff+ydiff;
                        bw.write("YES ");
                        bw.write(String.valueOf(at));
                        bw.newLine();
                        continue a1;
                    }
                    else
                    {
                        bw.write("NO");
                        bw.newLine();
                    }
                        
                    
                }
                if(xn>=x1 && yn<y1)
                {
                    int xdiff=xn-x1;
                    int ydiff=y1-yn;
                    
                    if(farr[3]>=ydiff && farr[1]>=xdiff)
                    {
                        int at=xdiff+ydiff;
                        bw.write("YES ");
                        bw.write(String.valueOf(at));
                        bw.newLine();
                        continue a1;
                    }
                    else
                    {
                        bw.write("NO");
                        bw.newLine();
                    }
                }
                if(xn<x1 && yn>=y1)
                {
                    int xdiff=x1-xn;
                    int ydiff=yn-y1;
                    
                    if(farr[2]>=ydiff && farr[0]>=xdiff)
                    {
                        int at=xdiff+ydiff;
                        bw.write("YES ");
                        bw.write(String.valueOf(at));
                        bw.newLine();
                        continue a1;
                    }
                    else
                    {
                        bw.write("NO");
                        bw.newLine();
                    }
                }
                if(xn<x1 && yn<y1)
                {
                    int xdiff=x1-xn;
                    int ydiff=y1-yn;
                   
                    if(farr[3]>=ydiff && farr[0]>=xdiff)
                    {
                        int at=xdiff+ydiff;
                        bw.write("YES ");
                        bw.write(String.valueOf(at));
                        bw.newLine();
                        continue a1;
                    }
                    else
                    {
                        bw.write("NO");
                        bw.newLine();
                    }
                }

            }
            

        }
        
        br.close();
        bw.close();  
	}
}
