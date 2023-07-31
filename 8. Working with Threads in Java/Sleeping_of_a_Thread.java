class Sleeping_of_a_Thread implements Runnable
{
    String string;
    Thread thread;
    Sleeping_of_a_Thread(String threadname)
    {
        string = threadname;
        thread = new Thread(this, string);
        System.out.println("New Thread: "+thread);
        thread.start();
    }
    public void run()
    {
        try
        {
            for(int j = 75;j>50;j--)
            {
                System.out.println(string+": "+j);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException ie)
        {
            System.out.println(string+" breaking up...");
        }
        System.out.println(string+" finishing...");
    }
}
class sleep
{
    public static void main(String args[]) {
        Sleeping_of_a_Thread object1 = new Sleeping_of_a_Thread("1");
        Sleeping_of_a_Thread object2 = new Sleeping_of_a_Thread("2");
        try
        {
            Thread.sleep(1500);
            object1.thread.suspend();
            System.out.println("Thread 1's sleeping in progress.");
            Thread.sleep(1500);
            object1.thread.resume();
            System.out.println("Waking Up Thread 1.");
            object2.thread.suspend();
            System.out.println("Thread 2 starting to sleep...");
            Thread.sleep(1500);
            object2.thread.resume();
            System.out.println("Waking Up Thread 2.");
        }
        catch(InterruptedException ie)
        {
            System.out.println("Main Thread Broken");
        }
        try
        {
            System.out.println("Waiting for threads to finish.");
            object1.thread.join();
            object2.thread.join();
        }
        catch (InterruptedException ie)
        {
            System.out.println("Main thread Broken");
        }
        System.out.println("Finishing main thread.");
    }
}