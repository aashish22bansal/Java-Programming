import java.io.*;
import java.util.Scanner;

public class The_FileInputStream_Class
{
    public static void main(String args[]) throws IOException
    {
        int size;
        FileInputStream fileInputStream = new FileInputStream("The_FileInputStream_Class.java");
        System.out.println("Available bytes: "+(size = fileInputStream.available()));
        System.out.println("Reading 20 bytes....");
        byte bytearray[] = new byte[20];
        if(fileInputStream.read(bytearray) != 20)
        {
            System.out.println("Could not get 20 bytes");
        }
        System.out.println(new String(bytearray,0,20));
        System.out.println("Skipping 20 bytes....");
        fileInputStream.skip(20);
        System.out.println("Reading 20 bytes....");
        if(fileInputStream.read(bytearray) != 20)
        {
            System.out.println("Could not get 20 bytes");
        }
        System.out.println(new String(bytearray,0,20));
        fileInputStream.close();
    }
}
