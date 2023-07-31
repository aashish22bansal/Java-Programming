public class Using_Parameterized_Constructors
{
    // declaring instance variables
    int x,y;
    Using_Parameterized_Constructors(int a,int b)
    {
        x=a;
        y=b;
    }
    public void multiply()
    {
        int n=x*y;
        System.out.println("Result after multiplication is: "+n);
    }
    public static void main(String args[])
    {
        Using_Parameterized_Constructors check = new Using_Parameterized_Constructors(2,3);
        check.multiply();
    }
}
