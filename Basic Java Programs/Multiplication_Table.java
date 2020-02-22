import java.util.Scanner;

public class Multiplication_Table
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for the multiplication table: ");
        int table=sc.nextInt();
        System.out.print("Enter the number till which you want the table to be printed: ");
        int len= sc.nextInt();
        for(int x=0;x<=len;x++)
        {
            System.out.println(table+" X "+x+" = "+(table*x));
        }
    }
}
