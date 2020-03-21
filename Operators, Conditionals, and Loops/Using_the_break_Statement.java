public class Using_the_break_Statement
{
    public static void main(String args[])
    {
        double array[][]={{1,2,3},{4,5,6}};
        int sum=0;
        outer:
            for(int outer_index=0;outer_index<array.length;outer_index++)
            {
                for(int inner_index=0;inner_index<array[outer_index].length;inner_index++)
                {
                    sum+=array[outer_index][inner_index];
                    if(sum>3)
                    {
                        break outer;
                    }
                }
                System.out.println("I am not going to print.");
            }
        System.out.println("The loop has finished.");
    }
}
