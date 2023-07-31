import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pascal_Triangle
{
    public static void main(String [] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of rows: ");
        int len= Integer.parseInt(br.readLine());
        System.out.println("\n\n\n");
        for(int x=0;x<len;x++)
        {
            int num1=1;
            System.out.format("%"+(x-len)*2 +"s","");
            for(int y=0;y<=x;y++)
            {
                System.out.format("%4d",num1);
                num1=num1*(x-y)/(y+1);
            }
            System.out.println();
        }
    }
}
