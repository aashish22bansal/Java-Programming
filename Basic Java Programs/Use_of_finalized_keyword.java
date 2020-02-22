class First1
{
    int x;
    public First1(int x)
    {
        this.x=x;
    }
    protected void finalize() throws Throwable
    {
        System.out.println("Welcome to finalize keyword in Java Programming"+x);
    }
}
public class Use_of_finalized_keyword
{
    public static void main(String [] args)
    {
        First1 f1 = new First1(100);
        First1 f2 = new First1(200);

        f1=f2;
        System.gc();
        System.out.println("Hello world!");
    }
}
