import java.util.Arrays;
import java.util.Collections;

public class Minimum_and_Maximum_Element_in_an_Array
{
    public static void main(String [] args)
    {
        Integer[] num1 = {7,3,5,0,2,8,9,1};

        int min = (int)Collections.min(Arrays.asList(num1));
        int max = (int)Collections.max(Arrays.asList(num1));
        System.out.print("Minimum: "+min);
        System.out.print("Maximum: "+max);
    }
}
