/* package codechef; // don't place package name! */

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
  
     public static void lift(ArrayList<Integer> al)
    {
        long dist=al.get(0);
        dist+=Math.abs(al.get(1)-al.get(0));
        //System.out.println(dist);
        for(int i=2,j=1;i<al.size()-1 && j<al.size();i+=2,j+=2)
        { 
            dist+=Math.abs(al.get(i)-al.get(j));
            if(j+2==al.size()-1)
            {
                dist+=Math.abs(al.get(al.size()-1)-al.get(al.size()-2));
                break;
            }
            dist+=Math.abs(al.get(j+2)-al.get(i));
        }
     System.out.println(dist);  
       
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t=Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer> > aList =  new ArrayList<ArrayList<Integer> >(t);
        if(t>=1 && t<=250)
        {
            for(int i=0;i<t;i++)
            {
                
                String[] s1=br.readLine().split(" ");
                int n=Integer.parseInt(s1[0]);
                int q=Integer.parseInt(s1[1]);
                ArrayList<Integer> a1 = new ArrayList<Integer>();
                if(n>=1 && n<=1000000 && q>=1 && q<=100000)
                {   
                    for(int j=0;j<q;j++)
                    {
                        String[] s2 = br.readLine().split(" ");
                        a1.add(Integer.parseInt(s2[0]));
                        a1.add(Integer.parseInt(s2[1]));
                    }
                    aList.add(a1);
                }
            }
            for(int i=0;i<aList.size();i++)
            {  
                lift(aList.get(i));
            }
        }
	}
}
