/* package codechef; // don't place package name! */

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
  
     public static void fruits(ArrayList<Integer> ftype,ArrayList<Integer> price,int m)
    {
        ArrayList<Long> psum=new ArrayList<Long>(m);
        int x=0;
        while(x<m)
        {
            long tsum=0;
            for(int i=0;i<price.size();i++)
            {
                if(ftype.get(i)==x+1)
                    tsum+=price.get(i);  
            }
            if(tsum!=0 || price.contains(0))
                psum.add(tsum);
            x++;
        }
        Collections.sort(psum);
        System.out.println(psum.get(0));   
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t=Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer> > aList1 =  new ArrayList<ArrayList<Integer> >(t);
        ArrayList<ArrayList<Integer> > aList2 =  new ArrayList<ArrayList<Integer> >(t);
        ArrayList<Integer> mval=new ArrayList<Integer>(t);
        if(t>=1 && t<=1000)
        {
            for(int i=0;i<t;i++)
            {
                
                String[] s1=br.readLine().split(" ");
                int n=Integer.parseInt(s1[0]);
                int m=Integer.parseInt(s1[1]);
                mval.add(m);
                ArrayList<Integer> a1 = new ArrayList<Integer>();
                ArrayList<Integer> a2 = new ArrayList<Integer>();
                if(n>=1 && n<=50 && m>=1 && m<=50)
                {   
                    String[] s2 = br.readLine().split(" ");
                    for(int j=0;j<n;j++)
                        if(Integer.parseInt(s2[j])>=1 && Integer.parseInt(s2[j])<=m)
                            a1.add(Integer.parseInt(s2[j]));
                    aList1.add(a1);
                    String[] s3 = br.readLine().split(" ");
                    for(int j=0;j<n;j++)
                        if(Integer.parseInt(s3[j])>=0 && Integer.parseInt(s3[j])<=50)
                            a2.add(Integer.parseInt(s3[j]));
                    aList2.add(a2);
                }
            }
            for(int i=0;i<t;i++) 
                fruits(aList1.get(i),aList2.get(i),mval.get(i));
        }
	}
}
