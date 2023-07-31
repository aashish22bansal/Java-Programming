import java.util.Scanner;

public class Program_to_Detect_a_Prime_Number
{
    public static void main(String [] args)
    {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num1, x, count=0;
        num1=sc.nextInt();
        for(x=2;x<num1;x++)
        {
            if(num1%x==0)
            {
                count++;
                break;
            }
        }
        if(count==0)
        {
            System.out.println(num1+" is a Prime number");
        }
        else
        {
            System.out.println(num1+" is not a Prime NUmber.");
        }
    }
}
