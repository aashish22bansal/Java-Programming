import java.io.*;
import java.util.Scanner;

public class The_ByteArrayOutputStream_Class
{
    public static void main(String args[]) throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        System.out.print("Enter data for the Byte Array Output Stream: ");
        Scanner sc = new Scanner(System.in);
        String content = sc.nextLine();
        byte data[] = content.getBytes();
        bytearrayoutputstream.write(data);
        System.out.println(bytearrayoutputstream.toString());
        byte buffer[] = bytearrayoutputstream.toByteArray();
        for(int loop_index=0;loop_index<data.length;loop_index++)
        {
            System.out.println((char)buffer[loop_index]);
        }
        OutputStream fileoutstream = new FileOutputStream("file.txt");
        bytearrayoutputstream.writeTo(fileoutstream);
        fileoutstream.close();
    }
}
