class CustomisedThread extends Thread
{
    CustomisedThread(String name)
    {
        super(name);
        start();
    }
    public void run()
    {
        try
        {
            for(int loop_index=0;loop_index<10;loop_index++)
            {
                System.out.println((Thread.currentThread()).getName()+" thread here...");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException ie)
        {

        }
        System.out.println((Thread.currentThread()).getName()+" thread ends.");
    }
}
public class Checking_if_a_Thread_is_Alive
{
    public static void main(String args[])
    {
        CustomisedThread thread1 = new CustomisedThread("First");
        CustomisedThread thread2 = new CustomisedThread("Second");
        CustomisedThread thread3 = new CustomisedThread("Third");
        CustomisedThread thread4 = new CustomisedThread("Fourth");
        try
        {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        }
        catch(InterruptedException ie)
        {

        }
        System.out.println(thread1.isAlive());
    }
}
