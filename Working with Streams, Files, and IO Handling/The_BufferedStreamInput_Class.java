import java.io.*;
import java.util.Scanner;

public class The_BufferedStreamInput_Class
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the content to enter the Buffered Stream Input: ");
        String content = sc.nextLine();
        byte data[] = content.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        BufferedInputStream bufferedinputstream = new BufferedInputStream(in);
        int character;
        boolean silentflag=false;
        while((character = bufferedinputstream.read()) != -1)
        {
            switch(character)
            {
                case '#':
                    if(silentflag)
                    {
                        silentflag = false;
                    }
                    else
                    {
                        silentflag = true;
                        bufferedinputstream.mark(100);
                    }
                    break;
                case ' ':
                    if(silentflag)
                    {
                        silentflag = false;
                        System.out.println("#");
                        bufferedinputstream.reset();
                    }
                    else
                    {
                        System.out.println((char)character);
                    }
                    break;
                default:
                    if(!silentflag)
                    {
                        System.out.println((char)character);
                    }
            }
        }
    }
}
