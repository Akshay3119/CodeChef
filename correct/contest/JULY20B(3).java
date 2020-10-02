/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void prc(int[] arr)
    {
        int x,y;
        x=y=0;
        HashMap<Integer,Integer> xf=new HashMap<>();
        for(int i=0;i<arr.length;i+=2)
        {
            if(xf.containsKey(arr[i]))
            {
                int temp=xf.get(arr[i]);
                xf.replace(arr[i],temp+1);
            }
            else
                xf.put(arr[i],1);
        }
        HashMap<Integer,Integer> yf=new HashMap<>();
        for(int i=1;i<arr.length;i+=2)
        {
            if(yf.containsKey(arr[i]))
            {
                int temp=yf.get(arr[i]);
                yf.replace(arr[i],temp+1);
            }
            else
                yf.put(arr[i],1);
        }
        for (Map.Entry<Integer, Integer> entry : xf.entrySet()) 
        {
            if (entry.getValue()%2!=0) 
            {
                x=entry.getKey();
                break;
            }
        }
        for (Map.Entry<Integer, Integer> entry2 : yf.entrySet()) 
        {
            if (entry2.getValue()%2!=0) 
            {
                y=entry2.getKey();
                break;
            }
        }
        System.out.println(x+" "+y);
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        int[][] aList=new int[t][];
        //String[] sList =  new String[t];
        for(int i=0;i<t;i++)
        {
            int n=Integer.parseInt(br.readLine());

            int[] a1=new int[2*(4*n-1)];

            for(int j=0;j<2*(4*n-1);j+=2)
            {
                String[] str = br.readLine().split(" ");
                a1[j]=Integer.parseInt(str[0]);
                a1[j+1]=Integer.parseInt(str[1]);
            }
            aList[i]=a1;

        }
        for(int i=0;i<t;i++) 
            
            { 
                prc(aList[i]);
                //bw.write(String.valueOf(h));
                //bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
