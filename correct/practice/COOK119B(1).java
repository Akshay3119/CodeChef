/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
 class Codechef
{
    public static boolean contains(int[] array, int v) {

        boolean result = false;

        for(int i : array){
            if(i == v){
                result = true;
                break;
            }
        }

        return result;
    }
    public static boolean empty(int[] array)
    {
        int count=0;
        //boolean result=true;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==-1)
                count++;
        }
        if(count==array.length)
            return true;
        else
            return false;
    }

    public static int prc(int n,int b,int[] narr)
    {
        int count=0;
        int[] oarr=new int[n];
        int t=0;
        for(int i=0;i<oarr.length;i++)
            oarr[i]=t++;
        int[] carr=new int[b];
        Arrays.fill(carr,-1);
        //int parts=n/b;
        for(int i=0;i<narr.length;i++)
        {
            //System.out.println("element "+narr[i]);
            if(empty(carr) || !contains(carr, narr[i]) )
            {
                //System.out.println("inside element "+narr[i]);
                int block=narr[i]/b;
                //System.out.println(oarr[i]);
                //System.out.println("block number "+block);
                int t2=0;
                for(int j=block*b;j<block*b+b;j++)
                {
                    if (j<oarr.length)
                        carr[t2++]=oarr[j];
                    else
                        carr[t2++]=-1;
                }
                /*for(int z=0;z<carr.length;z++)
                    System.out.print(carr[z]+" ");
                System.out.println();*/
                count++;
                //  System.out.println(count);
                

            }
        }
        return count;
        
           
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        int[][] aList=new int[t][];
        int[] nList =  new int[t];
        int[] bList =  new int[t];
        for(int i=0;i<t;i++)
        {
            String[] str = br.readLine().split(" ");
            int n=Integer.parseInt(str[0]);
            int b=Integer.parseInt(str[1]);
            int m=Integer.parseInt(str[2]);
            nList[i]=n;
            bList[i]=b;

            String[] str2 = br.readLine().split(" ");
            int[] a1=new int [m];

            for(int j=0;j<m;j++)
            {
                
                a1[j]=Integer.parseInt(str2[j]);
            }
            aList[i]=a1;

        }
        for(int i=0;i<aList.length;i++) 
            
            { 
                int h=prc(nList[i],bList[i],aList[i]);
                bw.write(String.valueOf(h));
                bw.newLine();
            }
        br.close();
        bw.close();  
	}
}
