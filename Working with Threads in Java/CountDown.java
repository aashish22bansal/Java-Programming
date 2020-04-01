public class CountDown
{
    public static void main(String args[])
    {
        Thread clock = new Countdown_Cloak_using_Threads();
        Runnable flood,ignition, liftoff;
        flood = new LaunchTask(16,"READY -> Flood the pad!");
        ignition = new LaunchTask(6,"STEADY -> Engine Start!");
        liftoff = new LaunchTask(0,"GO -> Liftoff");
        clock.start();
        new Thread(flood).start();
        new Thread(ignition).start();
        new Thread(liftoff).start();
    }
}