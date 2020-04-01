public class ThreadDemo
{
    public static void main(String args[])
    {
        Creating_a_Thread_with_the_Thread_Class creating_a_thread_with_the_thread_class = new Creating_a_Thread_with_the_Thread_Class();
        try
        {
            for(int loop_index=0;loop_index<10;loop_index++)
            {
                System.out.println((Thread.currentThread()).getName()+" threads here...");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException ie)
        {

        }
    }
}
