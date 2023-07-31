import java.io.*;

public class Using_the_FileReader_Class
{
    public static void main(String args[]) throws IOException
    {
        String filename = null;
        String content = null;
        try
        {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader BR = new BufferedReader(inputStreamReader);
            System.out.print("Enter the name of the File with extension: ");
            filename = BR.readLine();
            System.out.println(filename);
            System.out.print("Enter some content for the File: ");
            content = BR.readLine();
            System.out.println("The content written to the Files is: "+content);
        }
        catch(IOException e)
        {

        }
        char data[] = new char[1024];
        //byte data[] = content.getBytes();
        try
        {
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            fileOutputStream.write(Integer.parseInt(content));
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        FileReader fileReader = new FileReader(filename);
        int charsread = fileReader.read(data);
        System.out.println(new String(data,0,charsread));
        fileReader.close();
    }
}
