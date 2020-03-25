import java.io.*;
import java.util.Scanner;

public class The_ByteArrayInputStream_Class
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data to enter into the Byte Array Input Stream: ");
        String content = sc.nextLine();
        byte data[] = content.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        int character;
        while((character = in.read()) != -1)
        {
            System.out.println((char)character);
        }
    }
}
