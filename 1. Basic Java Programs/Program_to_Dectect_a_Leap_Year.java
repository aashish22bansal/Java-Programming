import java.util.Scanner;

public class Program_to_Dectect_a_Leap_Year
{
    public static void main(String [] args)
    {
        System.out.print("Enter an year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year%400==0)||(year%4==0)&&(year%100!=0))
        {
            System.out.print("This is a leap year");
        }
        else
        {
            System.out.print("This is not a leap year.");
        }
    }
}
