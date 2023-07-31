import java.util.Scanner;

public class Decimal_to_Binary
{
    public static int[] Convert(int num1)
    {
        int bin[] = new int[50];
        int ind = 0;

        while(num1>0)
        {
            bin[ind++] = num1%2;
            num1=num1/2;
        }
        System.out.print("The Binary Equivalent is: ");
        for(int x = ind-1;x>=0;x--)
        {
            System.out.print(bin[x]);
        }
        return bin;
    }
    public static void main(String [] args)
    {
        Decimal_to_Binary dtb = new Decimal_to_Binary();
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Convert(num);
    }
}
