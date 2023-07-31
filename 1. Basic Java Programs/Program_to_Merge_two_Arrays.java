import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_to_Merge_two_Arrays
{
    public static void main(String [] args)
    {
        String x[] = {"H","E","L","L","O"," "};
        String y[] = {"W","O","R","L","D"};

        List ls = new ArrayList(Arrays.asList(x));
        ls.addAll(Arrays.asList(y));

        Object[] z = ls.toArray();
        System.out.println(Arrays.toString(z));
    }
}
