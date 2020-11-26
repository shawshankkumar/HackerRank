import java.util.*;
public class arr {
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        int c=in.nextInt();
        int a[][]=new int[c][c];
        int i,j,f=0,t;
        int sum[]=new int[(c)*(c)];
        for(i=0;i<c*c;i++)
        {
                sum[i]=0;
        }
                for(i=0;i<c;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        for(i=1;i<c-1;i++)
        {
            for(j=1;j<c-1;j++)
            {
                sum[f++]=a[i][j]+a[i-1][j-1]+a[i-1][j+1]+a[i+1][j+1]+a[i+1][j-1]+a[i+1][j]+a[i-1][j];
                
            }
        }
        for(i=0;i<f;i++)
        {
            for(j=0;j<f-1-i;j++)
            {
                if(sum[j]<sum[j+1])
                {
                    t=sum[j];
                    sum[j]=sum[j+1];
                    sum[j+1]=t;
                }
            }
        }
       
       
        System.out.print(sum[0]);
    }
}
