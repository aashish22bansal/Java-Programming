import java.io.*;

public class Accepting_Input_from_keyboard_using_InputStreamReader_Class
{
    public static void main(String args[])
    {
        try
        {
            String character;
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader BR = new BufferedReader(inputStreamReader);
            System.out.print("Enter some text: ");
            character = BR.readLine();
            System.out.println(character);
        }
        catch(IOException e)
        {

        }
    }
}
