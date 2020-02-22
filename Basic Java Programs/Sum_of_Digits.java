import java.util.Scanner;

public class Sum_of_Digits
{
    public static void main(String [] args)
    {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;
        while(num!=0)
        {
            int rem=(num%10);
            sum+=rem;
            num/=10;
        }
        System.out.print("The sum of the digits is: "+sum);
    }
}
