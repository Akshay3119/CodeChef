/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.lang.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    public static void prc(int n,int k,int l) throws java.lang.Exception
    {
        //BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int temp=k*l;
        if(temp<n || (k==1 && n>k))
        {
            System.out.println(-1);
            return;
        }
        else
        {
            int[] ans =new int[n];
            if(k>=n)
            {
                for(int i=0;i<n;i++)
                {
                    System.out.print((i+1)+" "); 
                }
                System.out.println();
            }
            else
            {
                for(int i=0;i<n;i++)
                {
                    if(temp<1)
                    {
                        System.out.println(-1);
                        return;
                    }
                    if(i+1>k)
                    {
                        ans[i]=(i+1)%k;
                        if(ans[i]==0)
                            ans[i]=k;
                    }
                    else
                        ans[i]=(i+1);
                    temp--;
                }
                for(int i=0;i<n;i++)
                {
                    System.out.print(ans[i]+" ");
                }
                System.out.println();

            }
        } 
       // bw.close();
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        
        int t=Integer.parseInt(br.readLine());
        int[] nList=new int[t];
        int[] kList=new int[t];
        int[] lList=new int[t];
        //String[] sList =  new String[t];
        for(int i=0;i<t;i++)
        {
            String[] str = br.readLine().split(" ");
            int n=Integer.parseInt(str[0]);
            int k=Integer.parseInt(str[1]);
            int l=Integer.parseInt(str[2]);

            nList[i]=n;
            kList[i]=k;
            lList[i]=l;

        }
        for(int i=0;i<t;i++) 
                prc(nList[i],kList[i],lList[i]);
                
        br.close();
          
	}
}
