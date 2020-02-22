import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_to_Print_Prime_Numbers
{
    public static void main(String [] args) throws IOException
    {// IT IS ALMOST SIEVE OF ERATHOSTHENES.
        int x=0,num1=0;
        String pnum = "";
        System.out.print("Enter the limit: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num2 = Integer.parseInt(br.readLine());
        for(x=1;x<=num2;x++)
        {
            int primecount=0;
            for(num1=x;num1>=1;num1--)
            {
                if(x%num1==0)
                {
                    primecount++;
                }
            }
            if(primecount==2)
            {
                System.out.println(x+" is a prime number.");
            }
        }
    }
}
