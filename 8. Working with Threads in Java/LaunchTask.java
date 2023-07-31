public class LaunchTask implements Runnable
{
    private int start;
    private String message;
    public LaunchTask(int start,String message)
    {
        this.start = start;
        this.message = message;
    }
    public void run()
    {
        try
        {
            Thread.sleep(20000-(start*1000));
        }
        catch (InterruptedException ie)
        {

        }
        System.out.println(message);
    }
}
