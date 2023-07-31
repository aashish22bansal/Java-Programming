public class Synchronizing_Threads
{
    public static void main(String args[])
    {
        Shared shared = new Shared();
        Custom_worked_Thread custom_worked_thread1 = new Custom_worked_Thread(shared,"One");
        Custom_worked_Thread custom_worked_thread2 = new Custom_worked_Thread(shared,"Two");
        Custom_worked_Thread custom_worked_thread3 = new Custom_worked_Thread(shared,"Three");
        Custom_worked_Thread custom_worked_thread4 = new Custom_worked_Thread(shared,"Four");
        try
        {
            custom_worked_thread1.join();
            custom_worked_thread2.join();
            custom_worked_thread3.join();
            custom_worked_thread4.join();
        }
        catch(InterruptedException ie)
        {

        }
    }
}
class Custom_worked_Thread extends Thread
{
    Shared shared;
    public Custom_worked_Thread(Shared shared,String string)
    {
        super(string);
        this.shared = shared;
        start();
    }
    public void run()
    {
        shared.dowork(Thread.currentThread().getName());
    }
}
class Shared
{
    void dowork(String string)
    {
        System.out.println("Starting "+string);
        try
        {
            Thread.sleep((long)(Math.random()*500));
        }
        catch(InterruptedException ie)
        {

        }
        System.out.println("Ending "+string);
    }
}
