import java.io.*;
public class Using_the_BufferedReader_Class
{
    public static void main(String args[])throws IOException {
        FileReader fileReader = new FileReader("BufferedReader_Class.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String content= bufferedReader.readLine();
        while (content != null)
        {
            System.out.println(content);
        }
        fileReader.close();
    }
}
