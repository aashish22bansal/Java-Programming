/*
* This enhanced construct allows you to automatically play through the elements of a collection or an array.
*/
import java.util.ArrayList;
public class The_for_each_loop
{
    public static void main(String args[])
    // args command line arguments
    {
        double array[]={2.4,2.5,45.6,45.5,56.3,2.6,4.6,4.5,7};
        // leave details of the loop such as indices out of the picture
        for(double d:array)
        {
            System.out.println(d);
        }
        System.out.println("---------------------------");
        ArrayList<Integer> list = new ArrayList<Integer>(); // DYNAMIC ARRAY
        list.add(7);
        list.add(15);
        list.add(-67);
        for(Integer number:list)
        {
            System.out.println(number);
        }
        System.out.println("----------------------------");
        // works identically with autounboxing
        for(int item:list)
        {
            System.out.println(item);
        }
        System.out.println("----------------------------");
    }
}
