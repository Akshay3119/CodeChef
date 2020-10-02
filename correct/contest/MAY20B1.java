/* package codechef; // don't place package name! */

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
  
   public static void inf(ArrayList<Integer> dist)
    {
        int n=dist.size();
        //ArrayList<ArrayList<Integer>> table=new ArrayList<ArrayList<Integer>>(n);
        ArrayList<Integer> tbl=new ArrayList<Integer>(n);
        int lc=1;
        for(int i=1;i<n;i++)
        {
            //int x=dist.get(0);
            if(!(dist.get(i)-dist.get(i-1)<=2))
                break;
            lc++;
        }
        //System.out.println(lc);
        tbl.add(lc);
        if(n>2)
        {
            for(int i=1;i<n-1;i++)
            {
                int c=1;
                //int t=dist.get(i);
                for(int j=i+1;j<n;j++)
                {
                    if(!(dist.get(j)-dist.get(j-1)<=2))
                        break;
                    c++;
                }
                //System.out.println("l to r "+c);
                for(int k=i-1;k>=0;k--)
                {
                    if(!(dist.get(k+1)-dist.get(k)<=2))
                        break;
                    c++;
                }
                //System.out.print(" : "+c+" : ");
                tbl.add(c);
            }
        }
        int rc=1;
        for(int i=n-2;i>=0;i--)
        {
            //int x=dist.get(n-1);
            if(!(dist.get(i+1)-dist.get(i)<=2))
                break;
            rc++;
        }
        //System.out.println();
        //System.out.println(rc);
        tbl.add(rc);
        Collections.sort(tbl);
        
        System.out.println(tbl.get(0)+" "+tbl.get(n-1));

    }
	public static void main (String[] args) throws java.lang.Exception
	{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t=Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer> > aList =  new ArrayList<ArrayList<Integer> >(t);
        if(t>=1 && t<=2000)
        {
            for(int i=0;i<t;i++)
            {
                int n=Integer.parseInt(br.readLine());
                ArrayList<Integer> a1 = new ArrayList<Integer>(n);
                if(n>=2 && n<=8)
                {
                    String[] st = br.readLine().split(" ");
                    
                    for(int j=0;j<n;j++)
                    {
                        int z=Integer.parseInt(st[j]);
                        if(z>=0 && z<=10)
                            a1.add(z);
                    }
                    aList.add(a1);
                }
            }
            for(int i=0;i<t;i++)  
                inf(aList.get(i));
        }
	}
}
