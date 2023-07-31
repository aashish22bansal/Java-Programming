import java.io.*;

public class Working_with_Stream_Tokenizer_Class
{
    public static void main(String args[]) throws Exception
    {
        FileReader fileReader = new FileReader("Stream_Tokenizer.txt");
        StreamTokenizer streamTokenizer = new StreamTokenizer(fileReader);
        String instring;
        while(streamTokenizer.nextToken()!=StreamTokenizer.TT_EOF)
        {
            if(streamTokenizer.ttype == StreamTokenizer.TT_WORD)
            {
                System.out.println(streamTokenizer.sval);
            }
        }
        fileReader.close();
    }
}
