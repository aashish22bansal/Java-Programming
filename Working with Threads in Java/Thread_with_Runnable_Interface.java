class Thread_with_Runnable_Interface implements Runnable
{
    Thread thread;
    Thread_with_Runnable_Interface()
    {
        thread = new Thread(this,"second");
        System.out.println("Starting Child Thread.");
        thread.start();
    }
    public void run()
    {
        try
        {
            (Thread.currentThread()).setName("Child");
            for(int loop_index=0;loop_index<10;loop_index++)
            {
                System.out.println((Thread.currentThread()).getName()+" thread here...\n");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException ie)
        {
            System.out.println("Second thread ending.");
        }
    }
}
class Runnable_for_Threads
{
    public static void main(String args[])
    {
        System.out.println("Starting Parent Thread!");
        Thread_with_Runnable_Interface thread_with_runnable_interface = new Thread_with_Runnable_Interface();
        try
        {
            (Thread.currentThread()).setName("Parent");
            for(int loop_index=0;loop_index<10;loop_index++)
            {
                System.out.println((Thread.currentThread()).getName()+" thread here....\n");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException ie)
        {
            System.out.println("parent Thread Ending");
        }
    }
}