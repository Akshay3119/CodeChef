/* package codechef; // don't place package name! */

import java.util.*;

import javax.lang.model.util.ElementScanner6;

import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int count(ArrayList<Integer> al,int n)
    {
        int c=0;
        int el=al.get(n-1);
        for(int i=0;i<n;i++)
        {
            if(al.get(i)==el)
                c++;
        }
        return c;
    }
    public static int gl=-100;
    public static boolean contains( ArrayList<Integer> al, int v)
     {
        boolean result = false;
        for(int i=al.size()-2;i>=0;i--)
        {
            if(al.get(i) == v)
            {
                result = true;
                gl=i;
                break;
            }
        }
        return result;
    }
    public static int prc(int e)
    {
        //int[] arr =new int [128];
        ArrayList<Integer> al=new ArrayList<>();
        //Arrays.fill(arr,-99);
        al.add(0);
        al.add(0);
        for(int i=1;i<128;i++)
        {
            if(contains(al, al.get(i)))
            {
                al.add(al.size()-gl-1);
                //System.out.print(" if ");
            }
            else
            {
                al.add(0);
                //System.out.print(" else ");
            }
        }
        /*for(int i=0;i<10;i++)
         System.out.print(al.get(i)+" ");*/
        //System.out.println(al.size());
        int ans=count(al, e);

        return ans;
          
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        int[] aList=new int[t];
        //String[] sList =  new String[t];
        for(int i=0;i<t;i++)
        {
           aList[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<t;i++) 
           
            { 
                int h=prc(aList[i]);
                bw.write(String.valueOf(h));
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
