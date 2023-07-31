import java.io.*;
import java.util.Scanner;

public class Using_reset_method_in_ByteArrayInputStream_Class
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data for Byte Array Input Stream: ");
        String p = sc.nextLine();
        byte data[] = p.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        for(int j=0;j<2;j++)
        {
            int N;
            while((N = in.read()) != -1)
            {
                if(j==0)
                {
                    System.out.println((char)N);
                }
                else
                {
                    System.out.println(Character.toUpperCase((char)N));
                }
            }
            System.out.println();
            in.reset();
        }
    }
}
