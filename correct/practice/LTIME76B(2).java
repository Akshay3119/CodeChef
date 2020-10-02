/* package codechef; // don't place package name! */

import java.util.*;

import javax.lang.model.util.ElementScanner6;

import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
  
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int A,B;
            A=B=0;
            int n=Integer.parseInt(br.readLine());
            for(int i=0;i<n;i++)
            {
                int[] arr=new int[3];
                String[] str=br.readLine().split(" ");
                arr[0]=Integer.parseInt(str[0]);
                arr[1]=Integer.parseInt(str[1]);
                arr[2]=Integer.parseInt(str[2]);

                if(arr[0]==1|| arr[1]==arr[2])
                {
                    A=arr[1];
                    B=arr[2];
                    bw.write("YES");
                    bw.newLine();
                    
                }
                else
                {
                    if(Math.min(arr[1],arr[2])<Math.max(A,B))
                    {
                        if(Math.max(A,B)==A)
                        {
                            A = Math.max(arr[1],arr[2]);
                            B= Math.min(arr[1],arr[2]);
                        }
                        else
                        {
                            A = Math.min(arr[1],arr[2]);
                            B = Math.max(arr[1],arr[2]);
                        }
                        bw.write("YES");
                        bw.newLine();
                    }
                    else
                    {
                        bw.write("NO");
                        bw.newLine();
                    }

                }


            }


        }
        
        br.close();
        bw.close();  
	}
}
