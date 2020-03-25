import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.util.Scanner;

public class Essentials_in_NIO
{
    private static final int File_Size = 1024;
    public static void main(String args) throws Exception
    {
        System.out.println("Hello World!");
        FileChannel file_Channel = new FileOutputStream("New_File.txt").getChannel();
        Scanner in = new Scanner(System.in);
        String content = "";
        System.out.println("Enter the String to enter to the file: ");
        content=in.toString();
        file_Channel.write(ByteBuffer.wrap(content.getBytes()));
        file_Channel.close();

        file_Channel = new RandomAccessFile("New_File.txt","rw").getChannel();
        file_Channel.position(file_Channel.size());
        file_Channel.write(ByteBuffer.wrap(content.getBytes()));
        file_Channel.close();

        file_Channel = new FileInputStream("New_File.txt").getChannel();
        ByteBuffer buff = ByteBuffer.allocate(File_Size);
        file_Channel.read(buff);
        buff.flip();
        while(buff.hasRemaining())
        {
            System.out.println((char)buff.get());
        }
    }
}
