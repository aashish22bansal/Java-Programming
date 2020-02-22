import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Program_to_Reverse_an_Array
{
    public static void main(String [] args) throws IOException
    {

        ArrayList a1 = new ArrayList();
        a1.add("H");
        a1.add("E");
        a1.add("L");
        a1.add("L");
        a1.add("O");

        /*
        int MAX = 10;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of elements in the Array: ");
        MAX = Integer.parseInt(br.readLine());
        int x[] = new int[MAX];
        System.out.println("Enter the Array: ");
        for (int i = 0; i < MAX; i++)
        {
            System.out.print("Element " + (i + 1) + " : ");
            x[i] = Integer.parseInt(br.readLine());
        }

         */
        System.out.print("Before reversing the Array: "+a1);
        /*
        for (int i = 0; i < MAX; i++)
        {
            System.out.println("Element " + (i + 1) + " : "+ x[i]);
            //x[i] = Integer.parseInt(br.readLine());
        }

         */
        Collections.reverse(a1);
        System.out.print("After reversing the Array: "+a1);
        /*
        for (int i = 0; i < MAX; i++)
        {
            System.out.println("Element " + (i + 1) + " : "+ x[i]);
            //x[i] = Integer.parseInt(br.readLine());
        }

         */
    }
}
