import java.util.Scanner;

class SwapFirst
{
    int num1,num2,a,b;
    SwapFirst(int a,int b)
    {
        num1 = a;
        num2 = b;
    }
}
class SwapSecond
{
    void swap(SwapFirst s)
    {
        int output=s.num1;
        s.num1=s.num2;
        s.num2=output;
    }
}
public class SwappingTwoDifferentValues
{
    public static void main(String [] args)
    {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter another number: ");
        int b = sc.nextInt();
        swap(a,b);
        System.out.print("After swapping the numbers: A = "+a+" , B = "+b);
         */
        SwapFirst s1 = new SwapFirst(20,10);
        System.out.println("Numbers before swapping are "+s1.num1+" and "+s1.num2);
        SwapSecond s2 = new SwapSecond();
        s2.swap(s1);
        System.out.println("After swapping: "+s1.num1+" and "+s1.num2);
    }
    /*
    public static int swap(int a, int b)
    {
        int c;
        c=a;
        a=b;
        b=c;
        return a;
    }
     */
}
