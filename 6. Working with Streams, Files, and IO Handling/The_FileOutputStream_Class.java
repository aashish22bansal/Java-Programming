import java.io.*;
import java.util.Scanner;

public class The_FileOutputStream_Class
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the content to enter the Buffered Stream Input: ");
        String content = sc.nextLine();
        byte data[] = content.getBytes();
        FileOutputStream fileOutputStream = new FileOutputStream("file1.txt");
        for(int loop_index=0;loop_index<data.length;loop_index++)
        {
            fileOutputStream.write(data[loop_index]);
        }
        FileOutputStream fileOutputStream1 = new FileOutputStream("file2.txt");
        fileOutputStream1.write(data);
        FileOutputStream fileOutputStream2 = new FileOutputStream("file3.txt");
        fileOutputStream2.write(data,5,10);
        fileOutputStream.close();
        fileOutputStream1.close();
        fileOutputStream2.close();
    }
}
