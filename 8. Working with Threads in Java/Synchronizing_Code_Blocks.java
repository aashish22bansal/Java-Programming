class Synchronizing_Code_Blocks
{
    public static void main(String args[])
    {
        Shared_Code shared_code = new Shared_Code();
        Custom_work_Thread custom_work_thread1 = new Custom_work_Thread(shared_code,"One");
        Custom_work_Thread custom_work_thread2 = new Custom_work_Thread(shared_code,"Two");
        Custom_work_Thread custom_work_thread3 = new Custom_work_Thread(shared_code,"Three");
        Custom_work_Thread custom_work_thread4 = new Custom_work_Thread(shared_code,"Four");
        try
        {
            custom_work_thread1.join();
            custom_work_thread1.join();
            custom_work_thread1.join();
            custom_work_thread1.join();
        }
        catch(InterruptedException ie)
        {

        }
    }
}
class Custom_work_Thread extends Thread
{
    Shared_Code shared_code = new Shared_Code();
    public Custom_work_Thread(Shared_Code shared_code,String string)
    {
        super(string);
        this.shared_code = shared_code;
        start();
    }
    public void run()
    {
        synchronized (shared_code)
        {
            shared_code.dowork(Thread.currentThread().getName());
        }
    }
}
class Shared_Code
{
    void dowork(String string)
    {
        System.out.println("Stop "+string);
        try
        {
            Thread.sleep((long)(Math.random()*500));
        }
        catch (InterruptedException ie)
        {

        }
    }
}