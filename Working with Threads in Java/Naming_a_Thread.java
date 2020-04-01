public class Naming_a_Thread
{
    public static void main(String args[])
    {
        Thread thread = Thread.currentThread();
        System.out.println("main thread's original name is : "+thread.getName());
        thread.setName("Java Programming");
        System.out.println("Main thread's name is now "+thread.getName());
    }
}
