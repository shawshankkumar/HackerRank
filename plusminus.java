import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class plusminus {
    
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n,c=0,c1=0,c2=0,i;
        n=in.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==0)
            c++;
            else if(a[i]>0)
            c1++;
            else 
            c2++;

        }
        System.out.println((double)c1/(double)n);
        System.out.println((double)c2/(double)n);
        System.out.println((double)c/(double)n);
    }
}
