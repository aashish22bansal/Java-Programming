class CustomThread2 extends Thread
{
    CustomThread2(String name)
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
class Joining_Threads
{
    public static void main(String args[])
    {
        CustomThread2 thread1 = new CustomThread2("First");
        CustomThread2 thread2 = new CustomThread2("Second");
        CustomThread2 thread3 = new CustomThread2("Third");
        CustomThread2 thread4 = new CustomThread2("Fourth");
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
    }
}
