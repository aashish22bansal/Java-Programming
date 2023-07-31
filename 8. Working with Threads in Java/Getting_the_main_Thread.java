public class Getting_the_main_Thread
{
    public static void main(String args[])
    {
        Thread thread = Thread.currentThread();
        System.out.println("The name of main thread is \""+thread.getName()+"\"");
    }
}
