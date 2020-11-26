import java.util.*;
public class minmaxsum 
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[5];
        int i,min=0,max=0,c=0,t,j;
        int sum[]=new int[5];
        for(i=0;i<5;i++)
        {
            a[i]=in.nextInt();
        }
        while(c<5)
        {
        for(i=0;i<5;i++)
        {
            if(i!=c)
            sum[c]+=a[i];
        }
        c++;
    }
    for(i=0;i<4;i++)
    {
        for(j=0;j<4-i;j++)
        {
            if(sum[j]>sum[j+1])
            {
                t=sum[j];
                sum[j]=sum[j+1];
                sum[j+1]=t;
            }
        }
    }
    System.out.println(sum[0]+" "+sum[4]);
    }
    
}
