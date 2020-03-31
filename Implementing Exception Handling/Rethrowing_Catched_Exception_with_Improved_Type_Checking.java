import java.io.*;

class aException extends Exception
{

}
class bException extends Exception
{

}
public class Rethrowing_Catched_Exception_with_Improved_Type_Checking
{
    public void rethrowExceptionMethod(String eName) throws aException,bException
    {
        try
        {
            if(eName.equals("aException"))
            {
                System.out.println("a Exception is thrown");
                throw new aException();
            }
            else
            {
                System.out.println("b Exception is thrown.");
                throw new bException();
            }
        }
        catch(Exception e)
        {
            throw e;
        }
    }
    public static void main(String args[]) throws aException,bException
    {
        new Rethrowing_Catched_Exception_with_Improved_Type_Checking().rethrowExceptionMethod("aException");
    }
}
