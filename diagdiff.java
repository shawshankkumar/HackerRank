import java.util.*;
class diagdiff
{
    public static int diagonalDifference(int[][] ar)
    {
        int i,j,ld=0,rd=0;
        for(i=0;i<ar.length;i++)
        {
            for(j=0;j<ar.length;j++)
            {
                if(i==j)
                ld+=ar[i][j];
                if((i+j)==(ar.length-1))
                rd+=ar[i][j];
            }
        }
        if(rd>ld)
        return(rd-ld);
        return(ld-rd);

    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(); int i,j;
        int a[][]=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        System.out.println(diagonalDifference(a));
    }
}