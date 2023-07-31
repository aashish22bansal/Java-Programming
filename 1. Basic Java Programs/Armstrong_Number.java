import java.util.Scanner;

public class Armstrong_Number
{
    public static void main(String args[])
    {
        int n,sum=0,temp,remainder,digits=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number to check if it is an Armstrong Number: ");
        n=in.nextInt();
        temp=n;
        // storing it in a temporary variable so that the value stored in the actual variable is not compromised.
        // Now we will count the number of digits
        while(temp!=0)
        {
            remainder=temp%10;
            sum+=Math.pow(remainder,3);
            temp/=10;
        }
        if(sum==n)
        {
            System.out.print("The number is an Armstrong Number.");
        }
        else
        {
            System.out.print("The number is not an Armstrong Number.");
        }
    }
}
