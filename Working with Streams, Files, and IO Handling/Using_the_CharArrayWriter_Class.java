import java.io.*;
import java.util.Scanner;

public class Using_the_CharArrayWriter_Class
{
    public static void main(String args[]) throws IOException
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string to write to the Char Array Writer: ");
        String context=in.nextLine();
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        String w = context;
        char buf[]=new char[w.length()];
        w.getChars(0,w.length(),buf,0);
        charArrayWriter.write(buf);
        System.out.println("\nBuffer of default size: "+charArrayWriter.toString());
        System.out.println("\n\nWhat goes into the array-->");
        char A[] = charArrayWriter.toCharArray();
        for(int j = 0;j<A.length;j++)
        {
            System.out.println(A[j]);
        }
        System.out.println("Finally going to FileWriter()--> ");
        FileWriter f2 = new FileWriter("FileWriter.txt");
        charArrayWriter.writeTo(f2);
        f2.close();
        System.out.println("Reseting this.");
        charArrayWriter.reset();
        for(int j=0;j<3;j++)
        {
            charArrayWriter.write('o');
        }
        System.out.println(charArrayWriter.toString());
    }
}
