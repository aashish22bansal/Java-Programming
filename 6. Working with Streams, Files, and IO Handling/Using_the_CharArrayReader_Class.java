import java.io.*;

public class Using_the_CharArrayReader_Class
{
    public static void main(String args[])
    {
        char data[]={'T','h','i','s',' ','i','s',' ','a',' ','S','t','r','i','n','g'};
        CharArrayReader charArrayReader = new CharArrayReader(data);
        int character = 0;
        while(true)
        {
            try {
                if (!((character = charArrayReader.read())!=-1)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println((char)character);
        }
    }
}
