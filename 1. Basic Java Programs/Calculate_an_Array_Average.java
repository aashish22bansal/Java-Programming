import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculate_an_Array_Average
{
    public static void main(String [] args) throws IOException
    {
        int[] x = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<10;i++)
        {
            System.out.print("ELement "+(i+1)+" : ");
            x[i]= Integer.parseInt(br.readLine());
        }
        double sum = 0;
        for(int i=0;i<10;i++)
        {
            sum+=x[i];
        }
        double average = sum/10;
        System.out.print("The average of the array is: "+average);
    }
}
