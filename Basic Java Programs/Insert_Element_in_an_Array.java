import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Insert_Element_in_an_Array
{
    public static void main(String [] args) throws IOException
    {
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
        System.out.println("Enter the Element to be Inserted: ");
        int insert = Integer.parseInt(br.readLine());
        System.out.print("Enter the prefered position: ");
        int pos = Integer.parseInt(br.readLine());
        for(int w=(MAX-1);w>=(pos-1);w--)
        {
            x[w+1]=x[w];
        }
        x[pos-1]=insert;
        System.out.print("The result after insertion is: ");
        for(int i=0;i<(MAX);i++)
        {
            System.out.print(x[i]+",");
        }
        System.out.print(x[MAX]);
         */
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the Array: ");
        x=sc.nextInt();
        int num1[] = new int[x+1];
        System.out.print("Enter the Array: ");
        for(int w=0;w<x;w++)
        {
            num1[w]=sc.nextInt();
        }
        System.out.print("Enter the position where the element should be inserted: ");
        y=sc.nextInt();
        System.out.print("Enter the element to be inserted: ");
        z=sc.nextInt();
        for(int w=(x-1);w>=(y-1);w--)
        {
            num1[w+1]=num1[w];
        }
        num1[y-1]=z;
        System.out.print("After inserting the Element: ");
        for(int w=0;w<x;w++)
        {
            System.out.print(num1[w]+",");
        }
        System.out.print(num1[x]);
    }
}
