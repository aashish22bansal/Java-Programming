public class Using_Multiple_Catch_Blocks
{
    public static void main(String args[])
    {
        try
        {
            int a[] = {};
            System.out.println(a.length);
            for(int i=0;i<a.length;i++)
            {
                System.out.println("Value at position "+i+" is "+a[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException ao)
        {
            System.out.println("Array is out of bound.\nPlease check the upper bound of array.");
        }
        catch(Exception e)
        {
            System.out.println("Exception is "+e);
        }
    }
}
