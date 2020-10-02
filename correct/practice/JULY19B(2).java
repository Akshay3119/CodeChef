/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.BigInteger;


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
            String s2=br.readLine();
            BigInteger n = new BigInteger(s2);
            
            String s=br.readLine();
            BigInteger k = new BigInteger(s);
            

            BigInteger r=k.mod(n);
            BigInteger remplc=n.subtract(r);
            if(r.equals(BigInteger.valueOf(0)) || remplc.equals(BigInteger.valueOf(0)))
            {
                bw.write(0);
                bw.newLine();
                continue;
            }
            BigInteger diff=r.subtract(remplc).abs();
            if(n.mod(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0)))
            {
                if(diff.equals(BigInteger.valueOf(0)))
                {
                    bw.write(n.subtract(BigInteger.valueOf(1)).toString());
                    bw.newLine();
                    continue;
                }
                bw.write(n.subtract(diff).toString());
                bw.newLine();
            }
            else
            {
                bw.write(n.subtract(diff).toString());
                bw.newLine();
            }
        }
        br.close();
        bw.close();  
	}
}
