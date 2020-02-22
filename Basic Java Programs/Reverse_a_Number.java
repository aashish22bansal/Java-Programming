import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse_a_Number
{
    public static void main(String [] args) throws IOException
    {
        int num1=0,num2=0,reversenum=0;
        System.out.print("Enter a number: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num1 = num2 = Integer.parseInt(br.readLine());
        while(num1!=0)
        {
            reversenum = reversenum*10;
            reversenum = reversenum + num1%10;
            num1 = num1/10;
        }
        System.out.print("The reversed number is: "+reversenum);
    }
}
