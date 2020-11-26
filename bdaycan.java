import java.util.*;
public class bdaycan {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n;
        n=in.nextInt();
        int a[]=new int[n];
        int i,c=0,f=0;
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            if(c<a[i])
            c=a[i];
        }
        for(i=0;i<n;i++)
        {
            if(c==a[i])
            f++;
        }
        System.out.println(f);

    }
}
