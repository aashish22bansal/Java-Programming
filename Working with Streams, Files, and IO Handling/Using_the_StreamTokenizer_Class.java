import java.io.*;

public class Using_the_StreamTokenizer_Class
{
    public static void main(String args[]) throws Exception
    {
        FileReader fileReader = new FileReader("StreamTokenizer.txt");
        StreamTokenizer streamTokenizer = new StreamTokenizer(fileReader);
        String instring;
        while(streamTokenizer.nextToken() != StreamTokenizer.TT_EOF)
        {
            if(streamTokenizer.ttype == StreamTokenizer.TT_WORD)
            {
                System.out.println(StreamTokenizer.sval());
            }
        }
        fileReader.close();
    }
}
