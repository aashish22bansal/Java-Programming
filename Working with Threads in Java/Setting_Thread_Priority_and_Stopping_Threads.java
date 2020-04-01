class Counter implements Runnable
{
    Thread thread;
    int counter=0;
    volatile boolean goflag;
    public Counter(int p)
    {
        thread = new Thread(this);
        thread.setPriority(p);
    }
    public void start()
    {
        goflag = true;
        thread.start();
    }
    public void run()
    {
        while(goflag)
        {
            counter++;
        }
    }
    public void end()
    {
        goflag=false;
    }
}
class Setting_Thread_Priority_and_Stopping_Threads
{
    public static void main(String args[])
    {
        Counter thread1 = new Counter(Thread.NORM_PRIORITY + 2);
        Counter thread2 = new Counter(Thread.NORM_PRIORITY + 1);
        Counter thread3 = new Counter(Thread.NORM_PRIORITY - 1);
        Counter thread4 = new Counter(Thread.NORM_PRIORITY - 2);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ie)
        {

        }
        thread1.end();
        thread2.end();
        thread3.end();
        thread4.end();
        System.out.println("Thread 1 is counted: "+thread1.counter);
        System.out.println("Thread 2 is counted: "+thread2.counter);
        System.out.println("Thread 3 is counted: "+thread3.counter);
        System.out.println("Thread 4 is counted: "+thread4.counter);
    }
}
