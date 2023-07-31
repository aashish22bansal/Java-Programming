class Understanding_Static_Polymorphism
{
    void product(int x,int y)
    {
        System.out.println("Product of the two numbers is: "+(x*y));
    }
    void product(int x,int y,int z)
    {
        System.out.println("Product of the three numbers is: "+(x*y*z));
    }
    public static void main(String args[])
    {
        Understanding_Static_Polymorphism obj = new Understanding_Static_Polymorphism();
        obj.product(10,20);
        obj.product(10,20,30);
    }
}
