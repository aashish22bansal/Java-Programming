public class Use_of_final_keyword_as_a_method
{
    final void display()
    {
        System.out.println("This is a final method");
    }
}
class Hello extends Use_of_final_keyword_as_a_method
{
    public static void main(String [] args)
    {
        Hello h1 = new Hello();
        h1.display();
    }
}
