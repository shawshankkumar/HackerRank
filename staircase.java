import java.util.*;
class staircase
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n;
        n=in.nextInt();
        int i,j,k; k=n-1;
        for(i=0;i<n;i++)
        {
            for(j=k;j>0;j--)
            {
                System.out.print(" ");
            }
            for(j=k;j<n;j++)
            {
                System.out.print("#");
            }
            System.out.println();
            k--;
        }
    }
}