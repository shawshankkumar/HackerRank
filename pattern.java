import java.util.*;
public class pattern
 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,c,j,k;
        c=in.nextInt();//enter the highest number. In Kakkar's case enter 3
        k=c;
        for(i=1;i<=c;i++)
        {
            for(j=i;j<=c;j++)
            {
                System.out.print(" ");
            }
            for(j=c-1;j<k;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
            k++;
        }

        k=c;
        for(i=c-1;i>0;i--)
        {
            for(j=i;j<=c;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<k;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
             k--;
        }

    }
    
}
