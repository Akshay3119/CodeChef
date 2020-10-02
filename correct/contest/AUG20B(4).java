/* package codechef; // don't place package name! */
import java.lang.*;
import java.util.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static String insertString(StringBuilder originalString,String stringToBeInserted,int index) 
    { 
        //StringBuffer newString = new StringBuffer(originalString); 
        originalString.insert(index + 1, stringToBeInserted); 
        return originalString.toString(); 
    } 
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        //int[][] aList=new int[t][];
        //String[] sList =  new String[t];
        //String[] pList =  new String[t];
        while(t-->0)
        {
           String s=br.readLine();
           String p=br.readLine();
           
            TreeMap<Character,Integer> hm=new TreeMap<>();
            for(int i=0;i<s.length();i++)
            {
                if(hm.containsKey(s.charAt(i)))
                {
                    int temp=hm.get(s.charAt(i));
                    hm.replace(s.charAt(i), temp+1);
                }
                else 
                    hm.put(s.charAt(i), 1);
            }
            for(int i=0;i<p.length();i++)
            {
                if(hm.containsKey(p.charAt(i)))
                {
                    int temp=hm.get(p.charAt(i));
                    hm.replace(p.charAt(i), temp-1);
                }
                else
                    hm.remove(p.charAt(i));
            }
            
            String ans=new String();
            StringBuilder srtd=new StringBuilder();
            //int[] carr=new int[s.length()-p.length()];
            for(Map.Entry<Character,Integer> ent : hm.entrySet())
            {
                while(ent.getValue()>0)
                {
                    srtd.append(ent.getKey());
                    hm.replace(ent.getKey(),ent.getValue()-1);
                }
            }
            
            
            //System.out.println("sorted: "+str1);
            //String str2=str1;
            if(srtd.length()==0)
            {
                bw.write(p);
                bw.newLine();
                continue;
            }
            int temp=p.charAt(0);
            int index=0;
            if(srtd.charAt(0)>temp)
            {
                //System.out.println("1stcon_index: "+-1);
                ans=insertString(srtd,p, -1);
                bw.write(ans);
                bw.newLine();
                continue;
            }

            if(srtd.charAt(srtd.length()-1)<temp)
            {
                index=srtd.length()-1;
                //System.out.println("2ndcon_index: "+index);
                ans= insertString(srtd,p, index);
                bw.write(ans);
                bw.newLine();
                continue;
            }
            for(int x=1;x<srtd.length()-1;x++)
            { 
                if(temp==srtd.charAt(x))
                {
                    int t2=0;
                    while(temp==p.charAt(t2))
                        t2++;
                    if(temp>p.charAt(t2))
                        index=x-1;
                    else
                        index=srtd.lastIndexOf(Character.toString(srtd.charAt(x)));
                    break;
                }
                if(srtd.charAt(x)>temp)
                {
                    index=x-1;
                    break;
                }
            }
            //System.out.println("index: "+index);
            
            ans=insertString(srtd,p, index);
            bw.write(ans);
            bw.newLine();
        }
        br.close();
        bw.close();  
	}
}
