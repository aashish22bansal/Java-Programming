import java.io.*;
public class StringOverloading
{
    String add(String a, String b)
    {
        return (a+b);
    }
}
class StringOverload
{
    public static void main(String [] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x,y;
        System.out.print("Please enter the values: ");
        x=br.readLine();
        y=br.readLine();

        StringOverloading o1 = new StringOverloading();
        System.out.println("Result of the two values are: "+ o1.add(x,y));
    }
}
