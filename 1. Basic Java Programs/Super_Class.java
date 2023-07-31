class FirstSuper
{
    int x,y;
    FirstSuper(int a,int b)
    {
        x=a;
        y=b;
    }
    void show()
    {
        System.out.println("Value of x: "+x+" and y: "+y);
    }
}
class SecondSuper extends FirstSuper
{

    int z;
    SecondSuper(int a, int b, int c)
    {
        super(a, b);
        z=c;
    }
    void show()
    {
        super.show();
        System.out.println("Value of z: "+z);
    }
}
public class Super_Class
{
    public static void main(String [] args)
    {
        SecondSuper fs = new SecondSuper(100,200,300);
        fs.show();
    }
}
