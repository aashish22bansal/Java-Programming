import java.util.Scanner;

public class Program_to_calculate_Factorials
{
    public static void main(String [] args)
    {
        int num1,num2,num3=1;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        num1=sc.nextInt();
        if(num1<0)
        {
            System.out.println("Enter a positive number!");
        }
        else
        {
            for(num2=1;num2<=num1;num2++)
            {
                num3*=num1;
            }
            System.out.println("Factorial: "+num3);
        }
    }
}
