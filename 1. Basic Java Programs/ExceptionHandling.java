public class ExceptionHandling
{
    public static void main(String [] args)
    {
        try
        {
            int age1 = 12,age2=0;
            int result = age1/age2;
            System.out.println("Result: "+result);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
