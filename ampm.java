import java.util.*;
public class ampm {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String inp,o,ss;
        inp=in.next();
        o=":"+inp.substring(3,5)+":"+inp.substring(6,8);
        int n=Integer.parseInt(inp.substring(0,2));
        int l=inp.lastIndexOf(':');
        ss=inp.substring(8);
        
        if(ss.equalsIgnoreCase("PM"))
        {
        if(n!=12)    
        n=n+12;
        
        }
        else
        {
            if(n==12)
            n=0;
        }
        if(n<10)
        o="0"+n+o;
        else
        o=n+o;
        System.out.println(o);
    }
}
