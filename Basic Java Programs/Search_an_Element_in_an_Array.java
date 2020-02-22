import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Search_an_Element_in_an_Array
{
    public static void main(String [] args) throws IOException
    {
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
        System.out.println("Enter the Element to be searched for: ");
        int search= Integer.parseInt(br.readLine());
        System.out.println("\nSearching for the Element in the Array: ");
        int index;
        index = Arrays.binarySearch(x, search);
        System.out.print("Element found at index: "+index);
    }
}