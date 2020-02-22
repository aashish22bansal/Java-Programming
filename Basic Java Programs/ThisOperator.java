public class ThisOperator
{
    ThisOperator()
    {
        System.out.println();
    }
    public void hello()
    {
        System.out.println("This is sample here.");
    }
    public void motor()
    {
        System.out.println("This is all about THIS");
        this.hello();
        this.hello();
    }
    public static void main(String [] args)
    {
        ThisOperator move = new ThisOperator();
        move.motor();
    }
}
