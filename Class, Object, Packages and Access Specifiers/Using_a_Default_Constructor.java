public class Using_a_Default_Constructor
{
    // declaring instance variables
    int x,y;
    Using_a_Default_Constructor()
    {
        x=10;
        y=20;
    }
    public void multiply()
    {
        int n=x*y;
        System.out.println("Result after multiplication is: "+n);
    }
    public static void main(String args[])
    {
        Using_a_Default_Constructor check = new Using_a_Default_Constructor();
        check.multiply();
    }
}
