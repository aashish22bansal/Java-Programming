class NewThread implements Runnable
{
    String name;
    Thread thread;
    NewThread(String threadName)
    {
        name = threadName;
        thread = new Thread(this, name);
        System.out.println("New Thread: "+thread);
        thread.start();
    }
    public void run()
    {
        try
        {
            for(int i=100;i>95;i--)
            {
                System.out.println(name+": "+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException ie)
        {

        }
        System.out.println(name+" existing.");
    }
}
public class Understanding_Multiple_Threads
{
    public static void main(String args[])
    {
        new NewThread("1:");
        new NewThread("2:");
        new NewThread("3:");
        try
        {
            Thread.sleep(10000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Parent thread Interrupted.");
        }
        System.out.println("Parent thread exiting.");
    }
}
