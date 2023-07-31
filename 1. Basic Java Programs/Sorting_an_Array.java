import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sorting_an_Array
{
    public static void main(String [] args) throws IOException
    {
        int MAX=10;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of elements in the Array: ");
        MAX= Integer.parseInt(br.readLine());
        int x[] = new int[MAX];
        System.out.println("Enter the Array: ");
        for(int i=0;i<MAX;i++)
        {
            System.out.print("Element "+(i+1)+" : ");
            x[i]= Integer.parseInt(br.readLine());
        }
        System.out.println("\nSorting the Array: ");
        Arrays.sort(x);
        printArray("The sorted array is: ",x);
    }

    private static void printArray(String s, int[] x)
    {
        for(int y=0;y<x.length;y++)
        {
            if(y!=0)
            {
                System.out.print(",");
            }
            System.out.print(x[y]);
        }
        System.out.println();
    }
}
