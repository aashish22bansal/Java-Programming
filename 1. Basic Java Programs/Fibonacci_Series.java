import java.util.Scanner;
public class Fibonacci_Series
{
    public static void main(String args[])
    {
        int n,t1=0,t2=1;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter how many numbers you want to be printed: ");
        n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print(t1+" , ");
            int sum=t1+t2;
            t1=t2;
            t2=sum;
        }
    }
}
