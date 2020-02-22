import java.util.Scanner;
public class BasicArithmeticCalculator
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String TIME;
        do
        {
            System.out.print("Enter the First Operand: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the Second Operand: ");
            int num2 = sc.nextInt();
            System.out.print("Enter the Operator: ");
            String operator = sc.next();
            switch (operator)
            {
                case "+":
                    System.out.print("The Output is: " + (num1 + num2));
                    break;
                case "-":
                    System.out.print("The Output is: " + (num1 - num2));
                    break;
                case "*":
                    System.out.print("The Output is: " + (num1 * num2));
                    break;
                case "/":
                    System.out.print("The Output is: " + (num1 / num2));
                    break;
                case "%":
                    System.out.print("The Output is: " + (num1 % num2));
                    break;
                default:
                    System.out.print("Enter a valid operator!");
                    break;
            }//end of switch
            System.out.print("\nDo you wish to continue?(Y/N): ");
            TIME = sc.nextLine();
        }while (TIME.equals('Y'));
    }
}