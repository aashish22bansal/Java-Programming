import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        int number;
        StackArray stack;
        stack = new StackArray();
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        //int a;
        System.out.println("Enter an integer [-1 to end]: ");
        number = scanner.nextInt();
        while(number >= 0 && !stack.full()) {
            stack.push(number);
            System.out.print("Enter an integer [-1 to end]: ");
            number = scanner.nextInt();
        }
        System.out.println();
        System.out.print("The reverse integers are: ");
        while(!stack.empty())
            System.out.print(stack.pop()+" ");
        System.out.println();
        System.out.println();
    }
}