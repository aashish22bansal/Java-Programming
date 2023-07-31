public class Pausing_a_Thread
{
    public static void main(String args[])
    {
        try
        {
            System.out.print("Welcome ");
            Thread.sleep(1000);
            System.out.print("to ");
            Thread.sleep(1000);
            System.out.print("Java ");
            Thread.sleep(1000);
            System.out.print("Programming");
        }
        catch(InterruptedException e)
        {

        }
    }
}
