import java.util.Scanner;

public class Program_to_Check_a_Perfect_Square
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sqrt = (int)Math.sqrt(num);
        if(sqrt*sqrt==num)
        {
            System.out.print("The number is a perfect square. ");
        }
        else
        {
            System.out.print("The number is not a perfect square.");
        }
    }
}
