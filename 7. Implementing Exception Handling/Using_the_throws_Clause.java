public class Using_the_throws_Clause
{
    public static void chk_throw() throws IllegalAccessException
    {
        throw new IllegalAccessException("Exception");
    }
    public static void main(String args[])
    {
        try
        {
            chk_throw();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
    }
}
