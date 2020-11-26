import java.util.*;
class triplets
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[][]=new int[3][3];
        int i,j,c=0,f=0;
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=in.nextInt();
        }
        }
        for(i=0;i<3;i++)
        {
           if(a[0][i]>a[1][i])
           c++;
           if(a[0][i]<a[1][i])
           
           f++;
        }
        System.out.print(c+" "+f);
    }
}