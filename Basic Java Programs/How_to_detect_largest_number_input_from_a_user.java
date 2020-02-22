import java.util.Scanner;

public class How_to_detect_largest_number_input_from_a_user
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int num2=sc.nextInt();
        System.out.print("Enter the Third Number: ");
        int num3=sc.nextInt();
        int large = 0;
        if(num1>num2)
        {
            if(num1>num3)
            {
                large=num1;
            }
            else if(num3>num2)
            {
                large=num3;
            }
        }
        else if(num2>num3)
        {
            large=num2;
        }
        else
        {
            large=num3;
        }
        System.out.print("The largest number is: "+large);
    }
}
