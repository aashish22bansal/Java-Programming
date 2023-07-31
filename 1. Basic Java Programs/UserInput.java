import com.sun.org.apache.xerces.internal.impl.XMLEntityScanner;

import java.util.Scanner;
import java.io.*;

public class UserInput
{
    public static void main(String [] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first number: ");
        num1 = Integer.parseInt(br.readLine());
        System.out.print("Enter second number: ");
        num2 = Integer.parseInt(br.readLine());
        System.out.print("Output: "+(num1+num2));
    }
}
