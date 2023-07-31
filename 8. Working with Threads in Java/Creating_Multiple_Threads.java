class CustomThread extends Thread
{
    CustomThread(String name)
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
        catch (InterruptedException ie)
        {

        }
        System.out.println((Thread.currentThread()).getName()+" thread ends.");
    }
}
class Creating_Multiple_Threads
{
    public static void main(String args[])
    {
        CustomThread thread1 = new CustomThread("First");
        CustomThread thread2 = new CustomThread("Second");
        CustomThread thread3 = new CustomThread("Third");
        CustomThread thread4 = new CustomThread("Fourth");
        try
        {
            for(int loop_index=0;loop_index<10;loop_index++)
            {
                System.out.println((Thread.currentThread()).getName()+" thread here...");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException ie)
        {

        }
    }
}
