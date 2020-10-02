/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static boolean duplicates(int[] zipcodelist)
    {
        Set<Integer> lump = new HashSet<Integer>();
        for (int i : zipcodelist)
        {
            if (i!=0 && lump.contains(i))
                return true;
            lump.add(i);
        }
        return false;
    }
    public static String prc(int[] arr)
    {
        int c=0;
        int[] freq=new int[1001];
        Arrays.fill(freq,0);
        for(int i:arr)
            freq[i]++;
        /*for(int i=0;i<freq.length;i++)
            System.out.print(freq[i]+" ");*/
        if(duplicates(freq))
        {
            c=1;
            //System.out.println("Changed earlier");
        }
        if(c==1)
            return "NO";
        outer:for(int i=0;i<arr.length;i++)
        {
            while(i+1<arr.length && arr[i+1]==arr[i])
                i++;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]==arr[i])
                {
                    c=1;
                    //System.out.println("Changed later");
                    break outer;
                }
            }
            
        }
        if(c==1)
            return "NO";
        else
            return "YES";  
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        int[][] aList=new int[t][];
        
        for(int i=0;i<t;i++)
        {
            
            int n=Integer.parseInt(br.readLine());
            int[] a1=new int[n];
            String[] str = br.readLine().split(" ");

            for(int j=0;j<n;j++)
            {
                a1[j]=Integer.parseInt(str[j]);
            }
            aList[i]=a1;
        }
        for(int i=0;i<aList.length;i++) 
            
            { 
                String h=prc(aList[i]);
                bw.write(h);
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
