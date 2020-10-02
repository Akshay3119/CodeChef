    /* package codechef; // don't place package name! */
    
    import java.util.*;
    import java.io.*;
    
    
    /* Name of the class has to be "Main" only if the class is public. */
    class Codechef
    {
       
    	public static void main (String[] args) throws java.lang.Exception
    	{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
            //BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
            int t=Integer.parseInt(br.readLine());
            while(t-->0)
            {
                int n=Integer.parseInt(br.readLine());
                int[][] arr=new int[n][n];
                
                for(int i=0;i<n;i++)
                {
                    int[] a1=new int[n];
                    String[] str = br.readLine().split("");
                    for(int j=0;j<n;j++)
                        a1[j]=Integer.parseInt(str[j]);
                    arr[i]=a1;
                }
    
                int ilsum,irsum,flsum,frsum;
                int idiff,fdiff;
                idiff=fdiff=0;
                ilsum=irsum=flsum=frsum=0;
                for(int i=0;i<n;i++)
                    for(int j=0;j<n/2;j++)
                        if(arr[i][j]==1)
                            ilsum++;
                for(int i=0;i<n;i++)
                    for(int j=n/2;j<n;j++)
                        if(arr[i][j]==1)
                            irsum++;
                //System.out.println(ilsum+" "+irsum);
                idiff=Math.abs(ilsum-irsum);
                //System.out.println(idiff);
                if(idiff==0)
                {
                    System.out.println(idiff);
                    continue;
                }
                int erdiff=idiff;
                for(int i=0;i<n;i++)
                {
                    
                    int tl,tr,td;
                    tl=tr=td=0;
                    for(int j=0;j<n/2;j++)
                        if(arr[i][j]==1)
                            tl++;
                    for(int j=n/2;j<n;j++)
                        if(arr[i][j]==1)
                            tr++;
                    
                    td=Math.abs((ilsum-tl+tr)-(irsum-tr+tl));
                    
                    if(td<erdiff)
                    {
                        erdiff=td;
                        //rowno=i;
                    }
                    
                }
                System.out.println(erdiff);
           
            }
            br.close();
            //bw.close();  
    	}
    }
