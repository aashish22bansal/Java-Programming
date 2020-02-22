import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Print_out_String_Arrays
{
    public static void main(String [] args)
    {
        String st[] = new String[7];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Array: ");
        for(int x=0;x<7;x++)
        {
            try
            {
                st[x]=br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Result of String Array: ");
        for(int x=0;x<5;x++)
        {
            System.out.print(" "+st[x]);
        }
    }
}