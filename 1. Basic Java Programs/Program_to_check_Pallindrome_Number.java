import java.util.Scanner;

public class Program_to_check_Pallindrome_Number
{
    public static void main(String [] args)
    {
        int w,x,y=0,z=0;
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        w=z;
        while(z>0)
        {
            x=z%10;
            y=(y*10)+x;
            z=z/10;
        }
        if(w==y)
        {
            System.out.print("It is a palindrome!");
        }
        else
        {
            System.out.print("It is not a palindrome!");
        }
    }
}