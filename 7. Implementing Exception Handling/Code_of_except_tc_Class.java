public class Code_of_except_tc_Class
{
    public static void main(String args[])
    {
        try
        {
            int x=5;
            int y=0;
            int z=x/y;
            System.out.println("Result of the program is: "+z);
        }
        catch(Exception e)
        {
            System.out.println("Exception is "+e);
            System.out.println("A number can not be divided by zero.");
        }
    }
}
