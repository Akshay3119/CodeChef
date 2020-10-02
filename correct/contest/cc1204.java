/* package codechef; // don't place package name! */

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
  
   public static void price(ArrayList<Integer> what)
    {
       // Integer[] al = Arrays.stream( what ).boxed().toArray( Integer[]::new );
        Integer[] al=new Integer[what.size()];
        for(int i=0;i<what.size();i++)
            al[i]=what.get(i);
        Arrays.sort(al,Collections.reverseOrder());
        //rev(al);
        int sum=0;
        int counter=0;
        for(int i=0;i<al.length;i++)
        {
            if(al[i]==0)
                break;
            else{
                al[i]-=counter++;
                if(al[i]<=0)
                    break;
                sum+=al[i];
                sum=sum%1000000007;
            }
        }
       
       
        System.out.println(sum%1000000007);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t=Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer> > aList =  new ArrayList<ArrayList<Integer> >(t);
        if(t>=1 && t<=25)
        {
            for(int i=0;i<t;i++)
            {
                ArrayList<Integer> a1 = new ArrayList<Integer>();
                
                int n=Integer.parseInt(br.readLine());
                if(n>=1 && n<=100000)
                {
                    String[] st = br.readLine().split(" ");
                    
                    for(int j=0;j<n;j++)
                    {
                        int z=Integer.parseInt(st[j]);
                        if(z>=1 && z<=1000000000)
                            a1.add(z);
                    }
                    aList.add(a1);
                }
            }
            for(int i=0;i<aList.size();i++)
            {  
            price(aList.get(i));
            }
        }
	}
}
