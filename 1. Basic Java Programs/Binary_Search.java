import java.util.Scanner;

public class Binary_Search
{
    public static void main(String args[])
    {
        int i,first,last,middle,n,search,array[];
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n=in.nextInt();
        array = new int[n];
        System.out.print("Enter the elements of the array[IN SORTED ORDER]: \n");
        for(i=0;i<n;i++)
        {
            System.out.print("Element "+(i+1)+" : ");
            array[i]=in.nextInt();
        }
        System.out.print("Enter the element to be searched for in the array: ");
        search=in.nextInt();
        first=0;
        last=n-1;
        for(i=0;i<n;i++)
        {
            middle = (first + last) / 2;
            if (array[middle] < search)
            {
                first = middle + 1;
            }
            else if (array[middle] == search)
            {
                System.out.print("The element " + search + " was found at location " + (middle + 1) + ".");
                break;
            }
            else
            {
                last = middle + 1;
            }
        }
        if((search<first)&&(search>last))
        {
            System.out.print("The element "+search+" was not present in the list.");
        }
    }
}
