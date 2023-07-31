public class Using_the_Throw_Clause
{
    public static void main(String args[])
    {
        Using_the_Throw_Clause.chk_throw();
    }

    private static void chk_throw()
    {
        try
        {
            throw new NullPointerException("Explicit NullPointerException");
        }
        catch(NullPointerException ne)
        {
            System.out.println("Exception is "+ne);
        }
    }
}
