/* package codechef; // don't place package name! */

import java.util.*;

import javax.lang.model.util.ElementScanner6;



import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
 class Codechef
{
    //long ascore=0;
    //long bscore=0;
    public static long getSum(int n) 
    { 
        long sum; 
        for (sum = 0; n > 0; sum += n % 10,n /= 10); 
        return sum; 
    } 
  
    public static void prc(int[] arr)
    {
        long ascore=0;
        long bscore=0;
        for(int i=0;i<arr.length;i+=2)
        {
            long p1=getSum(arr[i]);
            long p2=getSum(arr[i+1]);
            if(p1>p2)
                ascore++;
            if(p2>p1)
                bscore++;
            if(p1==p2)
            {
                ascore++;
                bscore++;
            }
            
        }
        if(ascore>bscore)
            System.out.println(0+" "+ascore);
        else if(bscore>ascore)
            System.out.println(1+" "+bscore);
        else
            System.out.println(2+" "+ascore);
           
        
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
            int[] a1=new int[2*n];
            for(int j=0;j<2*n;j+=2)
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
