interface Output
{
    void display();
}
public class InterfaceSample implements Output
{
    public void display()
    {
        System.out.println("This is sample of interface class");
    }
    public static void main(String [] args)
    {
        InterfaceSample face = new InterfaceSample();
        face.display();
    }
}
