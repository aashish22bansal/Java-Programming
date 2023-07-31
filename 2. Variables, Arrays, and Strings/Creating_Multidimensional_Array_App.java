public class Creating_Multidimensional_Array_App
{
    public static void main(String args[])
    {
        double array[][]={{1,2,3},{4,5,6,7},{8,9,10,11,12,13}};
        int sum=0,total=0;
        for(int outer_index=0;outer_index<array.length;outer_index++)
        {
            for(int inner_index=0;inner_index<array.length;inner_index++)
            {
                sum+=array[outer_index][inner_index];
                total++;
            }
        }
        System.out.println("Average array value = "+(sum/total));

    }
}
