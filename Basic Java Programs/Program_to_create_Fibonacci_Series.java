public class Program_to_create_Fibonacci_Series
{
    public static void main(String [] args)
    {
        int w=0,x=1,y,z,count=20;
        System.out.println("Fibnacci Sequence: ");
        System.out.print(w+" "+x);
        for(z=2;z<count;z++)
        {
            y=w+x;
            System.out.print(" "+y);
            w=x;
            x=y;
        }
    }
}
