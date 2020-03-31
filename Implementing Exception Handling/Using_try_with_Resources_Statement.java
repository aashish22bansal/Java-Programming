import java.io.*;

public class Using_try_with_Resources_Statement
{
    public static void main(String args[])
    {
        Using_try_with_Resources_Statement RD = new Using_try_with_Resources_Statement();
        RD.demo();
    }
    public void demo()
    {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(("/*File Location*/"))))
        {
            String str = bufferedReader.readLine();
            System.out.println(str);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
