import java.util.*;
class bigsum
{
    public static long summ(int[] arr)
    {
        long sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] agrs)
    {
        int i;
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println(summ(a));
    }
}