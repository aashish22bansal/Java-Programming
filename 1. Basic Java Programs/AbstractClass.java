public abstract class AbstractClass
{
    abstract void motor();
}
class AbstractClasses extends AbstractClass
{
    void motor()
    {
        System.out.println("I love Corolla");
    }
    public static void main(String [] args)
    {
        AbstractClass toyota = new AbstractClasses();
        toyota.motor();
    }
}
