import java.awt.*;
import java.util.Scanner;
class A
{
    static void calculate(double x)
    {
        System.out.println("Square of the given number is: "+(x*x));
    }
}
class B extends A
{
    static void calculate(double x)
    {
        Scanner in = new Scanner(System.in);
        double d;
        System.out.println("Enter the second number for multiplication: ");
        d=in.nextDouble();
        System.out.println("The product of the two number is: "+(x*d));
    }
}
public class Understanding_Dynamic_Polymorphism
{
    public static void main(String args[])
    {
        A a = new B();
        B b =new B();
        Scanner input = new Scanner(System.in);
        double num;
        int choice;
        System.out.println("Enter the number for multiplication: ");
        num=input.nextDouble();
        System.out.println("\n\nMain Menu:\n1. Calculate Square\n2. Multiply with another number\nEnter your choice:");
        choice=input.nextInt();
        if(choice==1)
        {
            a.calculate(num);
        }
        else if(choice==2)
        {
            b.calculate(num);
        }
        else
        {
            System.out.println("Wrong Input");
        }
    }
}
