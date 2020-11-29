import java.util.*;
public class grading {
    
    public static int gradingStudents(int nu)
    {
        if(nu>35)
        {
        
        if((5-nu%5)<3)
        return ((nu-nu%5) +5);
        return nu;
        }
        else
        return nu;
    }
    public static void main(String[] args)
    {
        int i,n,nu;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(i=0;i<n;i++)
        {
            nu=in.nextInt();
            System.out.println(gradingStudents(nu));
        }
    }
}
